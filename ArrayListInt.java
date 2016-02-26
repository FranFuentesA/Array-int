import java.util.Arrays;
/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    // instance variables - replace the example below with your own
    private int coleccion[];

    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        coleccion = new int [0];
    }

    /**
     * Metodo para añadir un elemento dado al Array
     */
    public void add(int elemento)
    {
        // Creo un array para despues pasar los datos y paso todos los valores con un bucle
        int[] guardado = new int[coleccion.length + 1];

        for(int index = 0; index < coleccion.length; index++)
        {
            guardado[index] = coleccion [index];
        }
        //Despues Asigno el tamaño, con el parametro elemento para no desperdicar espacio

        guardado[coleccion.length] = elemento;

        //asigno los valores de la coleccion guardado a la coleccion principal

        coleccion = guardado;
    }
    
}
