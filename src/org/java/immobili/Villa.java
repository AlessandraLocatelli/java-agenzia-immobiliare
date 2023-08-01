package org.java.immobili;

public class Villa extends Abitazione {

    //CAMPI
    int dimensioneGiardinoMq;

    //COSTRUTTORE
    public Villa(String codiceAlfanumerico, String indirizzo, int cap, String citta, int numeroInteresssati, int superficieMq, int numeroVani, int numeroBagni, int dimensioneGiardinoMq) {
        super(codiceAlfanumerico, indirizzo, cap, citta, numeroInteresssati, superficieMq, numeroVani, numeroBagni);

        this.dimensioneGiardinoMq = dimensioneGiardinoMq;

    }

    //METODI

    //overload metodo reimposta superficie con aggiunta parametro superficieGiardino



    @Override
    public String toString() {
        return "Villa{" + super.toString()+
                "dimensioneGiardinoMq=" + dimensioneGiardinoMq +
                '}';
    }

}
