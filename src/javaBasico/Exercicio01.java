package javaBasico;

import javax.swing.*;
import java.awt.*;

//Declare uma variável String para o nome de um aluno, int para a idade, double para a
//nota e boolean para informar se ele está matriculado. Exiba todos os valores.

public class Exercicio01 { //classe

    private JFrame quadroInformacoesAluno; //janela
    private JTextField campoNome, campoIdade, campoNota; //campos de texto
    private JRadioButton opcaoSim, opcaoNao; // botões radio

    public Exercicio01() { //metodo construtor

        quadroInformacoesAluno = new JFrame("Informações do Aluno"); //cria a janela
        quadroInformacoesAluno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //define o padrão de fechamento (ao fechar a janela, o JFrame também finaliza)

        quadroInformacoesAluno.setLayout(new GridBagLayout()); // define um layout tabular (6 linhas, 6 colunas, 10px de espaçamento vertical e horizontal
        JPanel painelFormulario = new JPanel(new GridLayout(6, 2, 12, 12));

        painelFormulario.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        campoNome = new JTextField(); // inicializa os campos de texto
        campoIdade = new JTextField();
        campoNota = new JTextField();

        opcaoSim = new JRadioButton("Sim", true); // inicializa o botão radio Sim, definido como true
        opcaoNao = new JRadioButton("Não"); // inicializa o botão radio Nao

        ButtonGroup grupoBotoesMatricula = new ButtonGroup(); //cria um grupo de botoes
        grupoBotoesMatricula.add(opcaoSim); //adiciona o botao no grupo
        grupoBotoesMatricula.add(opcaoNao);

        JPanel painelBotoesMatricula = new JPanel(); //cria um painel dentro da janela
        painelBotoesMatricula.add(opcaoSim); // adiciona os botoes ao painel
        painelBotoesMatricula.add(opcaoNao);

        JButton botaoEnviar = new JButton("Enviar informações"); // cria o botão de enviar

        painelFormulario.add(new JLabel("Digite seu nome:")); //adiciona o label/etiqueta com o texto na janela
        painelFormulario.add(campoNome); // adiciona o campo de texto na janela

        painelFormulario.add(new JLabel("Digite sua idade:"));
        painelFormulario.add(campoIdade);

        painelFormulario.add(new JLabel("Está matriculado?:"));
        painelFormulario.add(painelBotoesMatricula); //adiciona o painel de botoes na janela

        painelFormulario.add(new JLabel("Digite sua nota:"));
        painelFormulario.add(campoNota);

        painelFormulario.add(botaoEnviar); //adiciona o botao enviar na janela

        botaoEnviar.addActionListener(evento -> processarDados()); //adiciona um Action Listener no botão, onde o evento dessa ação é o metodo processarDados

        quadroInformacoesAluno.add(painelFormulario);

        quadroInformacoesAluno.pack();
        quadroInformacoesAluno.setSize(480, 360);
        quadroInformacoesAluno.setLocationRelativeTo(null);
        quadroInformacoesAluno.setVisible(true);
    }

    private void processarDados() { //metodo linkado a ação do botaoEnviar

        try { //tenta executar o codigo abaixo
            String nome = campoNome.getText(); //define uma variavel do tipo String que recebera o texto do JTextField campoNome (atraves do metodo getText())

            int idade = Integer.parseInt(campoIdade.getText()); // converte o texto recebido no JTextField para inteiro (que vem como String por padrão)

            double nota = Double.parseDouble(campoNota.getText());

            boolean matriculado = opcaoSim.isSelected(); // define um boolean para a resposta Sim no botao radio, quando o mesmo for selecionado retorna True;

            if (nome.isEmpty()) {
                JOptionPane.showMessageDialog(quadroInformacoesAluno, "O campo Nome deve ser preenchido", "Aviso", JOptionPane.WARNING_MESSAGE); //verifica se o campo nome está vazio, se sim, exibe um painel com uma message dialog
                return;
            }

            String informacoesEnviadas = String.format(
                    "Dados do Aluno: \nNome: %s \nIdade: %d \n Matriculado: %s \n Nota: %.2f",
                    nome, idade, (matriculado ? "Sim" : "Não"), nota // define uma variavel de tipo String que recebe o metodo String.format com o texto e variaveis de campo concatenadas
            );

            JOptionPane.showMessageDialog(quadroInformacoesAluno, informacoesEnviadas, "Informações Enviadas", JOptionPane.INFORMATION_MESSAGE); //exibe uma mensagem informativa

        } catch (NumberFormatException ex) { //captura a exceção do try
            JOptionPane.showMessageDialog(
                    quadroInformacoesAluno, "Por favor, insira valores válidos para a idade (número inteiro) e nota (número decimal).", "Erro de formato", JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Exercicio01::new);
    }
}



