package testy.zadanie3;

// Program zwracajacy liczbe lisci w drzewie(lisc - wezel nie posiadajacy dzieci)

/* Class containing left and right child of current
 node and key value*/
class Wezel

{
    int wartoscWezla;
    Wezel lewy, prawy;

    public Wezel(int item)
    {
        wartoscWezla = item;
        lewy = prawy = null;
    }
}

