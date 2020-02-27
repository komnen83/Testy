package testy.zadanie3;

class Wezel {
    private int wartoscWezla;
    private Wezel praweDziecko;
    private Wezel leweDziecko;

    public Wezel(int wartoscWezla, Wezel praweDziecko, Wezel leweDziecko) {
        this.wartoscWezla = wartoscWezla;
        this.praweDziecko = praweDziecko;
        this.leweDziecko = leweDziecko;
    }

    public Wezel getPraweDziecko() {
        return praweDziecko;
    }

    public Wezel getLeweDziecko() {
        return leweDziecko;
    }

    public void setPraweDziecko(Wezel praweDziecko) {
        this.praweDziecko = praweDziecko;
    }

    public void setLeweDziecko(Wezel leweDziecko) {
        this.leweDziecko = leweDziecko;
    }
}

