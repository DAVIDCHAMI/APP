package co.com.bancolombia.certificacion.app.models.entities;


import co.com.bancolombia.certificacion.app.models.product.ProductFactory;
import co.com.bancolombia.certificacion.app.models.product.ProductFactoryMethod;
import co.com.bancolombia.certificacion.app.models.transaction.Transferencias;
import co.com.bancolombia.certificacion.app.models.products.Product;

import java.util.List;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.AdministradorConstante.TRANSACTION_CODE_ACH;


/**
 * The type Current transferencias entity.
 */
public class CargarEntidadTransferencias {
    private static Transferencias transferencias;

    private CargarEntidadTransferencias() {

    }

    /**
     * Gets transferencias.
     *
     * @return the transferencias
     */
    public static Transferencias getTransferencias() {
        return transferencias;
    }

    /**
     * Sets transferencias.
     *
     * @param data the data
     */
    public static void setTransferencias(List<String> data) {
        Transferencias transferencias = new Transferencias();
        ProductFactoryMethod productFactory = new ProductFactory();

        Product originProduct = productFactory.createProduct(data.get(0), data.get(1));
        Product destinationProduct = productFactory.createProduct(data.get(2), data.get(3));
        transferencias.setOriginProduct(originProduct);
        transferencias.setDestinationProduct(destinationProduct);
        transferencias.setAmount(data.get(4));

        if (CargarEntidadTransaccion.getConfiguracionTransaccion().getTransactionCode().equals(TRANSACTION_CODE_ACH)) {
            transferencias.setBank(data.get(5));
            transferencias.setDescription(data.get(6));
            transferencias.setAdditionalInformation(data.get(7));
        }
        
        CargarEntidadTransferencias.transferencias = transferencias;
    }

}
