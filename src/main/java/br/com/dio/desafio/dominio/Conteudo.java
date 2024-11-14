package br.com.dio.desafio.dominio;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conteudo {

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();
}
