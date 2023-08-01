package org.java.immobili;

import java.util.ArrayList;
import java.util.List;

public class AgenziaImmobiliare {

    //CAMPI
    private List<Immobili> listaImmobili;


    //COSTRUTTORE


    public AgenziaImmobiliare() {
        listaImmobili = new ArrayList<>();
    }

    //METODI
    public List<Immobili> getListaImmobili() {
        return listaImmobili;
    }

    public void aggiungiImmobile(Immobili immobile)
    {
        listaImmobili.add(immobile);

    }

    public Immobili cercaImmobile(String codiceImmobile)
    {
        int index = 0;
        boolean trovato = false;
        Immobili immobileTrovato = null;

        while (!trovato && index < listaImmobili.size())
        {
            if(codiceImmobile.equals(listaImmobili.get(index).getCodiceAlfanumerico()))
            {
                immobileTrovato = listaImmobili.get(index);
                trovato = true;

            }

            index++;
        }

        return immobileTrovato;
    }

    //metodo trova immobile con maggior numero di interessati
    public Immobili trovaImmobileConMaggiorNumeroInteressati()
    {
        Immobili immobileConMaggiorNumeroInteressati = null;

          for (Immobili immobili : listaImmobili)
          {


          }

         return  immobileConMaggiorNumeroInteressati;
    }




}
