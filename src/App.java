import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro Número: ");
        var num1 = sc.nextDouble();

        System.out.print("Digite o segundo Número: ");
        var num2 = sc.nextDouble();

        System.out.print("Escolha um dos operadores a seguir (+, -, *, /): ");
        var operador = sc.next().charAt(0);

        double resultado;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: Não é possivel dividir por zero.");
                }
                break;
            default:
                System.out.println("Error: Operador Invalido");
        }

        sc.close();
    }
}
