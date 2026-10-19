package br.com.akasha.factory;

import br.com.akasha.model.Anime;
import br.com.akasha.model.Titulo;
import org.springframework.stereotype.Component;

@Component
public class CriadorAnime extends CriadorTitulo {

    @Override
    public Titulo criarTitulo() {
        return new Anime();
    }
}