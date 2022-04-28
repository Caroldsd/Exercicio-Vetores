import java.util.Scanner;

public class Vetor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int tam = 20;
        int vetor [] = new int[tam];
        int opcao = 10;

        while (opcao != 0){
            System.out.println("-----------MENU--------------------------- \n"+
                    "Escolha uma opcao: \n" +
                    "1- Criar vetor vazio. \n" +
                    "2- Inserir um valor. \n" +
                    "3- Apagar um valor. \n" +
                    "4- Consultar se existe determinado valor. \n" +
                    "5- Consultar quantos valores ja ocupam. \n" +
                    "6- Consultar o maior valor. \n" +
                    "7- Consultar o menor valor. \n" +
                    "8- Listar valores. \n" +
                    "0- Sair do programa. \n" +
                    "------------------------------------------");

            opcao = teclado.nextInt();
            if (opcao == 1){
                for (int i=0 ; i<vetor.length; i++) {
                    vetor[i] = 0;
                    System.out.println("Posicao " + i + " - " + vetor[i]);
                }
            }
            if (opcao == 2){
                for (int i=0 ; i<vetor.length ; i++){
                    if (vetor[i] == 0){
                        System.out.println("Digite o valor que deseja inserir:");
                        int valor = teclado.nextInt();
                        vetor[i] = valor;
                        break;
                    }
                }
            }
            if (opcao == 3){
                System.out.println("Digite o valor que deseja apagar: ");
                int valor = teclado.nextInt();
                for (int i=0 ; i<vetor.length ; i++){
                    if (vetor[i] == valor){
                        vetor[i] = 0;
                    }
                }
            }
            boolean simPosicao = false;

            if(opcao == 4){
                System.out.println("Digite o valor que deseja consultar: ");
                int valor = teclado.nextInt();
                for (int i=0 ; i<vetor.length ; i++){
                    if (vetor[i] == valor){
                        System.out.println("Esse valor esta na posicao " + i);
                        simPosicao = true;
                    }
                }
                if (simPosicao == false){
                    System.out.println("Nao existe esse valor.");
                }
            }
            if (opcao == 5){
                int ocupam = 0;
                for (int i=0 ; i<vetor.length ; i++) {
                    if (vetor[i] != 0) {
                        ocupam += 1;
                    }
                }
                System.out.println("Ja ocupam " + ocupam + " valores.");
            }
            int maior = 0;

            if (opcao == 6) {
                int posicao = 0;
                for (int i = 0; i < vetor.length; i++) {
                    if (vetor[i] >= maior){
                        maior = vetor[i];
                        posicao = i;
                    }
                }
                System.out.println("O maior valor e: " + maior + " e esta na posicao: "+ posicao);
            }
            int menor = Integer.MAX_VALUE;

            if (opcao == 7) {
                int posicao = 0;
                for (int i = 0; i < vetor.length; i++) {
                    if (vetor[i] < menor){
                        menor = vetor[i];
                        posicao = i;
                    }
                }
                System.out.println("O menor valor e: " + menor + " e esta na posicao: " + posicao);
            }
            if (opcao == 8) {
                for (int i=0 ; i<vetor.length; i++) {
                    System.out.println("Posicao " + i + " - " + vetor[i]);
                }
            }
        }
    }
}

