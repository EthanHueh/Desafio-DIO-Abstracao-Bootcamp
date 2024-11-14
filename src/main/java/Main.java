import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Bootcamp bootcamp = inicializarBootcamp();

        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        Dev devJoao = new Dev("Joao");
        devJoao.inscreverBootcamp(bootcamp);

        printLinha();
        System.out.println(bootcamp);

        printLinha();
        System.out.println("Conteúdos Inscritos Camila:\n" + devCamila.getConteudosInscritos()+"\n");
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("\nConteúdos Inscritos Camila:\n" + devCamila.getConteudosInscritos());
        System.out.println("\nConteúdos Concluídos Camila:\n" + devCamila.getConteudosConcluidos());
        System.out.println("\nXP: " + devCamila.calcularTotalXp());

        printLinha();
        System.out.println("Conteúdos Inscritos João:\n" + devJoao.getConteudosInscritos()+"\n");
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("\nConteúdos Inscritos João:\n" + devJoao.getConteudosInscritos());
        System.out.println("\nConteúdos Concluidos João:\n" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
        printLinha();

    }

    private static Bootcamp inicializarBootcamp() {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp b = new Bootcamp();

        b.setNome("Bootcamp Java Developer");
        b.setDescricao("Descrição Bootcamp Java Developer");
        b.adicionar(curso1);
        b.adicionar(curso2);
        b.adicionar(mentoria);

        return b;

    }

    private static void printLinha(){
        System.out.println("======================================================================================");
    }

}
