package br.com.akasha.strategy;

import br.com.akasha.model.Titulo;
import java.util.List;

public interface EstrategiaOrdenacao {

    List<Titulo> ordenar(List<Titulo> titulos);

}
