package br.com.akasha.strategy;

import br.com.akasha.model.Titulo;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;

@Component
public class OrdenarPorAvaliacao implements EstrategiaOrdenacao {

    @Override
    public List<Titulo> ordenar(List<Titulo> titulos) {
        return titulos.stream()
                .sorted(
                        Comparator.comparingDouble(Titulo::getAvaliacao)
                                .reversed()
                )
                .toList();
    }
}
