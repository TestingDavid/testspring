package firsttest.controllers;

import firsttest.main.Person;
import firsttest.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import java.util.Random;

@RestController
@RequestMapping(value = "/person", method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
public class PersonController {

    @Autowired
    private PersonService service;

    private Random rand = new Random();

    @RequestMapping(value = "")
    public Person getPerson(@RequestParam(value = "name", defaultValue = "Penis") String name) {
        return new Person(rand.nextInt(100),name, rand.nextInt(100));
    }

    @RequestMapping("/{realname}")
    public Person findPersonByName(@PathVariable("realname") String realname) {
        return service.findByName(realname);
    }
}
