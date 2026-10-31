package javaBasico;

import javax.swing.*;
import java.awt.*;

//Exercício 02 - Numbers
//Crie a classe Exercicio02. Declare dois números inteiros e mostre soma, subtração, multiplicação, divisão inteira e
//resto da divisão.

public class Exercicio02 { //classe

    private final JFrame janelaPrincipal; //janela
    private JTextField campoNumero1, campoNumero2;

    public Exercicio02() { //metodo construtor

        janelaPrincipal = new JFrame("Exercicio02"); //cria a janela
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //define o padrão de fechamento (ao fechar a janela, o JFrame também finaliza)

        janelaPrincipal.setLayout(new GridBagLayout()); // define um layout tabular (6 linhas, 6 colunas, 10px de espaçamento vertical e horizontal
        JPanel painelFormulario = new JPanel(new GridLayout(6, 2, 12, 12));

        painelFormulario.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        campoNumero1 = new JTextField();
        campoNumero2 = new JTextField();

        JButton botaoEnviar = new JButton("Enviar valores");

        painelFormulario.add(new JLabel("Digite o primeiro valor:"));
        painelFormulario.add(campoNumero1);

        painelFormulario.add(new JLabel("Digite o segundo valor:"));
        painelFormulario.add(campoNumero2);

        painelFormulario.add(botaoEnviar);

        botaoEnviar.addActionListener(evento -> processarDados());

        janelaPrincipal.add(painelFormulario);
        janelaPrincipal.pack();
        janelaPrincipal.setSize(480, 360);
        janelaPrincipal.setLocationRelativeTo(null);
        janelaPrincipal.setVisible(true);
    }

    private void processarDados() {
        try {
            double numero01 = Double.parseDouble(campoNumero1.getText());
            double numero02 = Double.parseDouble(campoNumero2.getText());

            double soma = numero01 + numero02;
            double subtracao = numero01 - numero02;
            double multiplicacao = numero01 * numero02;
            double divisaoInteira = numero01 / numero02;
            double restoDivisao = numero01 % numero02;

            String resultadoCalculos = "SOMA: " + numero01 + " + " + numero02 + " = " + soma + " \nSUBTRAÇÃO: " + numero01 + " - " + numero02 + " = " + subtracao + "\nMULTIPLICAÇÃO: " + numero01 + " * " + numero02 + " = " + multiplicacao + "\nDIVISÃO: " + numero01 + " / " + numero02 + " = " + divisaoInteira + "\nRESTO DA DIVISÃO: " + restoDivisao;

            JOptionPane.showMessageDialog(janelaPrincipal, resultadoCalculos, "Resultado dos Cálculos", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) { //captura a exceção do try
            JOptionPane.showMessageDialog(
                    janelaPrincipal, "Por favor, insira valores válidos.", "Erro de formato", JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Exercicio02::new);
    }
}



