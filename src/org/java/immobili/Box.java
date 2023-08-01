package org.java.immobili;

public class Box extends Immobili {

    //CAMPI
    private int numeroPostiAuto;

    //COSTRUTTORE
    public Box(String codiceAlfanumerico, String indirizzo, int cap, String citta, int superficieMq, int numeroPostiAuto) {
        super(codiceAlfanumerico, indirizzo, cap, citta, superficieMq);

        this.numeroPostiAuto = numeroPostiAuto;

    }

    //METODI
    public int getNumeroPostiAuto() {
        return numeroPostiAuto;
    }

    @Override
    public String toString() {
        return "Box{" + super.toString()+
                "numeroPostiAuto=" + numeroPostiAuto +
                '}';
    }
}
