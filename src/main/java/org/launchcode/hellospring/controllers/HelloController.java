package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.ArrayList;


@Controller
public class HelloController {

    @RequestMapping(value = "hello", method =  {RequestMethod.GET, RequestMethod.POST} )
    public String hello(@RequestParam String name, Model model) {
        String greeting = "Hola, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithPathParam (@PathVariable String name) {
        return "Hi, " + name + "!!!";
    }

    @GetMapping("form")
    public String helloForm() {
        return "form";
    }

    @GetMapping("hellonames")
    public String helloNames(Model model) {
        ArrayList<String> names = new ArrayList<>();
        names.add("java");
        names.add("C");
        names.add("Javascript");

        model.addAttribute("names", names);
        return "hello-list";
    }

//    @PostMapping("hello")
//    @ResponseBody
//    public String createMessage(@RequestParam String name, @RequestParam String language) {
//
//        if (name == null){
//            name = "world";
//        }
//
//        String greetings = "";
//
//        if (language.equals("english")) {
//            greetings = "Hello, ";
//        } else if(language.equals("french")) {
//            greetings = "Bonjour, ";
//        } else if (language.equals("italian")) {
//            greetings = "bourningano, ";
//        } else if (language.equals("spanish")) {
//            greetings = "hola, ";
//        } else if (language.equals("german")) {
//            greetings = "hallo, ";
//        }
//        return greetings + name;
//
//    }

}
