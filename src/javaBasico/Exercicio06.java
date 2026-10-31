package javaBasico;

//Exercício 06 - String + números
//Crie a classe Exercicio06. Declare dois int, 10 e 20. Mostre a diferença entre "Resultado: " + a + b e "Resultado: "
//+ (a + b).

public class Exercicio06 {
    static void main(String[] args) {

        int numero01 = 10;
        int numero02 = 20;

        System.out.println("Resultado: " + numero01 + numero02);
        System.out.println("Resultado: " + (numero01 + numero02));

    }

}