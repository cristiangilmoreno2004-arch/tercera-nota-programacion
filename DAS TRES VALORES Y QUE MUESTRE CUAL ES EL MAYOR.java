import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("ingrese primer valor: ");
      int valor1 = scanner.nextInt();
       System.out.println("ingrese segundo valor: ");
        int valor2 = scanner.nextInt();
          System.out.println("ingrese tercer valor: ");
        int valor3 = scanner.nextInt();
        if ((valor1 > valor2) && (valor1 > valor3)){
            System.out.println("el numero mayor es: " + valor1);
        }
            else if ((valor2 > valor1) && (valor2 > valor3)){
             System.out.println("el numero mayor es: " + valor2);
            }
            else if ((valor3 > valor1) && (valor3 > valor2)){
             System.out.println("el numero mayor es: " + valor3);
            }
        }}
        
      