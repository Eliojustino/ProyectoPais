/** *************************************
 * Autor: Elio Justino Cruz Ortega     *
 * Creado: 16/05/2023                  *
 * Modificado: 25/05/2023              *
 * Descripción: Se crea la clase Estado*
 ************************************** */
package entity;

/**
 * Clase que representa un estado y hereda los atributos generales de
 * {@link DatosGenerales}.
 *
 * <p>
 * Esta clase agrega los atributos específicos de un estado, como el número de
 * estado y el país al que pertenece.</p>
 */
public class Estado extends DatosGenerales {

    private int numEstado;
    private Pais pais;

    /**
     * Crea una instancia de Estado sin inicializar los atributos.
     */
    public Estado() {

    }

    /**
     * Crea una instancia de Estado con los atributos especificados.
     *
     * @param nombre el nombre del estado
     * @param codigo el código del estado
     * @param capital la capital del estado
     */
    public Estado(String nombre, String codigo, String capital) {
        super();
    }

    /**
     * Obtiene el número de estado.
     *
     * @return el número de estado
     */
    public int getNumEstado() {
        return numEstado;
    }

    /**
     * Establece el número de estado.
     *
     * @param numEstado el número de estado
     */
    public void setNumEstado(int numEstado) {
        this.numEstado = numEstado;
    }

    /**
     * Obtiene el país al que pertenece el estado.
     *
     * @return el país al que pertenece el estado
     */
    public Pais getPais() {
        return pais;
    }

    /**
     * Establece el país al que pertenece el estado.
     *
     * @param pais el país al que pertenece el estado
     */
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    /**
     * Establece el código del estado.
     */
    public void setCodigo() {

    }

   /**
     * Establece el código del estado.
     *
     * @param codigo el código del estado
     */
    public void setCodigo(String codigo) {

    }
}
