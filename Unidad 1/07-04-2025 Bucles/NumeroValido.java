import javax.swing.JOptionPane;

public class NumeroValido {

    public static void main(String[] args) {

        double Random = (int)((Math.random()*20)+1);
        int NumeroValido;
        int intentos = 0;
        do {
            NumeroValido = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));
            intentos++;
            if(intentos==5){
                JOptionPane.showMessageDialog(null, "Perdiste");
                break;
            }
        } while (NumeroValido!=Random);
        JOptionPane.showMessageDialog(null, "el numero de intentos fue: "+intentos);
    }   
}
