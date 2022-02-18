package com.company;

public class Main {

    // Exercícios acerca da aula de Operadores Artitméticos no curso da DIO de Variáveis, Tipos de Dados e Operadores Aritméticos

    public static void main(String[] args) {

        System.out.println("PrePos");
        prePos();
        System.out.println("Aritmético");
        aritmetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();

    }

    private static void prePos() {

        int k = 10;

        int i = ++k;  // i = k + 1;
        int j = k--;  // j = k; k = k - 1; não estou entendendo esse resultado
        int x = k;

        System.out.println("i:" + i);
        System.out.println("j:" + j);
        System.out.println("x:" + x);

    }

    private static void aritmetico() {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a+b;
        int r2 = c-a;
        int r3 = d+b;
        int r4 = e/a;
        int r5 = c%b;

        System.out.println("a+b: " + r1);
        System.out.println("c-a: " + r2);
        System.out.println("d+b: " + r3);
        System.out.println("e/a: " + r4);
        System.out.println("c%b: " + r5);

    }

    private static void atribuicao() { //é o tipo que mais é utilizado

        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

        System.out.println("d: " + d);

        i += 5; // i = i + 5;
        j -= 3; // j = j - 3;
        d /= 2.7d; // d = d / 2.7d;
        l *= 3; // l = l * 3;
        k %= 2; // k = k % 2; aqui o resultado é o resto da divisão

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("d: " + d);
        System.out.println("l: " + l);
        System.out.println("k: " + k);

        i = k = j; // nessa atribuição o k recebe o valor de j, e o i recebe o valor de k que agora é o mesmo do j; não é muito utilizado no dia-a-dia

        System.out.println("i: " + i);
        System.out.println("k: " + k);
        System.out.println("j: " + j);

    }

    private static void precedencia() {

        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --i * k; // 10 + 19 * 30 -> 10 + 570 -> 580 ele faz primeiro toda essa conta para depoiss atribuir que o i é 11

        System.out.println("i++ + --i * k: " + a);

        System.out.println("i: " + i); // 11

        int b = k / --i % 3 + 1; // 30 / 10 % 3 + 1 -> 1

        System.out.println("k / --i % 3 + 1: " +b);

        System.out.println("i: " +i); // i = 10

        int c = 2;

        c *= i += 5; // c = 2 * i; i = i + 5;  -> c = 2 * i; i = 10 + 5; -> c = 2 * 15; c = 30;

        System.out.println("c *= i += 5: " + c);

    }


}
