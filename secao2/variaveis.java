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


      /* REGRAS PARA VARIÁVEIS 
 * 
 * A sintaxe para declarar variável é: TIPO DE DADO nome = VALOR;
 * 
 * O formato de nomes é lowerCamelCase, ou seja: nomeCompleto.
 * 
 * Os tipos de dados variam conforme a necessidade da variável no programa.
 * 
 * Cada tipo de dado ocupa um tamanho na memória. Devemos sempre otimizar isso.
 * 
 * O nome precisa ser único, não pode começar com números;
 * 
 * Regra de otimização:Escolher sempre a que ocupa menos memória;
 * 
 * O sinal de igual é chamdo de atribuição;
 * 
 */


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
          * Long é um tipo de dado primitivo usado para armazenar
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


        // Operadores Aritméticos

        int soma2 = 12 + 5;
        System.out.println(soma2);
        System.out.println(22 + 10);
        System.out.println(89- 10);
        System.out.println(10.9 / 19.8);
        System.out.println(10 / 5.1);
        System.out.println(77 * 10);
        System.out.println(22 + 10);
   
        //Para resultado quebrado (1.5), pelo menos 1 num da divisão tem que ser double

        System.out.println(10/3);
        System.out.println(10.0/3);
        System.out.println(10%3);


        /**
         * Incremento (++): incrementa o valor de uma variável em 1;
         * 
         * Desencremento (--): Desencrementa o valor de uma variável em 1;
         * 
         * Atribuição aditiva (+=): Soma e atribui o resultado a uma variável;
         * 
         * Atribuição subtrativa (-=): Subtrai e atribui o resultado a uma variável;
         */

        int x = 5;
        x++; //mai 1
        x++;
        x++;
        System.out.println(x); // resultado final é 8


        int y = 10;
        y--;
        y--;
        y--;
        y--;
        System.out.println(y); // resultado final é igual a 6


        int t = 10;
        t+= 10;
        t+= 10;

        System.out.println(t); // Resultado igual a 30


        int r = 20;
        r -= 10;

        System.out.println(r); //Resultado igual a 10

        // podemos realizar com variáveis 

        t += r;
        System.out.println(t); // resultado igual a 40


        
        //Aula sobre Type Casting

        /**
         * Casting implícito (Windening): Converte automaticamente tipos menores
         * para tipos maiories (int para long), sem perder dados;
         * 
         * Casting explícito(narrowing): Necessário quando se converte tipos maiores 
         * para tipos menores (double para int), podendo resultar em perda de dados;
         * 
         * Para realizar um casting explícito, é necessário especificar o tipo de destino
         * entre parênteses;
         */

        //Formato implícito
        int numero3 = 42;

        long numeroLong = numero3;

        double numeroDouble = numero3;

        System.out.println(numeroLong);
        System.out.println(numeroDouble);


        //Formato explícito

        double valorDouble = 9.78;

        int valorInt = (int)valorDouble;

        System.out.println(valorInt);


        //Casting de char para int 

        char letra2 = 'A';

        int codigoAscii = (int) letra2;
        System.out.println(codigoAscii);


        //Aula sobre Constantes em Java com final

        /**
         * Final: dEFINE UMA VARIÁVEL COMO CONSTANTE, IMPEDINDO QUE SEU VALOR SEJA ALTERADO
         * APÓS A INICIALIZAÇÃO;
         * 
         * Uma vez atribuido, o valor não pode ser modificado;
         * 
         * Boas práticas: Usado para valores que não devem mudar durante a execusão do programa,
         * como API ou taxas de juros;
         * 
         * Convenção de nomes:Constantes geralmente são nomeadas em letra maiúsculas, com palavrras
         * separadas por sublinhados (_);
         */

         final int DIAS_DA_SEMANA = 7;
         System.out.println("Dias da semana: " + DIAS_DA_SEMANA);


         //Aula sobre Inferência de Tipo com VAR em java

         /**
          * Var: Introduzido no Java 10, permite ao compilador inferir o tipo de variável com base 
          no valor atribuído;

          Reduz a necessidade de escrever tipos longos e complexos, aumentando a legibilidade do código;

          Tipo estático: Embora o tipo seja inferido, ele é fixo após a atribuição e não pode ser alterado;

          Regras: Deve ser inicializado no momento da declaração, e não pode ser usado para variáveis não inicializadas;

          Boas práticas: útil para tipos complexos ou quando o tipo é óbvio a partir do contexto;
          */

         var z = 10;

         System.out.println(z);

         // Z = "teste";

           z = 5;

           var texto2 = "teste";

           var doubleTeste = 2.0;

        System.out.println(texto2);

        System.out.println(doubleTeste);



















































    }

}
