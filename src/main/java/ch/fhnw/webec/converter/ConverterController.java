package ch.fhnw.webec.converter;

import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

public class ConverterController {

    public ModelAndView convertInches(double inches) {
        final double result = inches * 2.54;
        final int cm = (int)result;
        final int mm = (int)Math.round(10 * (result - cm));
        final Map<String, Object> model = new HashMap<>();
        model.put("cm", cm);
        model.put("mm", mm);
        return new ModelAndView("ControllerOutput", model);
    }

}
