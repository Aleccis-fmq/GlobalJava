package SE42ManejoArchivos.Domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManejoArchivos {
    //
    //
    public static void crearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(archivo);

            //
            salida.close();
            System.out.println("Se ha creado el archivo");

        } catch (FileNotFoundException e) {
            
            e.printStackTrace(System.out);
        }
    }

    public static void escribirArchivo(String nombreArchivo , String contenido){

        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(archivo);

            salida.println(contenido);
            //
            salida.close();
            System.out.println("Se ha creado el archivo");

        } catch (FileNotFoundException e) {
            
            e.printStackTrace(System.out);
        }

    }

    //
    public static void anexarArchivo(String nombreArchivo , String contenido){
        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo , true));

            salida.println(contenido);
            //
            salida.close();
            System.out.println("Se ha creado el archivo");

        } catch (FileNotFoundException ex) {
            
            ex.printStackTrace(System.out);
        } catch (IOException ex){
            ex.printStackTrace(System.out);
        }
    }

    //
    public static void leerArchivo(String nombreArchivo){
        var archivo = new File(nombreArchivo);


        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura =  entrada.readLine();

            while (lectura != null) {
                System.out.println ( "- " + lectura);
                lectura =  entrada.readLine();
            }
            entrada.close();
            
        } catch (FileNotFoundException e) {
            
            e.printStackTrace(System.out);
        } catch (IOException e) {
            
            e.printStackTrace(System.out);
        }
        
    }
    
}