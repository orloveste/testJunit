package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BusinessServiceTest {
    BusinessService service;
    int salariu;
    int percent;

    @BeforeEach
    public void setUp() {
        service = new BusinessService();
        int salariu = 100;//definesti si datele de intrare
        int percent = 15;
    }
    @Test
    public void testCalculeazaTaxeSalariu() {
//1 crearea contextului de testare


        //2. cand? invocarea metodei de test folosit in contextul de la pasul 1
        double result = service.calculeazaTaxeSalariu(salariu, percent);
        // sa invoc un obiect si sa-i dau parametri - important testezi o metoda intr-o clasa

        //3. validare rezultat
        Assertions.assertEquals(15, result);// validezi rezultatul
        //foloseste framework de Assertions - multiple optiuni de testare

    }
    @Test
    public void testCalculeazaTaxeSalariuException() {
//1 crearea contextului de testare
        salariu = -100;

        //2. cand? invocarea metodei de test folosit in contextul de la pasul 1
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            service.calculeazaTaxeSalariu(salariu, percent);
        });

        // sa invoc un obiect si sa-i dau parametri - important testezi o metoda intr-o clasa

        //3. validare rezultat

        //foloseste framework de Assertions - multiple optiuni de testare

    }

}
