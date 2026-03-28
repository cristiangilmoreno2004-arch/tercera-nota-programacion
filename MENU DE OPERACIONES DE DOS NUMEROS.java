import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("ingrese numero 1: ");
      int num1 = scanner.nextInt();
       System.out.println("ingrese numero 2: ");
      int num2 = scanner.nextInt();
       System.out.println("ingrese numero de opcion ");
      int p = scanner.nextInt();
      switch (p){
          case 1:
              int sum = num1 + num2;
              System.out.println("la suma de los dos numeros es de: " + sum);
              break;
                case 2:
                    int rest = num1 - num2;
                    System.out.println("la resta de los dos numeros es de: " + rest);
                    break;
                      case 3:
                          int multi = num1 * num2;
                          System.out.println("la multiplicacion de los dos numeros es de: " + multi);
                          break;
                            case 4:
                                double div = num1 / num2;
                                System.out.println("la division de los dos numeros es de: " + div);
                                break;}
                                
      }
}