// Faça um algoritmo para ler 50 números e armazenar em um vetor VET, verificar e escrever se existem números repetidos no vetor VET e em que posições se encontram.

package Atividades;

import java.util.Scanner;

public class atividade11 {
    public static void main(String[] args){
        int VET[] = new int[50];

        Scanner entrada = new Scanner(System.in);

        for(int i=0; i<50; i++){
            System.out.println("Digite o valor da posição " + i + ": ");
            VET[i] = entrada.nextInt();
            for(int j=0; j<50; j++) {
                if(VET[i]==VET[j] && i!=j){
                    System.out.println("O número " + VET[i] + " é reétido");
                    break;
                }
            }
        }
        entrada.close();
    }
}
