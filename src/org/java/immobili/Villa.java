package org.java.immobili;

public class Villa extends Abitazione {


    private int superficieGiardino;

    public Villa(String codiceAlfanumerico, String indirizzo, String cap, String citta, int superfice, int numeroVani, int numeroBagni, int superficieGiardino) {
        super(codiceAlfanumerico, indirizzo, cap, citta, superfice, numeroVani, numeroBagni);
        this.superficieGiardino = superficieGiardino;
    }


   public int getSuperficieGiardino()
   {return superficieGiardino;}


    //overload
    public void reimpostaSuperfici(int nuovaSuperficieAbitazione, int nuovaSuperficieGiardino) {

        reimpostaSuperfici(nuovaSuperficieAbitazione);
        this.superficieGiardino = nuovaSuperficieGiardino;
    }

    @Override
    public String toString() {
        return   "Villa="+super.toString()+
                " ,superficie giardino=" + superficieGiardino;
    }
}
