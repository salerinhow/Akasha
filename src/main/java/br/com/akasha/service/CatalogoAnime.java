
package br.com.akasha.service;

import br.com.akasha.model.Titulo;
import br.com.akasha.strategy.EstrategiaOrdenacao;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogoAnime {

    public List<Titulo> ordenar(
            List<Titulo> titulos,
            EstrategiaOrdenacao estrategia) {
        return estrategia.ordenar(titulos);
    }
}
