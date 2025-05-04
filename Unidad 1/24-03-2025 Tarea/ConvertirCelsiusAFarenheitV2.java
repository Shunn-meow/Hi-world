import javax.swing.JOptionPane;


public class ConvertirCelsiusAFarenheitV2 {

    public static void main(String[] args){
        int c;
        c=Integer.parseInt(JOptionPane.showInputDialog("Ingresa los grados celsius: "));

        int resultado=(c*9)/5+32;
    

        JOptionPane.showConfirmDialog(null, "La conversion de grados celsius a grados farenheit es:  "+resultado);
    
        
        
        
    }
}   