import javax.swing.JOptionPane;

public class hola {

    public static void main(String[] args) {
        int opcion = 0;
        
        do {
            // Mostrar menú y pedir opción
            String menu = "MENÚ PRINCIPAL\n"
                       + "1. Saludar\n"
                       + "2. Ver fecha\n"
                       + "3. Salir\n"
                       + "Elige una opción (1-3):";
            
            String entrada = JOptionPane.showInputDialog(menu);
            
            // Convertir a número (si el usuario no cancela)
            if (entrada != null) {
                try {
                    opcion = Integer.parseInt(entrada);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Debes ingresar un número");
                    opcion = 0; // Para repetir el menú
                }
            } else {
                opcion = 3; // Si presiona Cancelar, salir
            }
            
            // Procesar opción
            if (opcion == 1) {
                JOptionPane.showMessageDialog(null, "¡Hola! ¿Cómo estás?");
            } 
            else if (opcion == 2) {
                // Fecha simple (sin usar LocalDate)
                java.util.Date fecha = new java.util.Date();
                JOptionPane.showMessageDialog(null, "Fecha actual: " + fecha);
            } 
            else if (opcion == 3) {
                JOptionPane.showMessageDialog(null, "Adiós! Gracias por usar el programa");
            } 
            else if (opcion != 3) { // Para cualquier número que no sea 1-3
                JOptionPane.showMessageDialog(null, "Opción no válida. Intenta de nuevo");
            }
            
        } while (opcion != 3); // Repetir hasta que elijan salir
    }
}