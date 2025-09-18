import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 5
        System.out.println("Ingresa un numero");
        int n1 = sc.nextInt();
        int i = 1;
        while (i <= n1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        // Ejercicio 6
        Random random = new Random();
        int n2 = 56;
        int intentos = 0;
        System.out.println("Adivina un numero del 1-100");
        while (intentos != n2) {
            System.out.println("Introduce numero:");
            intentos = sc.nextInt();
            if (intentos < n2) {
                System.out.println("Numero bajo intentalo de nuevo");
            } else if (intentos > n2) {
                System.out.println("Numero alto intentalo de nuevo");
            } else {
                System.out.println("Bien");
            }
        }


        //Ejercicio7
        Scanner st = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("===== MENÚ PRINCIPAL =====");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = st.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has elegido la Opción 1");
                    break;
                case 2:
                    System.out.println("Has elegido la Opción 2");
                    break;
                case 3:
                    System.out.println("Has elegido la Opción 3");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }

        } while (opcion != 0);

        //Ejercicio 8
        Scanner sc = new Scanner(System.in);
        int numero, suma = 0;

        do {
            System.out.print("Ingresa un número (0 Para finalizar suma): ");
            numero = sc.nextInt();
            suma = suma + numero;

        } while (numero != 0);

        System.out.println("La suma total es: " + suma);


        //Ejercicio 9
        Scanner sj = new Scanner(System.in);
        System.out.println("Validacion de contraseña");
        System.out.println("Introduzca una contraseña");
        String contraseñaCorrecta = sj.nextLine();
        System.out.println("Vuelva a introducirla");
        String contraseñaIngresada = sj.nextLine();
        while (!contraseñaIngresada.equals(contraseñaCorrecta)){
            System.out.println("Contraseña incorrecta, Intentalo de nuevo ");
            contraseñaIngresada = sj.nextLine();
            if(!contraseñaIngresada.equals(contraseñaCorrecta)){
                //System.out.println("Contraseña incorrecta, Intentalo de nuevo");
            }
        }
        System.out.println("Acesso concedido");
    }
}
