package org.java.immobili;


import java.util.ArrayList;

public class AgenziaImmobiliare {


   ArrayList<Immobile> listaImmobili;



    public AgenziaImmobiliare() {

        listaImmobili = new ArrayList<>();
    }

    public ArrayList<Immobile> getListaImmobili() {
        return listaImmobili;
    }


    public void aggiungiImmobile(Immobile i)
    {
        listaImmobili.add(i);
    }

    public Immobile cercaImmobileTramiteCodiceAlfanumerico(String codiceImmobile)
    {
        for (Immobile i : listaImmobili)
        {
            if(i.getCodiceAlfanumerico().equals(codiceImmobile))
            {
                return i;
            }

        }

        return null;


    }


    public Immobile getImmobileConMaggiorNumeroInteressati()
    {
              Immobile maxImmobile = null;
              int max = -1;

              for(Immobile i : listaImmobili) {
                  int maxPersoneInteressate = i.getNumeroInteressati();

                  if (maxPersoneInteressate > max)
                  {
                      max = maxPersoneInteressate;
                      maxImmobile = i;

                  }


              }

              return maxImmobile;

    }




}
