package calc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Bienvenido a mi aplicacion basica de calculadora!");

        Scanner sc = new Scanner(System.in);
        Operations op = new Operations();
        int option;

        do {
            System.out.println("\n¿Que desea hacer?");
            System.out.println(
                    "1. Suma\n" +
                            "2. Resta\n" +
                            "3. Multiplicacion\n" +
                            "4. Division\n" +
                            "5. Exponenciacion\n" +
                            "6. Salir"
            );
            System.out.print("Opcion: ");
            option = sc.nextInt();

            if (option >= 1 && option <= 5) {
                System.out.print("Ingrese el primer numero: ");
                int a = sc.nextInt();

                System.out.print("Ingrese el segundo numero: ");
                int b = sc.nextInt();

                switch (option) {
                    case 1:
                        op.sumar(a, b);
                        break;
                    case 2:
                        op.restar(a, b);
                        break;
                    case 3:
                        op.multiplicar(a, b);
                        break;
                    case 4:
                        op.dividir(a, b);
                        break;
                    case 5:
                        op.exponenciar(a, b);
                        break;
                }
            }

        } while (option != 6);

        System.out.println("Gracias por usar la calculadora!");
        sc.close();
    }
}
