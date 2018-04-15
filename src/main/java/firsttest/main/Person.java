package firsttest.main;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Person {

    @Id @GeneratedValue
    private int id;
    private String name;
    private int age;
    @ManyToOne @JoinColumn(name = "company_id")
    @JsonBackReference
    private Company company;

    public Person() {}

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Company getCompany() {
        return company;
    }
}
