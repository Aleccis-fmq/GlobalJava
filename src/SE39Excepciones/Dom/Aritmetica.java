package SE39Excepciones.Dom;

public class Aritmetica {

    //
    public static int division(int numerador , int denominador){
        if (denominador == 0) {
            throw new Operaciones("Division entre 0");
        }
        return numerador / denominador;
    }
    
}
