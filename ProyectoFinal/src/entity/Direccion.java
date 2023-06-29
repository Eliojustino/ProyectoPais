/** *************************************
 * Autor: Elio Justino Cruz Ortega     *
 * Creado: 16/05/2023                  *
 * Modificado: 23/05/2023              *
 * Descripciòn: Se crea la clase       *
 *              Dirección              *
 ************************************** */
package entity;

/**
 * Clase que representa una dirección y hereda los atributos generales de {@link DatosGenerales}.
 *
 * <p>
 * Esta clase agrega los atributos específicos de una dirección, como la colonia, calle, número de casa y código postal.</p>
 */
public class Direccion extends DatosGenerales {

    private String colonia;
    private String calle;
    private String numCasa;
    private String codPostal;
    private Pais pais;
    private Estado estado;

    /**
     * Crea una instancia de Direccion sin inicializar los atributos.
     */
    public Direccion() {

    }

    /**
     * Crea una instancia de Direccion con los atributos especificados.
     *
     * @param nombre el nombre de la entidad
     * @param codigo el código de la entidad
     */
    public Direccion(String nombre, String codigo) {
        super();
    }

    /**
     * Obtiene la colonia de la dirección.
     *
     * @return la colonia de la dirección
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * Establece la colonia de la dirección.
     *
     * @param colonia la colonia de la dirección
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * Obtiene la calle de la dirección.
     *
     * @return la calle de la dirección
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Establece la calle de la dirección.
     *
     * @param calle la calle de la dirección
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene el número de casa de la dirección.
     *
     * @return el número de casa de la dirección
     */
    public String getNumCasa() {
        return numCasa;
    }

    /**
     * Establece el número de casa y código postal de la dirección.
     *
     * @param numCasa el número de casa de la dirección
     */
    public void setNumCasa(String numCasa) {
        this.numCasa = numCasa;
    }

    /**
     * Obtiene el código postal de la dirección.
     *
     * @return el código postal de la dirección
     */
    public String getCodPostal() {
        return codPostal;
    }

    /**
     * Establece el código postal de la dirección.
     *
     * @param codPostal el código postal de la dirección
     */
    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    /**
     * Obtiene el país al que pertenece la dirección.
     *
     * @return el país al que pertenece la dirección
     */
    public Pais getPais() {
        return pais;
    }

    /**
     * Establece el país al que pertenece la dirección.
     *
     * @param pais el país al que pertenece la dirección
     */
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    /**
     * Obtiene el estado al que pertenece la dirección.
     *
     * @return el estado al que pertenece la dirección
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * Establece el estado al que pertenece la dirección.
     *
     * @param estado el estado al que pertenece la dirección
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    /**
     * Establece el código de la dirección.
     *
     * @param codigoDireccion el código de la dirección
     */
    public void setCodigo(String codigoDireccion) {

    }
}

