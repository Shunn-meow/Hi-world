import java.util.Scanner;

public class promediodenotas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5]; 
        double suma = 0;

        for (int i = 0; i < 5; i++) {
            double nota;
            do {
                System.out.print("Ingrese la nota " + (i + 1) + " (0-20): ");
                nota = scanner.nextDouble();
                if (nota < 0 || nota > 20); 
                    
            } while (nota < 0 || nota > 20); 

            notas[i] = nota;
            suma += nota;
        }
        double promedio = suma / 5;
        System.out.println("El promedio de las notas es: " + promedio);
        
        scanner.close();
    }
}