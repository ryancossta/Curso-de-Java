package secao2;

/*O Que são Variáveis 

 * São espaços na memória que armazenam
 *  valores que podem ser manipulados pelo programa.
 * 
 * Cada varoável possui um nome único que indentifica o dado armazenado.
 * 
 * O valor de uma variável pode ser alterado durante
 * uma execução do programa.
 * 
 * Variáveis permitem a criação de lógicas dinâmicas,
 * armazenando e manipuland informações ao longo do
 * código.
 * 
 * Variáveis têm tipos específicos(Como int, String, boolean),
 * que definem o tipo de valor que podem armazenar.
 */



public class variaveis {
    
    public static void main(String[] args) {
        // 1 - O que são variáveis
        //Tipo -> nome -> Atribuir um valor 

        String nome = "Ryan";

        System.out.println(nome); /* <---- Acessou a Variável String 
        e vai retornar "RYAN" no terminal */

        // 2 - Atribuição de variável com outra 

        String teste = "Teste";

        String testando = teste;
        System.out.println(testando);

        long numeroGrande = 90000000000L;

        //int numeroGrande2 = numeroGrande;

        System.out.println(numeroGrande);


        // AULA DE STRINGS

        String firstName = "Ryan";
        String lastName = "Alves";

        System.out.println("Ryan Alves");

        System.out.println( firstName + " " + lastName); /*COLOCANDO UMA STRING VAZIA E CONCATENANDO
        PODEMOS COLOCAR ESPAÇOS ESNTRE AS PALAVRAS  */

        System.out.println("O nome dele é: " + firstName);

        String fullName = firstName + " " + lastName; // OUTRO MODE DE FAZER CONCATENAÇÃO

        System.out.println(fullName);


        //Aula sobre CHAR 

        /**
         * Char é um tipo de dado que armazena um único caractere
         * 
         * O char pode armazenar qualquer caractere Unicode, incluindo letras, números 
         * e símbolos
         * 
         * Ocupa 2 Bytes de memória, permite armazenar 65.536 caracteres diferentes
         * 
         * O Char aceita apenas aspas simples ( '' )
         */

        char letra = 'a';
        System.out.println(letra);

        char simbolo = '$';
        System.out.println(simbolo);





        // Aula sobre Int

        /**
         * Int é um tipo de dado primitivo utilizado para armazenar números inteiros 
         * 
         * Tamanho fixo: Ocupa 4 Bytes de memória, permitindo armazenar valores positivos e negativos 
         * 
         * Ideal para operações aritméticas em loops;
         * 
         * 
        */

         int n = 43;

         System.out.println(n);

         System.out.println(n + 100);

         System.out.println(n -6);

         System.out.println(n * 9);

         System.out.println(n / 3);


         int soma = n + 200;

         System.out.println(soma);



         //Aula sobre Long 

         /**
          * Long é um tipo de daod primitivo usado para armazenar
           números inteiros muitos grandes.

           Valores literais do tipo Long devem ser seguidos por L(maiúsculo) para indicar o tipo;

           Ideial para cálculo financeiro, contagem de tempo, ou quando o tipo int não é suficiente;

           O sublinhado pode ser usado para melhorar a legibilidade em números longos,
           separando grupos de dígitos (EX: 123_456_789L)

          **/

          long populacaoMund = 7800000000L;

          System.out.println(populacaoMund);

          long grandeNumber = 100_000_000L;

        System.out.println(grandeNumber + 10);


        // Aula sobre Double

        /*
         * É um tipo de dado primitivo usado para armazenar números de ponto
         * flutuante(decimais) com dupla precisão
         * 
         * Ideal para operações matemáticas que requerem precisão, como cálculos científicos e financeiros 
         * 
         * Valores literais podem ser seguidos por d ou D, embora não sejam obrigatório
         */


        double preco = 19.99;
        System.out.println(preco);

        System.out.println(preco + 1000);

        System.out.println(preco - 10);

        double pi = 3.141_592_123;
        System.out.println(pi);

        double valorCom0 = 12.1D;
        System.out.println(valorCom0);


        















    }

}
