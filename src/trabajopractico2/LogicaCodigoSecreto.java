package trabajopractico2;

import java.util.Random;

public class LogicaCodigoSecreto {
    private int codigoSecreto;
    private static int contadorIntentos = 0;
    private static int contadorAyudas = 0;

    public int getCodigoSecreto() {
        return codigoSecreto;
    }

    public void setCodigoSecreto(int codigoSecreto) {
        this.codigoSecreto = codigoSecreto;
    }

    public static int getContadorIntentos() {
        return contadorIntentos;
    }

    public static void setContadorIntentos(int contadorIntentos) {
        LogicaCodigoSecreto.contadorIntentos = contadorIntentos;
    }

    public static int getContadorAyudas() {
        return contadorAyudas;
    }

    public static void setContadorAyudas(int contadorAyudas) {
        LogicaCodigoSecreto.contadorAyudas = contadorAyudas;
    }
    
    //Genera el codigo random.
    public int generarCodigo(){
        Random random = new Random();
        codigoSecreto = random.nextInt(900) + 100;
        System.out.println(codigoSecreto);
        return codigoSecreto;
    }
    
    //Convierte el codigo en string y devuelve el digito de una poscion del numero(0,1,2).
    public char obtenerUnDigito(int posicion){
        String codigoSecretoString = String.valueOf(this.codigoSecreto);
        return codigoSecretoString.charAt(posicion);
    }
    
    //compara el codigoSecreto con el codigo que ingresa el usuario.
    public boolean comparacion(char c1, char c2, char c3){
        return c1 == obtenerUnDigito(0) && c1 == obtenerUnDigito(1) && c1 == obtenerUnDigito(2);
    }
    
    //Verifica que el contadorAyudas sea menor a 2.
    public int puedeUsarAyuda(){
        if(contadorAyudas < 2){
            int posicionRevelar = contadorAyudas;
            contadorAyudas++;
            return posicionRevelar;
        } else return -1;
    }       

    public void esMayor(int intento){
        //Retorna true o false para saber si el código es mayor o menor a lo que puso el usuario.
    }
    
    public void esCorrecto(int intento){
        //Verifica si adivinó el número
    }
}