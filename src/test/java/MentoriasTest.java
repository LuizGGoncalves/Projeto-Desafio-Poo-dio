import com.bootCamp.Model.Mentorias;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class MentoriasTest {
    @Test
    void calcularXpMentorias(){
        Mentorias mentoria = new Mentorias("Mentoria","teste teste teste", LocalDate.of(2025,2,22));
        Assertions.assertEquals(30, mentoria.calculaXp());
    }
}
