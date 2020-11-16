package mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {
    @RequestMapping(value = "/form", method = RequestMethod.GET)
    String formGet() {
        return "form";
    }
}
