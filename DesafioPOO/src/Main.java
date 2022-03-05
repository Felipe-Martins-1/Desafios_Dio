
import java.time.LocalDate;

/**
 *
 * @author Felipe
 */
public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso 1");
        curso1.setDescricao("Desrição do curso 1");
        curso1.setCargaHoraria(45);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso 2");
        curso2.setCargaHoraria(23);
        curso2.setDescricao("Desrição do curso 2");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria");
        mentoria.setDescricao("Descrição da mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Felipe");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + dev1.getNome() + " = " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("\nConteúdos concluídos  " + dev1.getNome() + " = " + dev1.getConteudosConcluidos());
        System.out.println("XP = " + dev1.calcularTotalXp());
        
        System.out.println("\n");

        Dev dev2 = new Dev();
        dev2.setNome("João Victor");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + dev2.getNome() + " = " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("\nConteúdos concluídos  " + dev2.getNome() + " = " + dev2.getConteudosConcluidos());
        System.out.println("XP = " + dev2.calcularTotalXp());

    }

}
