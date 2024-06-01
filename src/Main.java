import dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição do curso Javascript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição do curso Javascript");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria);

        Conteudo conteudo = new Curso();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMaciel = new Dev();
        devMaciel.setNome("Maciel");
        devMaciel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Maciel: " + devMaciel.getConteudosInscritos());
        devMaciel.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos Maciel: " + devMaciel.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Maciel: " + devMaciel.getConteudosConcluidos());
        System.out.println("XP: " + devMaciel.calcularTotalXp());

        System.out.println("------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Maciel");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Maciel: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos Maciel: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Maciel: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());


    }
}
