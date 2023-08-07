package org.java.immobili;


import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AgenziaImmobiliare agenziaImmobiliare = new AgenziaImmobiliare();



        Box box = new Box("ABC12","via Borghetto,2","24120","Bermo",120,4);
        agenziaImmobiliare.aggiungiImmobile(box);

        Abitazione abitazione = new Abitazione("B260","Via della Neve, 2","20130","Tornello",150, 10, 4);
        agenziaImmobiliare.aggiungiImmobile(abitazione);

        Villa villa = new Villa("C340","via Tosa, 3","3020","Rosalvia",200,12,15,30);
        villa.reimpostaSuperfici(600);
        villa.reimpostaSuperfici(650, 400);
        agenziaImmobiliare.aggiungiImmobile(villa);

        System.out.println("Catalogo immobili: "+agenziaImmobiliare.getListaImmobili());

        boolean esci = false;

        while(!esci) {

            System.out.println("Vuoi valutare gli immobili? (y/n)");
            String rispostaUtente = sc.nextLine();
            if (rispostaUtente.equalsIgnoreCase("n")) {
                esci = true;
            } else {
                System.out.println("Sei interessato a " + box + " ? (y/n)");
                String rispostaUtenteBox = sc.nextLine();
                if (rispostaUtenteBox.equalsIgnoreCase("y"))
                    box.incrementaNumeroInteressati();
                System.out.println("Sei interessato a " + abitazione + " ? (y/n)");
                String rispostaUtenteAbitazione = sc.nextLine();
                if (rispostaUtenteAbitazione.equalsIgnoreCase("y"))
                    abitazione.incrementaNumeroInteressati();
                System.out.println("Sei interessato a " + villa + " ? (y/n)");
                String rispostaUtenteVilla = sc.nextLine();
                if (rispostaUtenteVilla.equalsIgnoreCase("y"))
                    abitazione.incrementaNumeroInteressati();
            }

        }


        System.out.println("L'immobile con maggior numero di interessati è: "+agenziaImmobiliare.getImmobileConMaggiorNumeroInteressati());





    }

}





