package service;

public class BusinessService {
    public double calculeazaTaxeSalariu(int salariu, int percent) {
        if(salariu <= 0) {
            throw new IllegalArgumentException("salariu negativ");
        }
        return (((double) salariu) * percent) / 100;
    }
    public int calculeazaDeduceri(int salariu, int persoane) {
        if (persoane == 1) return 0;
        if (persoane == 2 && salariu < 1000) return 10;
        if (persoane == 3 && salariu < 1000) return 15;
        if (persoane == 4 && salariu < 1000) return 20;
        if (persoane >= 5 && salariu < 1000) return 30;
        return 0;

    }
}
