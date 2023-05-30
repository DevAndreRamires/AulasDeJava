import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declaração de variaveis
        int aux, soma = 0;
        boolean controle;

        //definição doo tamanho do vetor
        System.out.print("Digite Quantos numeros ira escolher : ");
        int n = sc.nextInt();

        //criação do vetor
        int vet[] = new int[n];

        //leitor de valeres
        for (int i = 0; i < n; i++) {
            System.out.println("Informe o " + (i+1) + "º");
            vet[i] = sc.nextInt();
                }
        //mode de exibir a sequencia escolhida
        System.out.println("Os numeros escolhidos foram :");
        for (int i = 0; i < n; i++){

            System.out.print(vet[i] + " ");
        }
        //organizador crescente
        System.out.println();
        for (int i = 0; i < n; i++){
            for(int j =0; j < n-1; j++) {

                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }

        System.out.println("Os numeros escolhidos em ordem crescente são: ");
        for (int i = 0; i < n ; i++){
            System.out.print(vet[i] + " ");
        }

        //organizador decrescente
        System.out.println();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-1; j++){
            if (vet[j] < vet[j + 1]){
                aux = vet[j];
                vet[j] = vet[j+1];
                vet[j + 1 ] = aux;
            }
            }
            }

        System.out.println("Os numeros escolhidos em ordem decrescente são: ");
        for (int i = 0; i< n; i++){
            System.out.print(vet[i] + " ");
        }

        //soma de valores
        System.out.println();
        System.out.println("A soma total dos numeros digitados é: ");

        for (int i = 0; i< n; i++){
            soma = soma + vet[i];
        }
        System.out.println(soma);




    }
}
