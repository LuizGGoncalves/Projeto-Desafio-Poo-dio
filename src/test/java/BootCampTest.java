import com.bootCamp.Model.BootCamp;
import com.bootCamp.Model.Cursos;
import com.bootCamp.Model.Devs;
import com.bootCamp.Model.Mentorias;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class BootCampTest {

    @Test
    void adicionarMentoria(){
        BootCamp bootCampTest = new BootCamp("Test","teste teste teste", LocalDate.of(2025,8,3));
        bootCampTest.addMentoria("Mentoria1","Teste teste teste",LocalDate.of(2025,12,20));
        Mentorias mentoria = new Mentorias("Mentoria1","Teste teste teste",LocalDate.of(2025,12,20));
        Assertions.assertEquals(mentoria.getTitulo(), bootCampTest.getMentorias().get(0).getTitulo());
        Assertions.assertEquals(mentoria.getDesc(), bootCampTest.getMentorias().get(0).getDesc());
        Assertions.assertEquals(mentoria.getData(), bootCampTest.getMentorias().get(0).getData());
    }

    @Test
    void adicionarCurso(){
        BootCamp bootCampTest = new BootCamp("Test","teste teste teste", LocalDate.of(2025,8,3));
        bootCampTest.addCurso("curso1","teste teste teste",35);
        Cursos curso = new Cursos("curso1","teste teste teste",35);
        Assertions.assertEquals( curso.getTitutlo(), bootCampTest.getCursos().get(0).getTitutlo());
        Assertions.assertEquals(curso.getDesc(),bootCampTest.getCursos().get(0).getDesc());
        Assertions.assertEquals(curso.getCargaHoraria(), bootCampTest.getCursos().get(0).getCargaHoraria());
    }

    @Test
    void adicionarDev(){
        BootCamp bootCampTest = new BootCamp("Test","teste teste teste", LocalDate.of(2025,8,3));
        bootCampTest.addDev("Pedro");
        Devs dev = new Devs("Pedro");
        Assertions.assertEquals(dev.getName(), bootCampTest.getDevs().get(0).getName());
    }
}
