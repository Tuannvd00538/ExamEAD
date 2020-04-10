package t1708e.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(method = RequestMethod.GET , value = "/book-form")
    public String bookform(){
        return "book-form";
    }

    @RequestMapping(method = RequestMethod.GET , value = "/publisher-form")
    public String publisherform(){
        return "publisher-form";
    }
}
