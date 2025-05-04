import javax.swing.JOptionPane;

public class ejercicio02 {

    public static void main(String[] args) {
        
        int nota = Integer.parseInt(JOptionPane.showInputDialog(args));

        if (nota<13) {

            JOptionPane.showMessageDialog(null,"desaprobado"+ nota);
              
        }else {

            JOptionPane.showMessageDialog(null,"aprobado"+ nota);
            
        }


    }
    
}
