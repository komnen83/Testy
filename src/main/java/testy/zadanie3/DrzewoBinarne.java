package testy.zadanie3;

import java.util.LinkedList;

class DrzewoBinarne {

    public int iloscLisci(Wezel wezel) {
        if (wezel == null)
            return 0;
        if (wezel.getLeweDziecko() == null && wezel.getPraweDziecko() == null)
            return 1;
        else
            return iloscLisci(wezel.getLeweDziecko()) + iloscLisci(wezel.getPraweDziecko());
    }

    public int odwrocDrzewoBinarne(Wezel wezel) {
        LinkedList<Wezel> kolejka = new LinkedList<>();

        if (wezel != null) {
            kolejka.add(wezel);
        }

        while (!kolejka.isEmpty()) {
            Wezel lisc = kolejka.poll();
            if (lisc.getLeweDziecko() != null) {
                kolejka.add(wezel.getLeweDziecko());
            }
            if (lisc.getPraweDziecko() != null) {
                kolejka.add(wezel.getPraweDziecko());
            }

            lisc.setLeweDziecko(lisc.getPraweDziecko());
            lisc.setPraweDziecko(lisc.getLeweDziecko());
        }
        return odwrocDrzewoBinarne(wezel);
    }

}
