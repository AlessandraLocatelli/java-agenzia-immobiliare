package org.java.immobili;

import java.util.Scanner;

//creazione catalogo immobili
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AgenziaImmobiliare agenziaImmobiliare = new AgenziaImmobiliare();
        boolean esci = false;

        while (!esci) {
            System.out.println("Vuoi aggiungere immobili al catagolo? (y/n) ");
            String sceltaUtente = sc.nextLine();

            if (sceltaUtente.equalsIgnoreCase("n")) {
                esci = true;
            } else {

                System.out.println("Cosa vuoi aggiungere? 1.Box 2.Abitazione 3.Villa");
                String sceltaImmobile = sc.nextLine();

                System.out.println("Codice Alfanumerico: ");
                String codiceAlfanumericoInput = sc.nextLine();
                System.out.println("Indirizzo: ");
                String indirizzoInput = sc.nextLine();
                System.out.println("CAP: ");
                int capInput = Integer.parseInt(sc.nextLine());
                System.out.println("Città: ");
                String cittaInput = sc.nextLine();
                System.out.println("Superficie in mq: ");
                int superficieMqInput = Integer.parseInt(sc.nextLine());


                switch (sceltaImmobile) {
                    case "1":
                        System.out.println("Numero posti auto: ");
                        int numeroPostiAutoInput = Integer.parseInt(sc.nextLine());
                        Box box = new Box(codiceAlfanumericoInput, indirizzoInput, capInput, cittaInput, superficieMqInput, numeroPostiAutoInput);
                        agenziaImmobiliare.aggiungiImmobile(box);
                        System.out.println("Vuoi modificare la superficie di " + box + "  ?(y/n)");
                        String sceltaInput = sc.nextLine();
                        if (sceltaInput.equalsIgnoreCase("y")) {
                            System.out.println("Inserisci nuova superficie: ");
                            int nuovaSuperficieInput = Integer.parseInt(sc.nextLine());
                            box.reimpostaSuperfici(nuovaSuperficieInput);
                        }
                        System.out.println("Quanti sono gli interessati all'immobile " + box + "?");
                        int numeroInteressatiBoxInput = Integer.parseInt(sc.nextLine());
                        box.incrementaNumeroInteressati(numeroInteressatiBoxInput);
                        System.out.println("Numero interessati: "+box.getNumeroInteresssati());
                        break;

                    case "2":
                        System.out.println("Numero vani: ");
                        int numeroVaniAbitazioneInput = Integer.parseInt(sc.nextLine());
                        System.out.println("Numero bagni: ");
                        int numeroBagniAbitazioneInput = Integer.parseInt(sc.nextLine());
                        Abitazione abitazione = new Abitazione(codiceAlfanumericoInput, indirizzoInput, capInput, cittaInput, superficieMqInput, numeroVaniAbitazioneInput, numeroBagniAbitazioneInput);
                        agenziaImmobiliare.aggiungiImmobile(abitazione);
                        System.out.println("Vuoi modificare la superficie di " + abitazione + "  ?(y/n)");
                        sceltaInput = sc.nextLine();
                        if (sceltaInput.equalsIgnoreCase("y")) {
                            System.out.println("Inserisci nuova superficie: ");
                            int nuovaSuperficieInput = Integer.parseInt(sc.nextLine());
                            abitazione.reimpostaSuperfici(nuovaSuperficieInput);
                        }
                        System.out.println("Quanti sono gli interessati all'immobile " + abitazione + "?");
                        int numeroInteressatiAbitazioneInput = Integer.parseInt(sc.nextLine());
                            abitazione.incrementaNumeroInteressati(numeroInteressatiAbitazioneInput);
                        System.out.println("Numero interessati: "+abitazione.getNumeroInteresssati());
                        break;

                    case "3":
                        System.out.println("Numero vani: ");
                        int numeroVaniVillaInput = Integer.parseInt(sc.nextLine());
                        System.out.println("Numero bagni: ");
                        int numeroBagniVillaInput = Integer.parseInt(sc.nextLine());
                        System.out.println("Dimesioni giardino: ");
                        int dimensioneGiardinoMqInput = Integer.parseInt(sc.nextLine());
                        Villa villa = new Villa(codiceAlfanumericoInput, indirizzoInput, capInput, cittaInput, superficieMqInput, numeroVaniVillaInput, numeroBagniVillaInput, dimensioneGiardinoMqInput);
                        agenziaImmobiliare.aggiungiImmobile(villa);
                        System.out.println("Vuoi modificare la dimensione del giardino di " + villa + "  ?(y/n)");
                        sceltaInput = sc.nextLine();
                        if (sceltaInput.equalsIgnoreCase("y")) {
                            System.out.println("Inserisci nuova superficie: ");
                            int nuovaSuperficieInput = Integer.parseInt(sc.nextLine());
                            System.out.println("Inserisci nuova dimesione giardino: ");
                            int nuovaDimensioneInput = Integer.parseInt(sc.nextLine());
                            villa.reimpostaSuperfici(nuovaSuperficieInput, nuovaDimensioneInput);
                        }
                        System.out.println("Quanti sono gli interessati all'immobile " + villa + "?");
                        int numeroInteressatiVillaInput = Integer.parseInt(sc.nextLine());
                        villa.incrementaNumeroInteressati(numeroInteressatiVillaInput);
                        System.out.println("Numero interessati: "+villa.getNumeroInteresssati());
                        break;

                    default:
                        System.out.println("Scelta non valida.");
                        break;

                }

            }

        }

        System.out.println("CREAZIONE CATALOGO");
        System.out.println(agenziaImmobiliare.getListaImmobili());

        System.out.println("L'immobile di maggior interesse è: ");
        System.out.println(agenziaImmobiliare.trovaImmobileConMaggiorNumeroInteressati());

        System.out.println("Cerchi un immobile? Inserisci il suo codice alfanumerico: ");
        String codiceImmobileDaCercare  = sc.nextLine();
        System.out.println(agenziaImmobiliare.cercaImmobile(codiceImmobileDaCercare));








        sc.close();
    }



}
