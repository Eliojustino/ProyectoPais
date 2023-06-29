/** *************************************
 * Autor: Elio Justino Cruz Ortega     *
 * Creado: 16/05/2023                  *
 * Modificado: 25/05/2023              *
 * Descripciòn: Se crea la clase Pais  *
 ************************************** */
package entity;

/**
 * Esta clase representa un país.
 */
public class Pais extends DatosGenerales {

    /**
     * Constructor por defecto de la clase Pais.
     */
    public Pais() {
    }

    /**
     * Constructor de la clase Pais con parámetros.
     *
     * @param nombre el nombre del país
     * @param codigo el código del país
     * @param capital la capital del país
     * @param frontera las fronteras del país
     */
    public Pais(int codigo, String nombre, String capital, String frontera) {
        super(nombre, codigo, capital, frontera);
    }

    /**
     * Establece el código del país.
     */
    public void setCodigo() {
    }

    /**
     * Obtiene el código del país.
     */
    public void getCodifo() {

    }

}
