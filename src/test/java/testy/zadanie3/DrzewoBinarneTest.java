package testy.zadanie3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DrzewoBinarneTest {

    Wezel lisc1 = new Wezel(1, null, null);
    Wezel lisc2 = new Wezel(3, null, null);
    Wezel lisc3 = new Wezel(6, null, null);
    Wezel lisc4 = new Wezel(9, null, null);

    Wezel wezelLewy = new Wezel(4, lisc1, lisc2);
    Wezel wezelPrawy = new Wezel(7, lisc3, lisc4);

    Wezel korzen = new Wezel(5, wezelLewy, wezelPrawy);

    DrzewoBinarne db = new DrzewoBinarne();

    @Test
    void iloscLisciTest() {

        int iloscLisci = db.iloscLisci(korzen);

        Assertions.assertEquals(4, iloscLisci);
    }

    @Test
    void odwroconeDrzewoBinarneTest() {

        System.out.println(db.toString());
        System.out.println(db.odwrocDrzewoBinarne(korzen));

        int result = db.odwrocDrzewoBinarne(korzen);

        Assertions.assertEquals(db, result);
    }
}