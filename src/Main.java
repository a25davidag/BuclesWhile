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


        System.out.println("Ingresa un numero");
        int n2 = sc.nextInt();
        int secreto = 20;
        while (n2 == secreto) {
            if (n2 == secreto) {
                System.out.println("El numero es correcto");
            }else if (n2 != secreto){
                System.out.println("El numero no es correcto");
            }
            n2++;
            sc.close();
        }
    }
    }
