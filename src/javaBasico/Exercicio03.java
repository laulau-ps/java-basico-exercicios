package javaBasico;

import java.util.Scanner;

//Exercício 03 - char
//Crie a classe Exercicio03. Armazene a letra de uma turma em char e exiba a frase “Turma: X”.

public class Exercicio03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a letra da turma:");
        char letraTurma = sc.next().charAt(0);

        System.out.println("Turma " + letraTurma);

    }

}