package pl.sda.javagda25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {


        ArrayList ofertaSprzedażies = new ArrayList<>(Arrays.asList(
                new OfertaSprzedaży("Pierwsza", 34084),
                new OfertaSprzedaży("Druga", 2084),
                new OfertaSprzedaży("Trzecia", 40534),
                new OfertaSprzedaży("Czwarta", 854)
        ));


        System.out.println(ofertaSprzedażies);

        Collections.sort(ofertaSprzedażies, new OfertaSprzedazyComparator());
        System.out.println(ofertaSprzedażies);
    }
}


/*
  Stwórz klasę OfertaSprzedaży(String nazwaProduktu, double cena)
   a następnie stwórz komparator który sortuje OfertySprzedaży po cenie rosnąco lub malejąco.
   Wskazówka : dodaj do klasy komparatora dodatkowe pole (np. typu boolean) które w zależności od wartości inaczej sortuje obiekty.

    W mainie stwórz kilka instancji klasy OfertaSprzedaży i dodaj je do Listy.
    Po dodaniu posortuj listę i na ekran wypisz  wynik przed sortowaniem, oraz po sortowaniu.
    Spróbuj również sortowania 'w drugą stronę'.
    *Stwórz parser komend. Pozwól użytkownikowi w konsoli kontrolować aplikację.
     *  Parser powinien obsługiwać komendy:
    dodaj mleko 2.3
        listuj
        sortuj rosnaco (komenda nie listuje, tylko sortuje)
    sortuj malejaco (komenda nie listuje, tylko sortuje)
 */
