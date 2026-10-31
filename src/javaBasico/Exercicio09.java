package javaBasico;

//Exercício 09 - Casting
//Crie a classe Exercicio09. Converta explicitamente o double 9.8 para int. Explique em comentário o que aconteceu
//com a parte decimal.

public class Exercicio09 {
    static void main(String[] args) {

    double valorDouble = 9.8;
    int valorInteiro = (int) valorDouble;

    System.out.println("Valor double: " + valorDouble);
    System.out.println("Valor convertido em inteiro: " + valorInteiro);

    }

}