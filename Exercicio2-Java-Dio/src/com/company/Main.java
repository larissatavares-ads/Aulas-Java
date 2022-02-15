package com.company;

public class Main {

    public static void main(String[] args) {

        //todas as variáveis apresentadas abaixo são do tipo inteiro, a diferença está apenas na capacidade de armazenamento

        byte b1 = 10;
        byte b2 = 20;
        //byte b3 = 150;  //a variável tipo byte só recebe numerações de -128 até 127

        short s1 = 20000;
        //short s2 = 40000; //a variável tipo short recebe apenas numerações de -32768 até 32767

        //int i1 = -10000000000;  //a variável vai de -2147483648 até 2147483647
        int i2 = 28500;

        long l1 = 1000000000000000000L;  //vai de -9223372036854775808 até 9223372036854775807
        long l2 = 2000000000000000000L;

        //float f1 = 4.5;  //a variável tipo float precisa receber a letra "f" no final
        float f2 = 10.68F;

        double d1 = 86.69;  //aqui o código ja infere que seja double mesmo sem ter colocado a letra "D" no final
        double d2 = 99.84D;

        char c1 = 'T';
        //char c2 = 'Tw';  //não pode colocar mais de um caracter na variável char
        char c3 = '\u0057';

        String st1 = "Beatriz";
        String st2 = "Larissa";
        String st3 = "Seu cartão será enviado para análise.";

        //String dt1 = "09/02/1981"; //cuidado com a boa prática, apessasr de poder se armazenar datas em string, não é adequado

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);

    }
}
