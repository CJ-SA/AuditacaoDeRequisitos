package org.example;
import  java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);{
            System.out.println("Precione Enter para ativar o botão em caso de emergência");
            String input = sc.nextLine();
            if (input.contains("")) {
                System.out.println("Botão ativado");
            }
        }
    }
}