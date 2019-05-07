package co.com.bancolombia.certificacion.app.models.movimiento;

/**
 * The type Movimiento.
 */
public class Movimiento {

    private String date;
    private String movementValue;
    private String nature;
    private String code;
    private String description;
    private String valuePerUnit;
    private String numberOfUnits;


    /**
     * Gets date.
     *
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Gets movimiento value.
     *
     * @return the movimiento value
     */
    public String getMovementValue() {
        return movementValue;
    }

    /**
     * Sets movimiento value.
     *
     * @param movementValue the movimiento value
     */
    public void setMovementValue(String movementValue) {
        this.movementValue = movementValue;
    }

    /**
     * Gets nature.
     *
     * @return the nature
     */
    public String getNature() {
        return nature;
    }

    /**
     * Sets nature.
     *
     * @param nature the nature
     */
    public void setNature(String nature) {
        this.nature = nature;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets value per unit.
     *
     * @return the value per unit
     */
    public String getValuePerUnit() {
        return valuePerUnit;
    }

    /**
     * Sets value per unit.
     *
     * @param valuePerUnit the value per unit
     */
    public void setValuePerUnit(String valuePerUnit) {
        this.valuePerUnit = valuePerUnit;
    }

    /**
     * Gets number of units.
     *
     * @return the number of units
     */
    public String getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Sets number of units.
     *
     * @param numberOfUnits the number of units
     */
    public void setNumberOfUnits(String numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

}
