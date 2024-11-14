package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
public class Bootcamp {

    private String nome;
    private String descricao;

    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    @Setter(AccessLevel.NONE)
    private final LocalDate dataInicial = LocalDate.now();
    
    @Setter(AccessLevel.NONE)
    private final LocalDate dataFinal = dataInicial.plusDays(45);

    public void adicionar(Curso curso) {
        conteudos.add(curso);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }

}
