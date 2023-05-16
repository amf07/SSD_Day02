package sg.nus.iss.visa.sus.DAY02.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// For path to connect with the API request via localhost:8080; simple api handling method
@RestController
@RequestMapping(path = "/api")
public class DemoController {

    // path variables to connect of the folders request
    @GetMapping("/home/{name}")
    public HelloWorld getHome(@PathVariable String name){

        // Returning a simple object
        // json name file converted
        //return "Hello world";
        return new HelloWorld(name);
    }

        // path variables to connect of the folders request
        @GetMapping("/home/{name}")
        public HelloWorld getHome2(@PathVariable String name){
        //return "Hello world";
        return new HelloWorld(name);




        
    }
    

   
}