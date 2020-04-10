package t1708e.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import t1708e.exam.entity.PublisherCatalogs;
import t1708e.exam.repository.PublisherRepository;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/publisher")
public class PublisherController {
    @Autowired
    PublisherRepository publisherRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/create")
    public String create(Model model) {
        model.addAttribute("publisherCatalogs", new PublisherCatalogs());
        return "publisher-form";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public String store(Model model, @Valid PublisherCatalogs publisherCatalogs, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("publisherCatalogs", publisherCatalogs);
            return "book-form";
        }
        publisherRepository.save(publisherCatalogs);
        return "redirect:/";
    }
}
