package org.java.immobili;

public class Villa extends Abitazione {

    //CAMPI
    int dimensioneGiardinoMq;

    //COSTRUTTORE
    public Villa(String codiceAlfanumerico, String indirizzo, int cap, String citta, int superficieMq, int numeroVani, int numeroBagni, int dimensioneGiardinoMq) {
        super(codiceAlfanumerico, indirizzo, cap, citta, superficieMq, numeroVani, numeroBagni);
        this.dimensioneGiardinoMq = dimensioneGiardinoMq;

    }

    //METODI

    //overload metodo reimposta superficie con aggiunta parametro superficieGiardino



    public void reimpostaSuperfici(int nuovaSuperficie, int superficieGiardino) {

        setSuperficieMq(nuovaSuperficie);
        this.dimensioneGiardinoMq = superficieGiardino;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString()+
                "dimensioneGiardinoMq=" + dimensioneGiardinoMq +
                '}';
    }

}
