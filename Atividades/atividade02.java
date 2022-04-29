//Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:
// a. a maior e a menor altura do grupo;
// b. média de altura dos homens;
// c. o número de mulheres.

package Atividades;

import java.util.Scanner;

public class atividade02 {
    
    public static void main(String[] args){
        int sexo, QTD_Mulher = 0, QTD_Homem = 0;
        float altura, soma_H = 0, media_homem = 0, maior = 0, menor = 0;

        Scanner entrada = new Scanner(System.in);

        for(int i=0; i<10; i++ ){
           System.out.print("Escolha o sexo da Pessoa (1- Mulher, 2- Homem):  ");
           sexo = entrada.nextInt();
           System.out.print("Digite a sua altura: ");
           altura = entrada.nextFloat();
           if (sexo == 1) {
               QTD_Mulher++;
           }else if (sexo == 2) {
               QTD_Homem++;
               soma_H = soma_H + altura;               
           }else {
               System.out.println("Opção sexo Inválida");   
           }
           if (altura > maior){
               maior = altura;
           }else if (altura < menor){
               menor = altura;
           }
        }
        System.out.println("A maior altura do grupo é de " + maior + " m, e a menor é de " + menor + " m");
        System.out.println("A média de altura dos homens é " + media_homem + " m");
        System.out.println("O número de mulheres é " + QTD_Mulher);
        System.out.println("O número de Homens é " + QTD_Homem);

        entrada.close();
    }
}
