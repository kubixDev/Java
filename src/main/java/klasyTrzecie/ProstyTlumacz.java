package klasyTrzecie;

// 8.Napisz program, który będzie umożliwiał tłumaczenie słów z języka polskiego na angielski.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProstyTlumacz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String translateType;
        String translateWord;

        // ustalone przykladowe slowa w hashmapie
        // kluczem w mapie sa slowa polskie
        // wartoscia kluczy sa slowa angielskie
        Map<String, String> mapa = new HashMap<>();
        mapa.put("klucz", "key");
        mapa.put("wartosc", "value");
        mapa.put("samochod", "car");
        mapa.put("notatnik", "notepad");
        mapa.put("pies", "dog");
        mapa.put("kot", "cat");


        System.out.println("Wybierz rodzaj tlumaczenia: 1 - polskoAng, 2 - angielskoPol");
        translateType = input.nextLine();

        switch (translateType) {
            case "1": {
                System.out.println();
                System.out.println("Wprowadz wyraz:");
                translateWord = input.nextLine();

                for (Map.Entry<String, String> para : mapa.entrySet()) {

                    // para.getKey to slowo po polsku, jezeli zgadza sie ze slowem z mapy, zwraca slowo angielskie
                    if (para.getKey().equals(translateWord)) {
                        System.out.println("ANG: " + para.getValue());
                    }
                }
                break;
            }

            case "2": {
                System.out.println("Wprowadz wyraz:");
                translateWord = input.nextLine();

                for (Map.Entry<String, String> para : mapa.entrySet()) {

                    // para.getValue to slowo po angielsku, jezeli zgadza sie ze slowem z mapy, zwraca slowo polskie
                    if (para.getValue().equals(translateWord)) {
                        System.out.println("POL: " + para.getKey());
                    }
                }
                break;
            }

            default: {
                System.out.println("Nieznany typ tlumaczenia");
                break;
            }
        }
    }
}