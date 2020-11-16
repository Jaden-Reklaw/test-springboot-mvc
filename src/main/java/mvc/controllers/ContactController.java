package mvc.controllers;

import mvc.models.ContactModel;
import mvc.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contactGet(Model model){
        model.addAttribute("contact", new ContactModel());
        return "contact";
    }

    //Binds a model to a platform
    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public String contactPost(Model model, @ModelAttribute("contact") ContactModel contactModel) {
        contactRepository.save(contactModel);
        System.out.println(contactModel.ToString());
        return "redirect:/contact";
    }
}
