package org.java.immobili;

public class Immobile {

    private String codiceAlfanumerico;
    private String indirizzo;
    private String cap;
    private String citta;
    private int superfice;

    private int numeroInteressati;


    public Immobile(String codiceAlfanumerico, String indirizzo, String cap, String citta, int superfice) {
        this.codiceAlfanumerico = codiceAlfanumerico;
        this.indirizzo = indirizzo;
        this.cap = cap;
        this.citta = citta;
        this.superfice = superfice;
    }

    public String getCodiceAlfanumerico()
    {return  codiceAlfanumerico;}

    public String getIndirizzo() {
        return indirizzo;
    }

    public String getCap() {
        return cap;
    }

    public String getCitta() {
        return citta;
    }

    public int getSuperfice() {
        return superfice;
    }

    public int getNumeroInteressati()
    {
        return numeroInteressati;
    }


    public void incrementaNumeroInteressati()
    {
        numeroInteressati++;
    }


    public void reimpostaSuperfici(int nuovaSuperficie)
    {
        this.superfice = nuovaSuperficie;
    }



    @Override
    public String toString() {
        return
                "  codice alfanumerico='" + codiceAlfanumerico + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", cap='" + cap + '\'' +
                ", citta='" + citta + '\'' +
                ", superfice in mq=" + superfice +
                ", numero interessati=" + numeroInteressati;
    }
}
