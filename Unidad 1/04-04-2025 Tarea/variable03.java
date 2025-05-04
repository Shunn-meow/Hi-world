package condicinal;

import javax.swing.JOptionPane;

public class variable03 {

    public static void main(String[] args) {
        
        int puntaje = Integer.parseInt(JOptionPane.showInputDialog("ingrese el puntaje: "));

        if (puntaje <=20 && puntaje >=18) {
            JOptionPane.showMessageDialog(null, "excelente");
        } else if (puntaje <=17 && puntaje >=15) {
            JOptionPane.showMessageDialog(null, "bueno");
        } else if (puntaje <=14 && puntaje >=11) {
            JOptionPane.showMessageDialog(null, "suficiente");
        } else if (puntaje <=10 && puntaje >=0) {
            JOptionPane.showMessageDialog(null, "insuficiente");
        } else {
            JOptionPane.showMessageDialog(null, "el puntaje: "+ puntaje + ", es inavido el puntaje debe estar en el rango de 0 a 20");
        }
    }
    
}
