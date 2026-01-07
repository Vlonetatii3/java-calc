package calc;

public class Operations {

    public void sumar(int a, int b) {
        System.out.println("Resultado: " + (a + b));
    }

    public void restar(int a, int b) {
        System.out.println("Resultado: " + (a - b));
    }

    public void multiplicar(int a, int b) {
        System.out.println("Resultado: " + (a * b));
    }

    public void dividir(int a, int b) {
        if (b == 0) {
            System.out.println("No se puede dividir entre cero");
        } else {
            System.out.println("Resultado: " + (a / b));
        }
    }

    public void exponenciar(int a, int b) {
        System.out.println("Resultado: " + Math.pow(a, b));
    }
}
