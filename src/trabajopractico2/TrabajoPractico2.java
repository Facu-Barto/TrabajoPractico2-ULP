package trabajopractico2;

public class TrabajoPractico2 {

    public static void main(String[] args) {
        System.out.println("facu gei");
        System.out.println("medina gei tambien");
        
        LogicaCodigoSecreto a= new LogicaCodigoSecreto();
        a.generarCodigo();
        GUICodigoSecreto ventana = new GUICodigoSecreto();
        ventana.setVisible(true);
    }
}
