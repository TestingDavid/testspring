package firsttest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class PersonController {

    private Random rand = new Random();

    @RequestMapping("/person")
    public Person getPerson(@RequestParam(value = "name", defaultValue = "Penis") String name) {
        return new Person(name, rand.nextInt(100));
    }
}
