package trabajopractico2;

import java.util.Random;

public class LogicaCodigoSecreto {
    private int codigoSecreto;
    private static int contadorIntentos = 0;
    private static int contadorAyudas = 0;
    
    public void generarCodigo(){
        Random random = new Random();
        codigoSecreto = random.nextInt(900) + 100;
        System.out.println(codigoSecreto);
    }
    
    //Devuelve el numero de una poscion(uso del botón Revelar o cuando el usuario acierta la posición)
    public char obtenerUnDigito(int posicion){
        String codigoSecretoString = String.valueOf(this.codigoSecreto);
        return codigoSecretoString.charAt(posicion);
    }
    
    public void esMayor(int intento){
        //Retorna true o false para saber si el código es mayor o menor a lo que puso el usuario.
    }
    
    public void esCorrecto(int intento){
        //Verifica si adivinó el número
    }
    
    
    
    public int puedeUsarAyuda(){
        //Se fija si la variable contadorAyudas es menor a 2.
        return 0;
    }                                                                           
}
