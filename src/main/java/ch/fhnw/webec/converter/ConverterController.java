package ch.fhnw.webec.converter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ConverterController {

    @GetMapping("convertInches")
    public ModelAndView convertInches(@RequestParam double inches) {
        final double result = inches * 2.54;
        final int cm = (int)result;
        final int mm = (int)Math.round(100 * (result - cm));
        final Map<String, Object> model = new HashMap<>();
        model.put("cm", cm);
        model.put("mm", mm);
        return new ModelAndView("ControllerOutput", model);
    }

}
