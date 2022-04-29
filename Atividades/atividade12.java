// O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.


package Atividades;

import java.util.Scanner;

public class atividade12 {
    public static void main(String[] args){
        double preco_carro, preco_final;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de fábrica do veículo : R$ ");
        preco_carro = entrada.nextDouble();

        preco_final = preco_carro + preco_carro * 0.28 + preco_carro * 0.45;

        System.out.println("O preço que o consumidor deve pagar pelo veículo é de: R$ " + preco_final);
        entrada.close();
    }
}
