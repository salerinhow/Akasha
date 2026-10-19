

package br.com.akasha;

import br.com.akasha.factory.CriadorAnime;
import br.com.akasha.model.Anime;
import br.com.akasha.model.Titulo;
import br.com.akasha.service.CatalogoAnime;
import br.com.akasha.strategy.OrdenarPorNome;
import br.com.akasha.strategy.OrdenarPorAvaliacao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DemonstracaoAkasha implements CommandLineRunner {

    private final CriadorAnime criador;
    private final CatalogoAnime catalogo;
    private final OrdenarPorNome ordenarPorNome;
    private final OrdenarPorAvaliacao ordenarPorAvaliacao;

    public DemonstracaoAkasha(
            CriadorAnime criador,
            CatalogoAnime catalogo,
            OrdenarPorNome ordenarPorNome,
            OrdenarPorAvaliacao ordenarPorAvaliacao) {
        this.criador = criador;
        this.catalogo = catalogo;
        this.ordenarPorNome = ordenarPorNome;
        this.ordenarPorAvaliacao = ordenarPorAvaliacao;
    }

    @Override
    public void run(String... args) {
        Anime anime1 = (Anime) criador.criarTitulo();
        anime1.setNome("One Piece");
        anime1.setAvaliacao(9.5);

        Anime anime2 = (Anime) criador.criarTitulo();
        anime2.setNome("Attack on Titan");
        anime2.setAvaliacao(9.8);

        Anime anime3 = (Anime) criador.criarTitulo();
        anime3.setNome("Naruto");
        anime3.setAvaliacao(8.7);

        List<Titulo> animes = new ArrayList<>();
        animes.add(anime1);
        animes.add(anime2);
        animes.add(anime3);

        System.out.println("=== AKASHA: ORDENADO POR NOME ===");

        catalogo.ordenar(animes, ordenarPorNome)
                .forEach(anime ->
                        System.out.println(anime.getNome()
                                + " - Nota: " + anime.getAvaliacao()));

        System.out.println("\n=== AKASHA: ORDENADO POR AVALIACAO ===");

        catalogo.ordenar(animes, ordenarPorAvaliacao)
                .forEach(anime ->
                        System.out.println(anime.getNome()
                                + " - Nota: " + anime.getAvaliacao()));
    }
}
