package secao2;

public class Exercicios {
    /* Exercício 1
    -Crie uma variável int para armazenar o valor 10.
    -Crie uma segunda variável int que armazena o dobro do valor da
    primeira variável
    -Usando operadores aritméticos, exiba os resultados 


    Exercício 2 
    -Declare uma variável char que armazene a letra 'B'
    -Faça o casting explícito dessa variável para int e exiba
    o valor numérico correspondendo 



    EXERCÍCIO 3
    -Declare duas variáveis double para 
     armazenar os valores 15.75 e 20.40
     -Some os valores dessas variáveis e armazene o resultado 
     em uma nova variável double
     -Exiba o resultado 


     Exercício 4
     -Declare uma variável long para armazenar o número 2 bilhões (2_000_000_000)
     -Em seguida, declare uma variável int e faça o casting explícito do valor long para INT
     -Exiba o resultado


     Exercício 5
    -Escreva um progrma que crie uma variável String com valor "Olá Mundo!"
    -Em seguida, crie outra viariável String que concatene a primeira 
     variável com o texto "Seja Bem Vindo ao Java!!"










     */




     public static void main(String[] args) {
        //Exercício 1 
        int v1 = 10;
        int v2 = v1*2;

        System.out.println(v2);




        //Exercício 2

        char letraE = 'B';
        int valorE = (int) letraE;
        System.out.println(valorE);



        //Exercício 3
        double n1 = 15.75;
        double n2 = 20.40;

        double somaDouble = n1 + n2;
        System.out.println(somaDouble);


        //Exercício 4
        long numeroBi = 2_000_000_000L;

        int newNumber = (int) numeroBi;
        System.out.println(newNumber);


        //Exercício 5 
        String ola = "Olá Mundo!";
        String mundo = (ola + " " + "Seja Bem vindo Java!");
        System.out.println(mundo);
        
     }
}

