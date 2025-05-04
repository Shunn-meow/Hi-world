import javax.swing.JOptionPane;

public class TablaMultiiplicarDoWhile {

    public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("ingrse el numero: "));

        int i = 1;
        do {
            int producto = i*n;
            System.out.println(n+" x "+i+" = "+producto);
            i++;
        }while(i<=14);
        }
    }
    

