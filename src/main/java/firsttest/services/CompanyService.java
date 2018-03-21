package firsttest.services;

import firsttest.main.Company;
import firsttest.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository repository;

    public List<Company> findByName(String name) {
        return repository.findByName(name);
    }

    public List<Company> findAll() {
       return repository.findAll();
    }
}
