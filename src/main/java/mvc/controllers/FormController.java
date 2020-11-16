package mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
    @RequestMapping(value = "/form", method = RequestMethod.GET)
    String formGet(Model model) {
        model.addAttribute("unBoundTextBox", "Initial Value");
        return "form";
    }

    //Pass value through Path as QueryString
    @RequestMapping(value = "/form/{id}/var2/{id2}", method = RequestMethod.GET)
    String formPath(@PathVariable String id, @PathVariable String id2, Model model) {
        model.addAttribute("unBoundTextBox", id);
        model.addAttribute("id2", id2);
        return "form";
    }

    //Pass value through Params
    @RequestMapping(value = "/form", method = RequestMethod.POST)
    String formPost(@RequestParam("unBoundTextBox") String unBoundTextValue) {
        System.out.println("POSTBACK SUBMIT! - textbox value = " + unBoundTextValue);
        return "form";
    }

}
