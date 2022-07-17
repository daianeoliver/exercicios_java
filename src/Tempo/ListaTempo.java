package Tempo;

import java.util.Comparator;

public class ListaTempo {
   private String mes;
   private Double temperatura;

    public ListaTempo(String mes, Double temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }

    public String getMes() {
        return mes;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return "{" +
                "mes='" + mes + '\'' +
                ", temperatura=" + temperatura +
                '}';
    }



}

