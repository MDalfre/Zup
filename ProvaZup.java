/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provazup;

/**
 *
 * @author marci
 */
public class ProvaZup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-------------------------------");
        System.out.println("Zup - Innovation and Technology");
        System.out.println("Teste Estags 07/2019");
        System.out.println("Márcio Henrique Dalfré");
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println();
        Questao1("Arara");
        Questao2();
        Questao3("Teste");
        Questao4();
        Questao5();
        Questao6();
        Questao7();
        Questao8();
        Questao9();
        Questao10();
        Questao11();
        Questao12();
    }

    public static void Questao1(String palavra) {

        int numeroletras = palavra.length();

        String palavrafinal = "";
        //percorre a palavra toda e inverte a ordem de suas letras.
        for (int i = numeroletras; i > 0; i--) {
            char letra[] = new char[numeroletras];
            //a Array letras possui o valor de "i-1" pois as arrays se iniciam do "0"

            letra[i - 1] = palavra.charAt(i - 1);
            //reorganiza a palavra inversamente.
            palavrafinal = palavrafinal + letra[i - 1];
            //checa se a palavra inversa é igual a palavra original.

        }
        if (palavrafinal.toLowerCase().equals(palavra.toLowerCase())) {
            System.out.println("------Questão1--------");
            System.out.println();
            System.out.println("Palindromo Detectado!");
        } else {
            System.out.println("------Questão1--------");
            System.out.println();
            System.out.println("Não é palindromo");
        }

        System.out.println("Palavra Original: " + palavra);
        System.out.println();

    }

    public static void Questao2() {

        //Array de entrada {2,4,1,6,10}
        int E[] = {2, 4, 1, 6, 10};
        //Seta o tamnho da Array S de acordo com o tamnho da Array E
        int tamanho = E.length;
        int S[] = new int[tamanho];
        //Seta o primeiro numero da Array de saida, uma vez que sempre serao iguais
        S[0] = E[0];
        //Variaveis de concatenação
        String out = "[" + S[0] + ",";
        String in = "[" + E[0] + ",";
        //Inicia o for em "1" pois a posição "0" já foi definida acima
        for (int i = 1; i <= tamanho - 1; i++) {
            S[i] = S[i - 1] + E[i];
            in = in + String.valueOf(E[i]) + ",";
            out = out + String.valueOf(S[i]) + ",";

        }
        //Printa os resultados
        System.out.println("------Questão2--------");
        System.out.println();
        System.out.println("Entrada:" + in + "]");
        System.out.println("Saida:  " + out + "]");
        System.out.println();

    }

    public static void Questao3(String palavra) {
        System.out.println("------Questão3--------");
        System.out.println();
        System.out.println("Original: " + palavra);
        System.out.println("Inversa:  " + inversor(palavra));
        System.out.println();

    }

    // Função utilizada na Questão 3
    public static String inversor(String palavra) {
        String palavraInvert = "";
        int numeroletras = palavra.length();
        for (int i = numeroletras; i > 0; i--) {
            char letra[] = new char[numeroletras];
            //a nova Array recebe cada letra percorrida do final para o inicio
            letra[i - 1] = palavra.charAt(i - 1);
            //reorganiza a palavra inversamente. utilizado "-1" pois a Array se inicia do "0".
            palavraInvert = palavraInvert + String.valueOf(letra[i - 1]);

        }

        return palavraInvert;
    }

    public static void Questao4() {
        System.out.println("------Questão4--------");
        System.out.println();
        System.out.println("INCORRETO");
        System.out.println();

    }

    public static void Questao5() {
        //Define a Array de teste
        int numeros[] = {5, 9, 12, 3, 4};
        //Utilizado "-1" pois as Arrays iniciam-se do "0" e não do "1"
        int tamanho = numeros.length - 1;
        //Variavel para troca de posição
        int n = 0;
        //Testa todos os numeros na Array, invertendo as posições dos numeros maiores pelos menores, com o intuito de ordenação.
        for (int i = 0; i <= tamanho; i++) {
            for (int x = 0; x <= tamanho; x++) {
                if (numeros[i] < numeros[x]) {
                    n = numeros[i];
                    numeros[i] = numeros[x];
                    numeros[x] = n;
                }
            }
        }
        //Realiza o calculo dos 4 primeiros resultados e os 4 ultimos para validação do teste.
        int somaMenor = numeros[0] + numeros[1] + numeros[2] + numeros[3];
        int somaMaior = numeros[tamanho - 3] + numeros[tamanho - 2] + numeros[tamanho - 1] + numeros[tamanho];
        System.out.println("------Questão5--------");
        System.out.println();
        System.out.println("->Menor soma é:" + somaMenor);
        System.out.println("->Maior soma é:" + somaMaior);
        System.out.println();
    }

    public static void Questao6() {
        System.out.println("------Questão6--------");
        System.out.println();
        System.out.println("( ) 12345");
        System.out.println("( ) 33333");
        System.out.println("( ) 1245");
        System.out.println("( ) 01234");
        System.out.println("(X) 3");
        System.out.println();

    }

    public static void Questao7() {
        int n1 = 2;
        int n2 = 8;

        //string para montagem do vetor final
        String impar = "[";
        for (int i = n1; i < n2; i++) {
            //recebe o primeiro numero 
            int numero = i;
            //realiza a divisão com resto de todos os numeros por 2
            int divisao = i % 2;
            if (divisao == 1) {
                impar = impar + numero + ",";
            }
        }
        //printa os resultados do vetor final.
        System.out.println("------Questão7--------");
        System.out.println();
        System.out.println(impar + "]");
        System.out.println();
    }

    public static void Questao8() {
        System.out.println("------Questão8--------");
        System.out.println();
        System.out.println("-> Funções polimórficas são funções de mesmo nome onde ");
        System.out.println("as variaveis inseridas são quem definem o tipo de operação");
        System.out.println("ou função que exercem.");
        System.out.println();
    }

    public static void Questao9() {
        System.out.println("------Questão9--------");
        System.out.println();
        System.out.println("-> PUT");
        System.out.println();
    }

    public static void Questao10() {
        System.out.println("------Questão10--------");
        System.out.println();
        System.out.println("-> GET");
        System.out.println();
    }

    public static void Questao11() {
        System.out.println("------Questão11--------");
        System.out.println();
        System.out.println("-> POST");
        System.out.println();
    }

    public static void Questao12() {
        System.out.println("------Questão12--------");
        System.out.println();
        System.out.println("-> PATCH");
        System.out.println();
    }

}
