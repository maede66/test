package com.example.demo.conroller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class Welcom {
//    private PersonRepo repo;
//
//    public PersonRepo getRepo() {
//        return repo;
//    }
//
//    public void setRepo(PersonRepo repo) {
//        this.repo = repo;
//    }

    @GetMapping
    public String welcom(Model model){
model.addAttribute("message", "welcom to my site");
return "welcom";

    }

//    @GetMapping()
//    public String showPersons(@PathVariable int id,
//                              Model model){
//        Person person =  repo.findById(id).orElseThrow(PersonNotFoundException::new);
//        model.addAttribute("person", person);
//        return "persons";
//    }

}
