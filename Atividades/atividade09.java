// Escrever um programa que armazene um horário (hora, minuto e segundo) em variáveis, depois, determine e exiba a quantidade de segundos que se passaram desde as 0h00min0s e a quantidade de segundos que faltam para a meia-noite.

package Atividades;

public class atividade09 {
    public static void main(String[] args){
        int hora, minuto, segundo, passado, faltam;

        hora = 3;
        minuto = 32;
        segundo = 54;

        passado = segundo + minuto * 60 + hora * 3600;
        faltam = 86400 - passado;
        
        System.out.println("Já se passaram " + passado + " segundos desde o início do dia");
        System.out.println("Faltam " + faltam + " segundos para terminar o dia");
    }
}
