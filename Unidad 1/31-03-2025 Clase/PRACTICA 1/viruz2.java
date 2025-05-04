import java.util.Scanner;

public class viruz2 {

    public static void main(String[] args) {
        Scanner viruz3=new Scanner(System.in);
        System.out.print("ingrese numero natural:");
        int viruz4=viruz3.nextInt();
        int viruz5=0;

        for(int i=1; i<=viruz4; i++){
        viruz5=viruz5+i;

        }
        System.out.print("la suma de los " + viruz4 + " primeros numeros naturales" + " es: " + viruz5);
        viruz3.close();
    }
}