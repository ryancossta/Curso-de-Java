package condicionais;



public class condicionais {
    public static void main(String[] args) {
        //O queé boolean??
        /**
         * Boolean é um tipo de dado primitivo em java que pode armazenar apenas dois 
         * valores: TRUE ou FALSE;
         * 
         * Utilizado para controlar fluxo de execução em estruturas de controle como IF, WHILE e FOR;
         * 
         * Suporta operadores lógicos como &&(AND), ||(OR), e !(NOT) para combinar e inventar valores booleanos;
         * 
         * Uma expressão booleana é qualquer expressão que resulta em valor true ou false;
         * 
         * Emora seja representado como true e false no código, é tratado como 1(true) ou 0(false);
         */


        boolean  isTrue = true;
        boolean isFalse = false;

        //boolean aceita somente TRUE ou FALSE 

        System.out.println(isTrue);
        System.out.println(isFalse);


        //Operadores de comparação

        /**
         * == (igaul a): verifica se dois valores são iguais;
         * 
         * != (Diferente de): verifica se dois valores são diferentes;
         * 
         * > (Maior que): Verifica se o valor a esquerda é maior que o valor á direita;
         * 
         * <(Menor que): Verifica se o valor a esquerda é menor que o valor a direita;
         * 
         * >=(Maior ou igual a): Verifica se o valor a esquerda é maior ou igual ao valor a direita;
         * 
         * <=(Menor ou igual a): verifica se o valor a esquerda é menor ou igual o valor a direita;
         */
        int n1 = 10;

        System.out.println(n1 == 10); //Retorna true
        System.out.println(n1 == 9); //Retorna false
        System.out.println(n1 != 8); //Retorna true
        System.out.println(n1 != 10 ); //Retorna false
        System.out.println(n1 > 11); //Retorna false
        System.out.println(n1 < 11); //Retorna true
        System.out.println(n1 < 9); //Retorna False
        System.out.println(n1 >= 10); //Retorna true(é igual a 10)
        System.out.println(n1 >= 11); //Retorna false(é maior que 10)
        System.out.println(n1 <= 12); //Retorna true(é menor que 12)
        System.out.println(n1 <= 7); //Retorna false(10 é maior que 7)
       

        //Diferença entre comparação e atribuição

        /**
         * ATRIBUIÇÃO (=)
         *    - Atribui um valor a uma variável;
         *    - Usado para definir ou alterar o valor armazenado em uma variável;
         *    - Exemplo;  int a = 5;
         * 
         * COMPARAÇÃO(==)
         *    - Compara dois valores para verificar se são iguais;
         *    - Retorna true se os valores forem iguais e false se forem difernetes;
         *    - Exemplo: 5 == 5 retorna true;
         *
         */
        
        int n = 5;
        int m = 10;

        //System.out.println(n = 12); //Muda o valor para 12

        System.out.println(n == 12); //Retorna false

        System.out.println(n == m); //Os valores diferem um ao outro

        
        //Comparação de Strings

        /** PROBLEMA COM ==:
         * 
         * O operador == compara as referências de memória, não o conteúdo das strings;
         * Pode retornar false mesmo que o conteúdo das strings seja igual, se as referências
         * forem diferentes;
         * 
         * USO DO MÉTODO equals():
         * 
         * equals() compara o conteúdo das strings, caractere por caractere;
         * É a maneira correta e segura de verificar se duas strings são iguais em valor;
         * 
         * equalslgnoreCase():
         * 
         * Variante de equals() que ignora diferenças entre maiúsculas e minúsculas;
         */

        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1 == str2); //Retorna FALSE

        System.out.println(str1 == "Java"); //Retorna true

        System.out.println(str1.equals(str2)); //MÉTODO CORRETO DE COMPARAÇÃO DE STRINGS (RETORNA TRUE)

        String str3 = "JAVA";
        System.out.println(str1.equals(str3));

        //Java == JAVA (false) > java == java
        System.out.println(str1.equalsIgnoreCase(str3));































































    }
}
