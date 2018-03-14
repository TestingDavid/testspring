package firsttest.services;

import firsttest.main.Person;
import firsttest.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public Person findByName(String name) {
        return repository.findByName(name);
    }
}
