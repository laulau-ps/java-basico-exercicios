package javaBasico;

import java.util.Scanner;

//Exercício 05 - String
//Crie a classe Exercicio05. Armazene nome e sobrenome em duas Strings e mostre o nome completo usando
//concatenação.

public class Exercicio05 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = sc.nextLine();

        System.out.println("Nome completo: " + nome + " " + sobrenome);
    }

}