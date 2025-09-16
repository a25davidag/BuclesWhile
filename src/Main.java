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
            }else if (intentos > n2){
                System.out.println("Numero alto intentalo de nuevo");
            }else {
                System.out.println("Bien");
            }
        }
        }
    }

