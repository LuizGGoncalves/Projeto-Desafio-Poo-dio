import com.bootCamp.Model.BootCamp;
import com.bootCamp.Model.Cursos;
import com.bootCamp.Model.Devs;
import com.bootCamp.Model.Mentorias;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DevsTest {
    @Test
    void entrarEmUmBootCamp(){
        Devs dev = new Devs("Pedro");
        BootCamp bootCampTest = new BootCamp("Test","teste teste teste", LocalDate.of(2025,8,3));
        dev.inscrever(bootCampTest);
        Assertions.assertTrue(bootCampTest.getDevs().contains(dev));
    }
    @Test
    void calcularTotalDeXP(){
        Devs dev = new Devs("Pedro");
        Mentorias mentoria = new Mentorias("Mentoria","teste teste teste", LocalDate.of(2025,2,22));
        Cursos curso = new Cursos("Teste","teste teste teste",15);
        Mentorias mentoria2 = new Mentorias("Mentoria","teste teste teste", LocalDate.of(2025,2,22));
        Cursos curso2 = new Cursos("Teste","teste teste teste",15);
        dev.progredir(curso,curso2);
        dev.progredir(mentoria,mentoria2);
        Assertions.assertEquals(30*3.5f + 60 , dev.calcularXp());
    }

    @Test
    void progredir(){
        BootCamp bootCampTest = new BootCamp("Test","teste teste teste", LocalDate.of(2025,8,3));
        Devs dev = new Devs("Pedro");
        Mentorias mentoria = new Mentorias("Mentoria","teste teste teste", LocalDate.of(2025,2,22));
        Cursos curso = new Cursos("Teste","teste teste teste",15);
        bootCampTest.addCurso(curso);
        dev.inscrever(bootCampTest);
        dev.progredir(mentoria);
        dev.progredir(curso);
        Assertions.assertTrue(dev.getMentorias().contains(mentoria));
        Assertions.assertTrue(dev.getAtividadeFeita().contains(curso));
        Assertions.assertFalse(dev.getInscrito().contains(curso));
    }

    @Test
    void exibirCursos() {
        Devs dev = new Devs("Pedro");
        Cursos curso = new Cursos("Teste", "teste teste teste", 15);
        Cursos curso2 = new Cursos("Teste","teste teste teste",15);
        dev.progredir(curso,curso2);
        List<Cursos> cursos = new ArrayList<>(){{
            add(curso);
            add(curso2);
        }};
        Assertions.assertArrayEquals(cursos.toArray(),dev.exibirCursos().toArray());
    }
}

