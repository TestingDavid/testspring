package firsttest.controllers;

import firsttest.main.Person;
import firsttest.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonUpdateController {

    @Autowired
    private PersonService service;

    @RequestMapping(value = "/update/one", method = RequestMethod.POST)
    public ResponseEntity <String> persistPerson(@RequestBody Person person) {
        if(isValid(person)) {
            System.out.println("Found person: " + person.getCompany().toString());
            service.save(person);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
    }

    private boolean isValid(Person person) {
        return service.existsById(person.getId());
    }
}
