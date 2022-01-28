import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição curso javasript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao mentoria java");
        mentoria.setData(LocalDate.now());


       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Descricao bootcamp Java developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev DevIsrael = new  Dev();
        DevIsrael.setNome("Israel");
        DevIsrael.increverBootcamp(bootCamp);
        System.out.println("Conteudos Incritos Israel" +  DevIsrael.getConteudosInscritos());
        DevIsrael.progredir();
        DevIsrael.progredir();
        System.out.println("-");
        System.out.println("Conteudos Incritos Israel " +  DevIsrael.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Israel " + DevIsrael.getConteudosConcluidos());
        System.out.println("XP= " + DevIsrael.calcularTotalXp());


        System.out.println("---------------");

        Dev DevAmanda = new Dev();
        DevAmanda.setNome("Amanda");
        DevAmanda.increverBootcamp(bootCamp);
        System.out.println("Contudos Incritos Amanda " + DevAmanda.getConteudosInscritos());
        DevAmanda.progredir();
        DevAmanda.progredir();
        DevAmanda.progredir();
        System.out.println("-");
        System.out.println("Contudos Incritos Amanda " + DevAmanda.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Amanda " + DevAmanda.getConteudosConcluidos());
        System.out.println("XP= " + DevAmanda.calcularTotalXp());






    }
}
