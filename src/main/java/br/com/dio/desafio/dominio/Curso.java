package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "\nCurso {\n" +
                "    titulo = '" + getTitulo() + '\'' +
                ", descricao = '" + getDescricao() + '\'' +
                ", cargaHoraria = " + cargaHoraria +
                "\n}\n";
    }
}
