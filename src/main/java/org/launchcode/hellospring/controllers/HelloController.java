package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("hello")
public class HelloController {

    //    // Handle request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    // lives at /hello/goodbye
//    @GetMapping("goodbye")
//    public String goodbye() {
//        return "Goodbye, Spring!";
//    }
//
//    // Handles requests of the form /hello?name=LaunchCode
////    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
////    public String helloWithQueryParam(@RequestParam String name) {
////        return "Hello, " + name + "!";
////    }
//
//    // Handles requests of the form /hello/LaunchCode
//    @GetMapping("{name}")
//    public String helloWithPathParam(@PathVariable String name, Model model) {
//        String greeting =  "Hello from model, " + name + "!";
//        model.addAttribute("greeting", greeting);
//        return "hello";
//    }

    // /hello/form
    @GetMapping("form")
    @ResponseBody
    public String helloForm() {

      return  "<form method = 'post' action = '/hello'>"+
   "<input type='text' name='name'/>"+
       "<select name = 'languages'>"+
            "<option value = 'english'> English </option>"+
           "<option value = 'french'> French </option>"+
            "<option value = 'italian'> Italian </option>"+
            "<option value = 'spanish'> Spanish </option>"+
           "<option value = 'german'> German </option>"+
        "</select>"+
    "<input type='submit' value = 'Greet me'/>"+
"</form>" ;
    }

//    @GetMapping("-names")
//    public static String helloNames(Model model) {
//        List<String>names = new ArrayList<>();
//        names.add("Lc101");
//        names.add("java");
//        names.add("go");
//
//        model.addAttribute("names", names);
//        return "hello-list";
//    }

    @PostMapping()
    @ResponseBody
    public static String createMessage(@RequestParam String name, @RequestParam String languages) {
        if (name == null) {
            name = "World";
        }
        String greetings = "";

        if (languages.equals("english")) {
            greetings = "Hello, ";
        } else if (languages.equals("spanish")) {
            greetings = "Hola, ";
        } else if (languages.equals("russian")) {
            greetings = "hieee, ";
        } else if (languages.equals("italian")) {
            greetings = "bonjouor, ";
        } else {
            greetings = "Hi, ";
        }
    return greetings + name;
    }
}


//   -----------------------------------Ignore below.
//   @RequestMapping(value = "hello", method =  {RequestMethod.GET, RequestMethod.POST} )
//    public String hello(@RequestParam String name, Model model) {
//        String greeting = "Hola, " + name + "!";
//        model.addAttribute("greeting", greeting);
//        return "hello";
//    }
//
//    @GetMapping("hello/{name}")
//    @ResponseBody
//    public String helloWithPathParam (@PathVariable String name) {
//        return "Hi, " + name + "!!!";
//    }
//
//    @GetMapping("form")
//    public String helloForm() {
//        return "form";
//    }
//
//    @GetMapping("hellonames")
//    public String helloNames(Model model) {
//        ArrayList<String> names = new ArrayList<>();
//        names.add("java");
//        names.add("C");
//        names.add("Javascript");
//
//        model.addAttribute("names", names);
//        return "hello-list";
//    }
//
////    @PostMapping("hello")
////    @ResponseBody
////    public String createMessage(@RequestParam String name, @RequestParam String language) {
////
////        if (name == null){
////            name = "world";
////        }
////
////        String greetings = "";
////
////        if (language.equals("english")) {
////            greetings = "Hello, ";
////        } else if(language.equals("french")) {
////            greetings = "Bonjour, ";
////        } else if (language.equals("italian")) {
////            greetings = "bourningano, ";
////        } else if (language.equals("spanish")) {
////            greetings = "hola, ";
////        } else if (language.equals("german")) {
////            greetings = "hallo, ";
////        }
////        return greetings + name;
////
////    }

