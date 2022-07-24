package Tempo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Temperatura {
    public static void main(String[] args) {
        List<ListaTempo> tempo = new ArrayList<>() {{
            add(new ListaTempo(1d, 12.0));
            add(new ListaTempo(2d, 23.0));
            add(new ListaTempo(3d, 3.0));
            add(new ListaTempo(4d, 21.0));
            add(new ListaTempo(5d, 10.0));
            add(new ListaTempo(6d, 30.0));
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
        Double temp = tempo.get(0).getMes();

    }
}

