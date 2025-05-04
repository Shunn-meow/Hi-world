import javax.swing.JOptionPane;

public class TablaMultiplicar {
    public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero: "));

        for (int i = 1; i <=14; i++) {
            int producto=i*n;
            System.out.println(n+" x "+i+ " = "+producto );
        }
    }
    
}