package org.java.immobili;

public class Immobili {

    //CAMPI
    private String codiceAlfanumerico;
    private String indirizzo;
    private int cap;
    private String citta;

    private int numeroInteresssati;
    private int superficieMq;


    //COSTRUTTORE

    public Immobili(String codiceAlfanumerico, String indirizzo, int cap, String citta, int superficieMq) {
        this.codiceAlfanumerico = codiceAlfanumerico;
        this.indirizzo = indirizzo;
        this.cap = cap;
        this.citta = citta;
        this.superficieMq = superficieMq;
    }


    //METODI

    public int getSuperficieMq()
    {
        return getSuperficieMq();
    }

    public void setSuperficieMq(int superficieMq)
    {this.superficieMq = superficieMq;}

    public String getCodiceAlfanumerico() {
        return codiceAlfanumerico;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public int getCap() {
        return cap;
    }

    public String getCitta() {
        return citta;
    }

    public int getNumeroInteresssati() {
        return numeroInteresssati;
    }

    //metodo per incrementare numero persone interessate all'acquisto dell'immobile
    public void incrementaNumeroInteressati()
    {

        numeroInteresssati = numeroInteresssati +1;
    }

    //metodo reimpostaSuperfici che prende in input la nuova superficie.
    public int reimpostaSuperfici (int nuovaSuperficie)
    {

        this.superficieMq = nuovaSuperficie;

        return  nuovaSuperficie;

    }


    @Override
    public String toString() {
        return  "codiceAlfanumerico='" + codiceAlfanumerico + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", cap=" + cap +
                ", citta='" + citta + '\'' +
                ", numeroInteresssati=" + numeroInteresssati +
                ", superficieMq=" + superficieMq;
    }
}
