package condicionais;

public class operadoresogicos {
    public static void main(String[] args) {
         // Aula sobre - OPERADORES LÓGICOS 

            /**
             * && (E lógico): Retorna true se amn=bas as condições forem verdadeiras;
             * 
             * || (OU lógico): Retorna true se pelo menos uma das condições for verdadeiras;
             * 
             * ! (NÃO lógico): Inverte o valor lógico; retorna true se a condição dor falsa e vice-versa;
             * 
             * Combinação: Pode combinar múltiplas condições em uma única expressão lógica;
             */


             // Trabalhando com AND (&&)

             //Sintaxe: Condição1 && Condição2;
             //Sea primiera condição for false, a segunda condição não é avaliada;
             //Uso comum: Combinação de múltiplas condições que precisam ser verdadeiras ao mesmo tempo;
             // Retorna true e ambas as condições forem verdadeiras;

                int idade = 17;
                boolean temCNH = true;

                System.out.println(idade >= 18 && temCNH);

                boolean carteiraVencida = true;

                System.out.println(idade >= 18 && temCNH && carteiraVencida == false);
                 
                int A = 10;
                int B = 20;
                    //True && True => True
                if (A > 5 && B > 10) {
                    System.out.println("Deu certo!");
                }
                    
                    //False && Treu => True (Curto circuito)
                if (A > 55 & B > 10) {
                    System.out.println("Deu certo!");
                }


                //Operador OR

                /**
                 * O operador || (OR), retorna true pelo menos uma das condições dor verdadeiras;
                 * 
                 * Sintaxe: Condição1 || Condição2;
                 * 
                 * Curto circuito: Se a primeira condição dor true, a segunda condição não é avaliada;
                 * 
                 * Uso comum: Verificaçãp de múltiplas condiões onde apenas uma precisa ser verdadeira;
                 * 
                 */

                 boolean estaChovendo = true;
                 boolean temQuardaChuva = true;

                 System.out.println(estaChovendo || temQuardaChuva);
                    //só ira retornar false se os dois lados forem false
                 System.out.println(false || false);

                 System.out.println(10 > 20 || 100 == 200); //reotna false

                 int idade2 = 16;
                 boolean membro = true;

                 // O usuário pode participar d clube
                 // Ele precisa ter > 16 anos OU ser membro

                 if (idade2 > 16 || membro) {
                    System.out.println("Você pode entrar");
                 }else{
                    System.out.println("Entrada negada!");
                 }



                 //Operador NOT

                 /**
                  * O operador ! (NOT), inverte o valor lógico de uma expressão;

                  Sintaxe: ! seguido da condição ou expressão;

                  Uso comum: Negar um condição para tomar decisões baseadas no aposto;

                  Útil em validações: Verificar se uma comdição é falsa, ao invés de verdadeira;

                  Combinação: Podee ser combinado com outros operadores lógicos (&&, ||), para criar
                  expressões mais complexas;
                  */


                  System.out.println(estaChovendo); //retorna false
                  System.out.println(!estaChovendo);// retorna true

                  System.out.println(estaChovendo || !temQuardaChuva);//retorna false

                  System.out.println(!(estaChovendo || !temQuardaChuva));//retorna false





             













































    }    
}
