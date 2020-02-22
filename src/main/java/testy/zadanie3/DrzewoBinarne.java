package testy.zadanie3;

class DrzewoBinarne {
    Wezel korzen;

    int iloscLisci() {
        return iloscLisci(korzen);
    }

    int iloscLisci(Wezel wezel) {
        if (wezel == null)
            return 0;
        if (wezel.lewy == null && wezel.prawy == null)
            return 1;
        else
            return iloscLisci(wezel.lewy) + iloscLisci(wezel.prawy);
    }

    public static void main(String args[]) {

        DrzewoBinarne drzewo = new DrzewoBinarne();
        drzewo.korzen = new Wezel(1);
        drzewo.korzen.lewy = new Wezel(2);
        drzewo.korzen.prawy = new Wezel(3);
        drzewo.korzen.lewy.lewy = new Wezel(4);
        drzewo.korzen.lewy.prawy = new Wezel(5);

        System.out.println("Ilosc lisci w drzewie binarnym = "
                + drzewo.iloscLisci());
    }
}
