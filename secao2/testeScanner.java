package secao2;

import java.util.Scanner;

public class testeScanner {
    public static void main(String[] args) {
        
                //Aula sobre Classe Scanner 

        /**
         * A classe Scanr é utilizada para ler a entrada de dados do usuário via console/terminal
         * 
         * Parte do pacote java.util: Para usar o Scanner, é necessário importar a classe do pacote java.util
         * 
         * Scanner pode ler diferentes tipos de dados, como int, Double, String, etc;
         * 
         * Métodos comuns: 
         * nextLine(): Lê uma linha inteira de texto;
         * nextInt(): Lê um valor inteiro;
         * nextDouble(): Lê um valor decimal(ponto flutuante);
         * next(): Lê uma única palavra;
         */

            
         Scanner scanner = new Scanner(System.in);

            //Mensagem para usuário entender que precisa digitar 
         System.out.println("Digite seu nome");

            //Resgata o valor do terminal
         String nome = scanner.nextLine();

            //Exibe o valor
         System.out.println("Olá " + nome);


            //Método nextInt

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();
            System.out.println("Olá " + nome  + " sua idade é de: " + idade + " anos");

        //Importação de pacotes

        /**
         * Pacotes organizam classes e interfaces relacionadas, melhorando a estrutura do código;
         * 
         * Importar classes de pacotes externos, coomo Scanner, é necessário para utilizá-las;
         * 
         * Aimportação de pacotes previne conflitos de nomes entre classes em projetos grandes;
         * 
         * Permite a reutilização de código existente, acelerando o desenvolvimento;
         * 
         * Facilita a manutenção e leitura do código ao manter uma organização lógica;
         */


         // Aula - fechamento de Scanner

         //O scanner comsome rescursos de entrada, como fluxo de dados do teclado;
         //Fchar o scanner libera esses recursos, evitando problamas de performance;
         //Deixar o Scanner aberto pode causar vazamentos de memória ou travamentos;
         //close() é uma prática recomendada após a leitura dos dados;
         //O fechamento do scanner ajuda a manter a aplicação eficiente e estável;














         

            //Fechamneto de scanner para evitar memory leak
         scanner.close(); //Sempre posicionado após término do código



































































































































    }
}
