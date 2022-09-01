package com.bl.springdemo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @RequestMapping (value = {"", "/", "/home"})
    public String sayHello(){
        return "hello";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name){
        return "hello " + name + "!";
    }

    @RequestMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello " + name +"!";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "Hello " +  user.getFirstName() + " " + user.getLastName();
    }

    @PutMapping("/put/{firstname}")
    public String sayHello(@PathVariable String firstname, @RequestParam(value = "lastName") String lastName) {
        return "hello " + firstname + " " + lastName;
    }
}
