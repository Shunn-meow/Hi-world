import java.util.Scanner;
public class nose {

     public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("ingrese numero natural: ");
        int b=a.nextInt();
        int c=0;
        for(int i=1; i<=b; i++){
            c=c+i;

        }
        System.out.print("la suma de los primeros "+ b+ " numeros naturales es: "+ c);
        a.close();
     }
}