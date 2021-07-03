package com.example.demo.conroller;
import com.example.demo.exception.PersonNotFoundException;
import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
//@SessionAttributes({"persons"})
public class Welcom {
   private PersonRepo repo;

    public PersonRepo getRepo() {
       return repo;
    }
//
    public void setRepo(PersonRepo repo) {
       this.repo = repo;
    }

    @GetMapping
    public String welcom(Model model){
model.addAttribute("message", "welcom to my site");
return "welcom";

    }
//    @GetMapping("/showperson")
//    public String showpersons(Model model){
//        return "showpersons";
//
//    }
//
//    @ModelAttribute("persons")
//    public List<Person> getAllGenres(){
//        return (List<Person>) repo.findAll();
//    }
}
