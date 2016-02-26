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
        //Asigno el parametro elemento en la posicion dada por el tamaño

        guardado[coleccion.length] = elemento;

        //asigno los valores de la coleccion guardado a la coleccion principal

        coleccion = guardado;
    }

    /**
     * Metodo que añade un elemento a la arrayList en la posicion indicada
     * @param index La posición donde colocar el numero
     * @param elemento El elemento a añadir
     */
    public void add( int index, int elemento)
    {
        // Creo un array para despues pasar los datos y paso todos los valores con un bucle
        int[] guardado = new int[coleccion.length + 1];
        int indiceDeGuardado = 0;
        int indiceDeColeccion = 0;
        
        
            // Creacion de lista temporal para guardar

            while(indiceDeGuardado < coleccion.length)
            {   
                //Asigno el parametro elemento en la posicion dada por el tamaño
                if(indiceDeGuardado == index)
                {
                   guardado[indiceDeGuardado] = elemento;
                }

                else
                {
                    guardado[indiceDeGuardado] = coleccion[indiceDeGuardado];                    
                }
                indiceDeGuardado++;
            }
             
                coleccion = guardado;
        }
    
    /**
     * Metodo que permite vaciar la coleccion
     */
    public void clear()
    {
        coleccion = new int[0];
    }

    /**
     * Metodo que devuelve si se ha encontrado un elemento en la coleccion a traves del parametro elemento
     */
    public boolean contains(int elemento)
    {
        // Creamos el boolean que devolveremos como false y un indice
        boolean elementoEncontrado = false;
        int index = 0;
        while (index < coleccion.length && (elementoEncontrado == false))
        {
            if (coleccion[index] == elemento)
            {
                elementoEncontrado = true;
            }
            index++;
        }
        return elementoEncontrado;
    }
}


