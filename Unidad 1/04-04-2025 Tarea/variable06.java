package condicinal;

import javax.swing.JOptionPane;

public class variable06 {

    public static void main(String[] args) {
        
        int año = Integer.parseInt(JOptionPane.showInputDialog("ingrese el año: "));

        if ((año % 4 == 0 && año % 100 !=0 ) || ( año % 400 == 0) ) {
            JOptionPane.showMessageDialog(null, "El año "+año+" es bisiesto");
        } else {
            JOptionPane.showMessageDialog(null, "El año "+año+" no es bisiesto" );
        }
    }
    
}
