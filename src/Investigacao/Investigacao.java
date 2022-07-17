package Investigacao;

import Tempo.ListaTempo;

import java.util.*;

public class Investigacao {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        List<String> respostas = new ArrayList<>();

        //Pergunta 1
        int letra = 0;
        do{
            System.out.println("Telefonou para a Vítima? (responda com y ou n): ");
            String resp = scan.next();
            if(resp.equalsIgnoreCase("y") | resp.equalsIgnoreCase("n")){
                letra = 1;
                respostas.add(resp);
            }
        }while(letra < 1);

        //Pergunta 2
        int letra2 = 0;
        do{
            System.out.println("Esteve no local do crime? (responda com y ou n): ");
            String resp = scan.next();
            if(resp.equalsIgnoreCase("y") |
                    resp.equalsIgnoreCase("n")){
                letra2 = 1;
                respostas.add(resp);
            }
        }while(letra2 < 1);

        //Pergunta 3
        int letra3 = 0;
        do{
            System.out.println("Mora perto da vítima? (responda com y ou n): ");
            String resp = scan.next();
            if(resp.equalsIgnoreCase("y") |
                    resp.equalsIgnoreCase("n")){
                letra3 = 1;
                respostas.add(resp);
            }
        }while(letra3 < 1);

        //Pergunta 4
        int letra4 = 0;
        do{
            System.out.println("Devia para a vítima? (responda com y ou n): ");
            String resp = scan.next();
            if(resp.equalsIgnoreCase("y") |
                    resp.equalsIgnoreCase("n")){
                letra4 = 1;
                respostas.add(resp);
            }
        }while(letra4 < 1);

        //Pergunta 5
        int letra5 = 0;
        do{
            System.out.println("Já trabalhou com a vítima? (responda com y ou n): ");
            String resp = scan.next();
            if(resp.equalsIgnoreCase("y") |
                    resp.equalsIgnoreCase("n")){
                letra5 = 1;
                respostas.add(resp);
            }
        }while(letra5 < 1);
        System.out.println(respostas);

        //Verificar se pessoa é Cumplice, Suspeita, Assassina ou Inocente
        int qtde = Collections.frequency(respostas,"y");

        switch (qtde){
            case 2:
                System.out.println("Você é suspeito!");
                break;
            case 3:
                System.out.println("Você é cúmplice!");
                break;
            case 4:
                System.out.println("Você é cúmplice!");
                break;
            case 5:
                System.out.println("Você é Assassino!");
                break;
            default:
                System.out.println("Você é inocente!");
        }
        //System.out.println(qtde);

    }



}
