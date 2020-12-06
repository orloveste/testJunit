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
        salariu = 100;
        percent = 15;
    }
    @Test
    public void testCalculeazaTaxeSalariu() {
        // 1 GIVEN
        // creare context de testare
        // 2 WHEN
        // invocare metoda de test
        // se va folosi contextul de invocare construit la pasul 1
        // + capturare rezultat
        double result = service.calculeazaTaxeSalariu(salariu, percent);
        // 3 THEN
        // validare rezultat
        Assertions.assertEquals(15, result);
    }
    @Test
    public void testCalculeazaTaxeSalariuException() {
        // 1 GIVEN
        // creare context de testare
        salariu = -100;
        // 2 WHEN
        // invocare metoda de test
        // se va folosi contextul de invocare construit la pasul 1
        // + capturare rezultat
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            service.calculeazaTaxeSalariu(salariu, percent);
        });
        // 3 THEN
        // validare rezultat
//        Assertions.assertEquals(15, result);
    }
}
