package org.java.immobili;

public class Abitazione extends Immobile {

    private int numeroVani;
    private int numeroBagni;

    public Abitazione(String codiceAlfanumerico, String indirizzo, String cap, String citta, int superfice, int numeroVani, int numeroBagni)
    {
        super(codiceAlfanumerico,indirizzo,cap,citta,superfice);
        this.numeroVani = numeroVani;
        this.numeroBagni = numeroBagni;

    }

    public int getNumeroVani() {
        return numeroVani;
    }

    public int getNumeroBagni() {
        return numeroBagni;
    }


    @Override
    public String toString() {
        return  "Abitazione="+super.toString()+
                " ,numero vani=" + numeroVani +
                " ,numero bagni=" + numeroBagni;
    }
}
