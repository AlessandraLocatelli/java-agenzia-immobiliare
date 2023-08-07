package org.java.immobili;

public class Box extends Immobile {

    private int numeroPostiAuto;

    public Box(String codiceAlfanumerico, String indirizzo, String cap, String citta, int superfice, int numeroPostiAuto) {
        super(codiceAlfanumerico, indirizzo, cap, citta, superfice);

        this.numeroPostiAuto = numeroPostiAuto;
    }

    public int getNumeroPostiAuto() {
        return numeroPostiAuto;
    }


    @Override
    public String toString() {
        return  "Box=" +super.toString()+
                " ,numero posti auto=" + numeroPostiAuto;
    }
}
