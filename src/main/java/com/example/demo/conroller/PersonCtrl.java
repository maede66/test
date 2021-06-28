package com.example.demo.conroller;

import com.example.demo.repository.PersonRepo;
import com.example.demo.model.Person;
import com.example.demo.exception.PersonNotFoundException;
import com.example.demo.repository.PersonRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;

@Controller
@RequestMapping("/person")
public class PersonCtrl {
    private PersonRepo repo;

    public PersonCtrl(PersonRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/register")
    public String showregform() {
        return "register";
    }

    @PostMapping("/register")
    public String register(@Valid Person person, Errors error, RedirectAttributes model) {
        if (error.hasErrors())
            return "register";
        repo.save(person);
        model.addAttribute("id", person.getId());
        model.addFlashAttribute("person", person);
        return "welcom";
    }

//    @GetMapping("/{id}")
//    public String showPersons( Model model,@PathVariable int id){
//     Optional<Person> optional= repo.findById(id);
//     Person person=optional.get();
//     model.addAttribute("person" ,person );
//     return "showperson";
//    }



//    @GetMapping("/{id}")
//    public String getPersonDetails(@PathVariable int id, Model model){
//        Person person =  repo.findById(id).orElseThrow(PersonNotFoundException::new);
//        model.addAttribute("person", person);
//        return "personDetails";
//    }

//@RequestMapping("/show")
//    public String showdetail(Model model, @RequestParam() int id){
//        Optional<Person> optional= repo.findById(id);
//        Person person=optional.get();
//        model.addAttribute("person" , person);
//        return "showPerson";
//    }
}

