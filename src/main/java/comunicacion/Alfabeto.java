package comunicacion;

import java.util.Arrays;

public class Alfabeto extends Pictograma{
    String [] letras;
    String interpretacion;

    public Alfabeto(String origen, String [] letras, String interpretacion){
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;

    }

    public String interpretacion(){
        return interpretacion;
    }

    public int cantidadLetras(){
        return letras.length;
    }

    public String toString(){
        String [] alfabeto = new String[letras.length];
        for(int i = 1; i <= letras.length; i++) {
            if (i == letras.length) {
                alfabeto[i] = letras[i];
            } else {
                alfabeto[i] = letras[i] + ", ";
            }
        }
        return Arrays.toString(alfabeto);
    }
}
