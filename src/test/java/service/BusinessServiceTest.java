package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.time.Duration;

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
        Assertions.assertTimeout(Duration.ofSeconds(5), () -> {
            //pass
        });
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

    @ParameterizedTest
    @CsvFileSource(resources = {"/test_data.csv"}, numLinesToSkip = 1)
    public void testCalculeazaDeduceri() {
        //1

        //2
        int result1 = service.calculeazaDeduceri(999, 1);
        int result2 = service.calculeazaDeduceri(999, 2);
        int result3 = service.calculeazaDeduceri(999, 3);
        int result4 = service.calculeazaDeduceri(999, 4);
        int result5 = service.calculeazaDeduceri(999, 5);
        int result6 = service.calculeazaDeduceri(1000, 5);
        //3
        Assertions.assertEquals(0, result1);
        Assertions.assertEquals(10, result2);
        Assertions.assertEquals(15, result3);
        Assertions.assertEquals(20, result4);
        Assertions.assertEquals(30, result5);
        Assertions.assertEquals(0, result6);
    }
}
