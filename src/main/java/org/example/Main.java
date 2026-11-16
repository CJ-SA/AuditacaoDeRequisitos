package org.example;
import  java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);{
            int Atuacao = 1;
            String StsAtuacao;
            boolean robo = true;
            String StsRobo;
            boolean Comu = true;
            String StsComu;
            int QntPecas = 1257;

            //STATUS DO ROBÔ
            if (robo = true) {
            StsRobo = "HABILITADO";
            } else{
                StsRobo = "DESABILITADO";
            }

            //POSIÇÕES DE OPERAÇÃO
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
            //COMUNIÇÃO
            if (Comu = true){
                StsComu = "ONLINE";
            } else {
                StsComu = "OFFLINE";
                robo = false;
            }
            System.out.println("=========================================================");
            System.out.println("            SISTEMA INDUSTRIAL DE TRIAGEM SENAI");
            System.out.println("=========================================================");
            System.out.println("");
            System.out.println("========================STATUS===========================");
            System.out.println("CONEXÃO: " + StsComu);
            System.out.println("ROBÔ: " + StsRobo );
            System.out.println("ÁREA DE OPERAÇÃO: " + StsAtuacao);
            System.out.println("QNT. DE PEÇAS: " + QntPecas);
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