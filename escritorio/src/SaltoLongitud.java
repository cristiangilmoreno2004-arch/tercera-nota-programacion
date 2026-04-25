import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Participante {
    String nombre;
    double marca2024;
    double marca2025;
    double marca2026;

    public Participante(String nombre, double m2024, double m2025, double m2026) {
        this.nombre = nombre;
        this.marca2024 = m2024;
        this.marca2025 = m2025;
        this.marca2026 = m2026;
    }
}

public class SaltoLongitud {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Participante[] participantes = new Participante[10];
        int contador = 0;
        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Inscribir participante");
            System.out.println("2. Mostrar listado de datos");
            System.out.println("3. Mostrar listado de marcas 2024 (mayor a menor)");
            System.out.println("4. Finalizar programa");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:
                    if (contador < 10) {
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();

                        System.out.print("Mejor marca 2024: ");
                        double m2024 = sc.nextDouble();

                        System.out.print("Mejor marca 2025: ");
                        double m2025 = sc.nextDouble();

                        System.out.print("Mejor marca 2026: ");
                        double m2026 = sc.nextDouble();
                        sc.nextLine(); // limpiar buffer

                        participantes[contador] = new Participante(nombre, m2024, m2025, m2026);
                        contador++;

                        System.out.println("Participante inscrito correctamente.");
                    } else {
                        System.out.println("No hay mas plazas disponibles.");
                    }
                    break;

                case 2:
                    if (contador == 0) {
                        System.out.println("No hay participantes inscritos.");
                    } else {
                        System.out.println("\n--- LISTADO DE PARTICIPANTES ---");
                        for (int i = 0; i < contador; i++) {
                            System.out.println("Dorsal #" + (i + 1));
                            System.out.println("Nombre: " + participantes[i].nombre);
                            System.out.println("Marca 2024: " + participantes[i].marca2024);
                            System.out.println("Marca 2025: " + participantes[i].marca2025);
                            System.out.println("Marca 2026: " + participantes[i].marca2026);
                            System.out.println("---------------------------");
                        }
                    }
                    break;

                case 3:
                    if (contador == 0) {
                        System.out.println("No hay participantes inscritos.");
                    } else {
                        // Copia del arreglo para no alterar el original
                        Participante[] copia = Arrays.copyOf(participantes, contador);

                        // Ordenar por marca 2024 de mayor a menor
                        Arrays.sort(copia, new Comparator<Participante>() {
                            @Override
                            public int compare(Participante p1, Participante p2) {
                                return Double.compare(p2.marca2024, p1.marca2024);
                            }
                        });

                        System.out.println("\n--- LISTADO ORDENADO (MARCA 2024) ---");
                        for (Participante p : copia) {
                            System.out.println("Nombre: " + p.nombre + " | Marca 2024: " + p.marca2024);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}