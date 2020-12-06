package service;

public class BusinessService {
    public double calculeazaTaxeSalariu(int salariu, int percent) {
        return (((double) salariu) * percent) / 100;
    }
}
