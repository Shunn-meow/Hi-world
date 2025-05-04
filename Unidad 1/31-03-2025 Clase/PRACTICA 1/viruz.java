import java.util.Scanner;
public class viruz {

     
    public static void main(String[] args) {
        Scanner viruz1=new Scanner(System.in);
        System.out.print("ingrese numero natural:");
        int viruz2=viruz1.nextInt();
    int viruz3=0;
for(int i =1 ;i<=viruz2; i++){
    viruz3=viruz3+i;
}
  System.out.print("la suma de los " + viruz2 + " primeros numeros naturales es: "+ viruz3);
viruz1.close();  }
}
