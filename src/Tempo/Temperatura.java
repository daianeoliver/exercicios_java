package Tempo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Temperatura {
    public static void main(String[] args) {
        List<ListaTempo> tempo = new ArrayList<>() {{
            add(new ListaTempo("janeiro", 12.0));
            add(new ListaTempo("fevereiro", 23.0));
            add(new ListaTempo("março", 3.0));
            add(new ListaTempo("abril", 21.0));
            add(new ListaTempo("maio", 10.0));
            add(new ListaTempo("junho", 30.0));
        }};
        System.out.println("Temperaturas 6 primeiros meses: " + tempo);

        //Somar temperaturas e fazer média dos 6 meses
        System.out.print("Média das temperaturas dos últimos 6 meses: ");
        Iterator<ListaTempo> iterator = tempo.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next().getTemperatura();
            soma += next;
        }
        Double media = soma / tempo.size();
        System.out.print(media);

        //Mostra temperaturas acima da média e seus respectivos meses
        System.out.println("\nTemperaturas acima da média " + media + " são: ");
        Iterator<ListaTempo> iterator1 = tempo.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next().getTemperatura();
            if (next < media) iterator1.remove();
        }
        System.out.println(tempo);

        //Mostrar Meses por extenso em que temperaturas ocorreram
        Iterator<ListaTempo> iterator2 = tempo.iterator();
        String temp = tempo.get(0).getMes();
        //System.out.println(temp);
        /*while (iterator2.hasNext()) {
            String temp = iterator2.next().getMes();
            if (temp == "1") {
                System.out.println("1 - janeiro: " + tempo.get(0).getMes());
            }
            if (temp == "2") {
                System.out.println("2 - fevereiro: " + tempo.get(0).getMes());
            }
            if (temp == "3") {
                System.out.println("3 - março: " + tempo.get(0));
            }
            if (temp == "4") {
                System.out.println("4 - abril: " + tempo.get(0));
            }
            if (temp == "5") {
                System.out.println("5 - maio: " + tempo.get(0));
            }
            if (temp == "6") {
                System.out.println("6 - junho: " + tempo.get(0));
            }

            count++;
        }*/


    }
}

