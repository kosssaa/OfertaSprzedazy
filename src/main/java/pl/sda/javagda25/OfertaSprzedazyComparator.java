package pl.sda.javagda25;

import java.util.Comparator;

public class OfertaSprzedazyComparator implements Comparator<OfertaSprzedaży> {


    public int compare(OfertaSprzedaży o1, OfertaSprzedaży o2) {


        if (o1.getCena() > o2.getCena()) {
            return 1;
        } else if (o1.getCena() < o2.getCena()) {
            return -1;
        }
        return 0;}

    }
