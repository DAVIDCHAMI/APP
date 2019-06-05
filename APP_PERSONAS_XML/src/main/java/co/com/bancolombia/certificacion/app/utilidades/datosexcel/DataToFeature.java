
package co.com.bancolombia.certificacion.app.utilidades.datosexcel;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import co.com.bancolombia.certificacion.app.errors.exceptions.PropertiesDoesNotLoadException;
import co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

/**
 * Ingresa los datos obtenidos del archivo de Excel al archivo feature del cual
 * se está llamando
 *
 * @since 25/04/2018
 * @author carmarlo
 *
 */
public class DataToFeature {

	private DataToFeature() {
		throw new IllegalStateException(TipoClaseConstante.UTILITY_CLASS);
	}

	/**
	 * Ingresa los datos obtenidos de un excel al archivo .feature del cual se est�
	 * llamando, hace que se genere la tabla en el escenario Outline como Data Table
	 *
	 * @since 27/11/2017
	 * @author bgaona
	 * @param featureFile Nombre del archivo .feature el cual se modificar�, debe
	 *                    tener la ruta del archivo y la hoja ser usada
	 * @return
	 * @throws InvalidFormatException
	 * @throws IOException
	 */

	private static List<String> setExcelDataToFeature(File featureFile) throws IOException {
		List<String> fileData = new ArrayList<>();
		try (BufferedReader buffReader = new BufferedReader(
				new InputStreamReader(new BufferedInputStream(new FileInputStream(featureFile)), "UTF-8"))) {
			String data;
			List<Map<String, String>> excelData = null;
			boolean foundHashTag = false;
			boolean featureData = false;
			boolean esUnRango = false;
			boolean esMultiple = false;
			boolean esRangoDefinido = false;

			while ((data = buffReader.readLine()) != null) {
				String[] dataVector = null;
				String[] dataVectorRango = null;
				String sheetName = null;
				String excelFilePath = null;
				int filaSeleccionada = 0;
				int pos = 0;

				if (data.trim().contains("##@externaldata")) {
					dataVector = data.trim().split("@");
					excelFilePath = dataVector[2];
					sheetName = dataVector[3];

					if (dataVector.length == 4) {
						esUnRango = true;
					}

					if (dataVector.length == 5) {
						if (dataVector[4].contains("-")) {
							dataVectorRango = dataVector[4].trim().split("-");
							esRangoDefinido = true;
							filaSeleccionada = Integer.parseInt(dataVectorRango[pos]) - 1;
						} else if (dataVector[4].contains(",")) {
							dataVectorRango = dataVector[4].trim().split(",");
							esUnRango = true;
							esMultiple = true;
							filaSeleccionada = Integer.parseInt(dataVectorRango[pos]) - 1;
						} else {
							filaSeleccionada = Integer.parseInt(dataVector[4]) - 1;
						}
					}

					foundHashTag = true;
					fileData.add(data);
				}

				if (foundHashTag) {
					try {
						excelData = new LectorExcel().getData(excelFilePath, sheetName);
					} catch (Exception e) {
						throw new PropertiesDoesNotLoadException(e);
					}

					for (int rowNumber = filaSeleccionada; rowNumber < excelData.size() - 1; rowNumber++) {
						StringBuilder allCellData = new StringBuilder();
						String cellData = "";
						for (Entry<String, String> mapData : excelData.get(rowNumber).entrySet()) {
							if (dataVectorRango == null) {
								allCellData.append("   |" + mapData.getValue());
							} else {
								if (esRangoDefinido) {
									if (rowNumber < Integer.parseInt(dataVectorRango[1])) {
										allCellData.append("   |" + mapData.getValue());
									}
								} else {
									if (rowNumber + 1 == Integer.parseInt(dataVectorRango[pos]) && esUnRango) {
										allCellData.append("   |" + mapData.getValue());
									}

								}
							}
						}
						cellData = allCellData.toString();
						fileData.add(cellData + "|");
						if (!esUnRango && !esRangoDefinido) {
							rowNumber = excelData.size();
						}
						if (esMultiple) {
							if (pos + 1 < dataVectorRango.length) {
								filaSeleccionada = Integer.parseInt(dataVectorRango[pos + 1]) - 1;
								rowNumber = filaSeleccionada - 1;
								pos++;
							} else {
								rowNumber = excelData.size() - 1;
							}

						}
						if (esRangoDefinido) {
							if (rowNumber + 1 == Integer.parseInt(dataVectorRango[1])) {
								rowNumber = excelData.size() - 1;
								pos++;
							} else {
								pos++;
							}

						}

					}
					foundHashTag = false;
					featureData = true;
					continue;
				}

				if (data.startsWith("|") || data.endsWith("|")) {
					if (featureData) {
						continue;
					} else {
						fileData.add(data);
						continue;
					}
				} else {
					featureData = false;
				}
				fileData.add(data);
			}
		}
		return fileData;
	}

	/**
	 * Lista de todos los features con sus respectivos archivo de excel que se
	 * usar�n en la prueba
	 *
	 * @since 27/11/2017
	 * @author bgaona
	 * @param folder Carpeta donde estar�n los archivo .feature
	 * @return
	 */
	private static List<File> listOfFeatureFiles(File folder) {
		List<File> featureFiles = new ArrayList<>();
		if (folder.getName().endsWith(".feature")) {
			featureFiles.add(folder);
		} else {

			for (File fileEntry : folder.listFiles()) {
				if (fileEntry.isDirectory()) {
					featureFiles.addAll(listOfFeatureFiles(fileEntry));
				} else {
					if (fileEntry.isFile() && fileEntry.getName().endsWith(".feature")) {
						featureFiles.add(fileEntry);
					}
				}
			}
		}
		return featureFiles;
	}

	/**
	 * Hace una lista con todos los features dependiendo de la ruta asignada
	 *
	 * @since 27/11/2017
	 * @author bgaona
	 * @param featuresDirectoryPath Ruta donde se encuentran los features que
	 *                              tendr�n las tablas
	 * @throws IOException
	 * @throws InvalidFormatException
	 */
	public static void overrideFeatureFiles(String featuresDirectoryPath) throws IOException {
		List<File> listOfFeatureFiles = listOfFeatureFiles(new File(featuresDirectoryPath));
		for (File featureFile : listOfFeatureFiles) {
			List<String> featureWithExcelData = setExcelDataToFeature(featureFile);
			try (BufferedWriter writer = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(featureFile), "UTF-8"));) {
				for (String string : featureWithExcelData) {
					writer.write(string);
					writer.write("\n");
				}
			}
		}
	}
}
