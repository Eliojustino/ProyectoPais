/** *************************************
 * Autor: Elio Justino Cruz Ortega     *
 * Creado: 17/05/2023                  *
 * Modificado: 23/05/2023              *
 * Descripciòn: Se crea la clase padre *
 *              Localidad              *
 ************************************** */
package entity;

/**
 * Clase que representa los datos generales de una entidad.
 *
 * <p>
 * Esta clase sirve como clase padre para otras clases que compartan atributos comunes.</p>
 */
public class DatosGenerales {

    private String nombre;
    private int codigo;
    private String capital;
    private String frontera;

    /**
     * Crea una instancia de DatosGenerales sin inicializar los atributos.
     */
    public DatosGenerales() {}

    /**
     * Crea una instancia de DatosGenerales con los atributos especificados.
     *
     * @param nombre el nombre de la entidad
     * @param codigo el código de la entidad
     * @param capital la capital de la entidad
     * @param frontera la frontera de la entidad
     */
    public DatosGenerales(String nombre, int codigo, String capital, String frontera) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.capital = capital;
        this.frontera = frontera;
    }

    /**
     * Obtiene el nombre de la entidad.
     *
     * @return el nombre de la entidad
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la entidad.
     *
     * @param nombre el nombre de la entidad
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el código de la entidad.
     *
     * @return el código de la entidad
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Establece el código de la entidad.
     *
     * @param codigo el código de la entidad
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene la capital de la entidad.
     *
     * @return la capital de la entidad
     */
    public String getCapital() {
        return capital;
    }

    /**
     * Establece la capital de la entidad.
     *
     * @param capital la capital de la entidad
     */
    public void setCapital(String capital) {
        this.capital = capital;
    }

    /**
     * Obtiene la frontera de la entidad.
     *
     * @return la frontera de la entidad
     */
    public String getFrontera() {
        return frontera;
    }

    /**
     * Establece la frontera de la entidad.
     *
     * @param frontera la frontera de la entidad
     */
    public void setFrontera(String frontera) {
        this.frontera = frontera;
    }

    /**
     * Devuelve una representación en cadena de los datos generales.
     *
     * @return una cadena que representa los datos generales
     */
    @Override
    public String toString() {
        return "DatosGenerales{" + "nombre=" + nombre + ", codigo=" + codigo + ", capital=" + capital + ", frontera=" + frontera + '}';
    }   
}

