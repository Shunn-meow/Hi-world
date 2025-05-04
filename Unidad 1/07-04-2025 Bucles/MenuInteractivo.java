import javax.swing.JOptionPane;

public class MenuInteractivo {
    public static void main(String[] args) {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "MENÚ\n1. Saludar\n2. Ver fecha\n3. Salir\nElige:"));
            
            if (opcion == 1) JOptionPane.showMessageDialog(null, "holaaaa");
            if (opcion == 2) JOptionPane.showMessageDialog(null, "Fecha: " + "07-04-2025");
        } while (opcion != 3);
    }
}