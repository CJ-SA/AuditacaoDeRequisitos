package org.example;
import  java.util.Scanner;
import java.time.Duration;
import java.time.Instant;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {
    static void main() throws InterruptedException {
        Scanner sc = new Scanner(System.in);{
            int stsmenu = 1;
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
            } while (stsmenu==1) {
                System.out.println("=========================================================");
                System.out.println("            SISTEMA INDUSTRIAL DE TRIAGEM SENAI");
                System.out.println("=========================================================");
                System.out.println("");
                System.out.println("========================STATUS===========================");
                System.out.println("CONEXÃO: " + StsComu);
                System.out.println("ROBÔ: " + StsRobo);
                System.out.println("ÁREA DE OPERAÇÃO: " + StsAtuacao);
                System.out.println("QNT. DE PEÇAS: " + QntPecas);
                System.out.println("digite 1 para iniciar processo:");
                System.out.println("");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("");
                System.out.println("Pressione Enter em caso de emergência:");
                String input = sc.nextLine();

                if (input.contains("")) {
                    System.out.println("===================");
                    System.out.println("  PARADA ACIONADA.");
                    System.out.println("===================");
                } else if (input.contains("1")) {
                    stsmenu = 2;
                }
            }
        }
    }
}