import java.util.Scanner;

public class AuditacaoDeRequisitos {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        boolean paradaEmergencia = false;
        String statusRobo = "Rampa 3 em execução";
        boolean programaHabilitado = true;
        boolean comsOnline = true;

        int peçasProcessadas = 1257;
        double tempoCiclo = 4.2;
        double taxaAcerto = 98.5;

        String cameraStatus = "CAM-01 (Ao Vivo)";
        boolean gravandoVideo = true;
        String statusProcessamentoCam = "Processando";

        double oee = 85.0;
        double disponibilidadeMecanica = 94.2;

        int peçasVermelhas = 600;
        int peçasAzuis = 657;

        boolean executando = true;

        System.out.println("==================================================");
        System.out.println("   SISTEMA SUPERVISÓRIO INDUSTRIAL - SENAI       ");
        System.out.println("==================================================");

        while (executando) {
            System.out.println("----------------- PAINEL GERAL -----------------");
            System.out.println("[PARADA EMERGÊNCIA]: " + (paradaEmergencia ? ">>> ATIVADA <<<" : "NORMAL"));
            System.out.println("Status do Robô: " + statusRobo);
            System.out.println("Programa: " + (programaHabilitado ? "Habilitado" : "Desabilitado"));
            System.out.println("Comunicação: " + (comsOnline ? "Online (Verde)" : "Offline (Vermelho)"));
            System.out.println("Vídeo: " + cameraStatus + (gravandoVideo ? " [REC]" : "") + " | Status: " + statusProcessamentoCam);

            System.out.println("--- MÉTICAS DE PRODUÇÃO ---");
            System.out.println("Peças: " + peçasProcessadas);
        }
    }
}