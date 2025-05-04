import javax.swing.JOptionPane;

public class TablaMultiiplicarWhile {

    public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("ingrse el numero: "));
        int i = 1;
        while (i<=14) {
            int producto = i * n;
            System.out.println(n+ " x "+i+" = "+producto);
            i++;      
        }
    }
    
}
