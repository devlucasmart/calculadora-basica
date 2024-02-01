import javax.swing.*;

public class Calculadora {
    public void realizarOperacao() {
        var numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));

        var numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        var operacao = JOptionPane.showInputDialog("Digite o sinal da operação (+, -, *, /):");

        char operacaoChar = operacao.charAt(0);

        double resultado = 0;

        switch (operacaoChar) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    JOptionPane.showMessageDialog(null, "Erro: Divisão por zero.");
                    return;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação inválida.");
                return;
        }

        JOptionPane.showMessageDialog(null, "Resultado da operação: " + resultado);
    }
}