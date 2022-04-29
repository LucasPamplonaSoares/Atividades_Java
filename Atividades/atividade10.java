// Elabore um programa para armazenar uma medida de raio em metros, determinar e exibir o perímetro e a área de um círculo com esse raio, através das fórmulas: perímetro = 2 x 3.14159 x raio; área = 3.14159 x raio².

package Atividades;

public class atividade10 {
    public static void main(String[] args) {
        double raio, perimetro, area;
        raio = 4.3;

        perimetro = 2 * 3.14159 * raio;
        area = 3.14159 * raio * raio;

        System.out.println("O perímetro do círculo é: " + perimetro);
        System.out.println("Areá do círculo é: " + area);
    }
}
