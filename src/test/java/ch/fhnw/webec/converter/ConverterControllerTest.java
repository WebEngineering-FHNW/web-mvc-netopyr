package ch.fhnw.webec.converter;

import org.junit.jupiter.api.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.assertj.core.api.Assertions.assertThat;

public class ConverterControllerTest {

    @Test
    public void testSimpleConversion() {
        // given:
        final double inches = 5.0;
        final ConverterController controller = new ConverterController();

        // when:
        final ModelAndView result = controller.convertInches(5);

        // then:
        assertThat(result.getModel()).containsEntry("cm", 12);
        assertThat(result.getModel()).containsEntry("mm", 7);
    }

}
