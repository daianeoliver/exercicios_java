package Tempo;

import java.util.Comparator;

public class ListaTempo {
   private Double mes;
   private Double temperatura;

    public ListaTempo(Double mes, Double temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }

    public Double getMes() {
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

