package br.com.dio.desafio.dominio;


import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "\nMentoria {\n" +
                "    titulo = '" + getTitulo() + '\'' +
                ", descricao = '" + getDescricao() + '\'' +
                ", data = " + data +
                "\n}\n";
    }
}
