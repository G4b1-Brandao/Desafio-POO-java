import br.com.dio.Desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargahoraria(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        //System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcapm java developer");
        bootcamp.setDescricao("descrição java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabi = new Dev();
        devGabi.setNome("Gabi");
        devGabi.InscreverBootcapm(bootcamp);
        System.out.println("Conteudos inscritos"+ devGabi.getConteudosInscritos());
        devGabi.progredir();

        System.out.println("---");
        System.out.println("Conteudos inscritos"+ devGabi.getConteudosInscritos());
        System.out.println("Conteudos concluidos "+ devGabi.getConteudosConcluidos());
        System.out.println(("XP:"+ devGabi.calcularTotalXP()));

        System.out.println("-----------");

        Dev devDante = new Dev();
        devDante.setNome("Dante");
        devDante.InscreverBootcapm(bootcamp);
        System.out.println("Conteudos inscritos"+ devDante.getConteudosInscritos());
        devDante.progredir();
        devDante.progredir();
        devDante.progredir();

        System.out.println("Conteudos inscritos"+ devDante.getConteudosInscritos());
        System.out.println("Conteudos concluidos "+ devDante.getConteudosConcluidos());
        System.out.println(("XP:"+ devDante.calcularTotalXP()));

    }
}