package service;

public class BusinessService {
    public double calculeazaTaxeSalariu(int salariu, int percent) {
        if(salariu <= 0) {
            throw new IllegalArgumentException("salariu negativ");
        }
        return (((double) salariu) * percent) / 100;
    }
}
