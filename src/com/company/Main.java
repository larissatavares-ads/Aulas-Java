package com.company;

public class Main {

    //Estes exemplos se referem a aula 1 do curso da DIO.ME intitulado "Variáveis, Tipos de dados e operadores matemáticos em java".

    public static void main(String[] args) {

        int i;
        //int i;   //variáveis não podem ter a mesma definição
        int I;   //variáveis no java são "case sensitive"
        //int 1a;  //variáveis em java não podem começar com números
        int _1a; //embora seja permitido iniciar variáveis com "_" e "$", não é uma boa prática
        int $ai; //mesma recomendação acima

        //todas as variáveis devem ser definidas com um valor inicial (poreḿ é opcional)
        i = 5;
        I = 10;
        _1a = 20;
        $ai = 7;

        final int j = 10;
        //j = 15;  //o erro ocorre pois a variável definida acima é do tipo "final" portanto não pode ser modificada

        //int nome 1aluno;  //não pode ser adicionado espaço em variável
        //int nome%1aluno;  //não pode ser adicionado caractere especial no meio da variável
        int nome_1aluno;  //essa variável pode ser criada mas não é uma boa prática
        int nome1aluno;   //a variáveis podem ser escritas com letras e números

        nome_1aluno = 100;
        nome1aluno = 10;

        int quantidadeProduto = 50;  //essa variável é correta
        final int NUMERO_TENTATIVAS = 5;  //para variável tipo "final" é uma boa prática que se escreva ela em maiúsculo e separada por "_"


        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($ai);

        System.out.println(j);
        System.out.println(nome_1aluno);
        System.out.println(nome1aluno);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);

    }
}
