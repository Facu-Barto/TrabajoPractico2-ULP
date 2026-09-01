package trabajopractico2;

public class LogicaCodigoSecreto {
    private int codigoSecreto;
    private static int contadorIntentos;
    private static int contadorAyudas;
    
    public void generarCodigo(){
        //genera el codigo secreto.
    }
    
    public void esMayor(int intento){
        //Retorna true o false para saber si el código es mayor o menor a lo que puso el usuario.
    }
    
    public void esCorrecto(int intento){
        //Verifica si adivinó el número
    }
    
    public int revelarNumero(int posicion){
        //Devuelve el numero de una poscion(uso del botón Revelar o cuando el usuario acierta la posición)
        return 0;
    }
    
    public int puedeUsarAyuda(){
        //Se fija si la variable contadorAyudas es menor a 2.
        return 0;
    } 
}
