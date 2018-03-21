package firsttest.main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Company {

    @Id @GeneratedValue
    private int id;
    private String name;

    @OneToMany(mappedBy = "company")
    private Set<Person> employees;

    public Company() {

    }

    public Company(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Person> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        String result = String.format("Company[id=%d, Name='%s']",id,name);
        return result;
    }

}
