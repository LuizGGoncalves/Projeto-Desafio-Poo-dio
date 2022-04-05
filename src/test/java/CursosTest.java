import com.bootCamp.Model.Cursos;
import com.bootCamp.Model.Mentorias;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class CursosTest {

    @Test
    void calcularXpCurso() {
        Cursos curso = new Cursos("Teste","teste teste teste",15);
        Assertions.assertEquals(15*3.5f, curso.calculaXp());
    }
}
