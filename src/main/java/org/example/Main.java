package org.example;
import  java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);{
            int Atuacao = 1;
            String StsAtuacao;
            boolean robo = true;
            String StsRobo;
            if (robo = true) {
            StsRobo = "HABILITADO";
            } else{
                StsRobo = "DESABILITADO";
            }
            switch (Atuacao) {
                case 0:
                   StsAtuacao = "RAMPA 1";
                    break;
                case 1:
                    StsAtuacao = "RAMPA 2";
                    break;
                case  2:
                    StsAtuacao = "RAMPA 3";
                default:
                    StsAtuacao = "N/A";

            }
            System.out.println("=========================================================");
            System.out.println("                  BEM-VINDO AO SISTEMA");
            System.out.println("=========================================================");
            System.out.println("");
            System.out.println("========================STATUS===========================");
            System.out.println("ROBÔ: " + StsRobo );
            System.out.println("ÁREA DE OPERAÇÃO: " + StsAtuacao);
            System.out.println("");
            System.out.println("");
            System.out.println("Precione Enter para ativar o botão em caso de emergência:");
            String input = sc.nextLine();
            if (input.contains("")) {
                System.out.println("===================");
                System.out.println("  PARADA ACIONADA.");
                System.out.println("===================");
            }
        }
    }
}