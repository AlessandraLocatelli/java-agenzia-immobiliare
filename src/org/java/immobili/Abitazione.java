package org.java.immobili;

public class Abitazione extends Immobili{

    //CAMPI
    private int numeroVani;
    private int numeroBagni;

    //COSTRUTTORE

    public Abitazione(String codiceAlfanumerico, String indirizzo, int cap, String citta, int superficieMq, int numeroVani, int numeroBagni) {
        super(codiceAlfanumerico, indirizzo, cap, citta, superficieMq);
        this.numeroVani = numeroVani;
        this.numeroBagni = numeroBagni;
    }


    //METODI

    public int getNumeroVani() {
        return numeroVani;
    }

    public int getNumeroBagni() {
        return numeroBagni;
    }

    @Override
    public String toString() {
        return "Abitazione{" + super.toString()+
                "numeroVani=" + numeroVani +
                ", numeroBagni=" + numeroBagni +
                '}';
    }
}
