package t1708e.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import t1708e.exam.entity.BookDetails;
import t1708e.exam.entity.PublisherCatalogs;
import t1708e.exam.repository.BooksRepository;
import t1708e.exam.repository.PublisherRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    BooksRepository booksRepository;

    @Autowired
    PublisherRepository publisherRepository;


    @RequestMapping(method = RequestMethod.GET, value = "/create")
    public String create(Model model) {
        List<PublisherCatalogs> publisherCatalogs = publisherRepository.findAll();
        model.addAttribute("bookDetails", new BookDetails());
        model.addAttribute("publisherCatalogs", publisherCatalogs);
        return "book-form";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public String store(Model model, @Valid BookDetails bookDetails, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("bookDetails", bookDetails);
            return "book-form";
        }
        booksRepository.save(bookDetails);
        return "redirect:/";
    }
}
