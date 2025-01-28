package org.teqmonic.springmultipledatabase.primary.model;

import jakarta.persistence.*;

@Entity
//@Table(name = "Employee") // -- due to datasource properties are enables in datasource configuration
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_id_seq")
    @Column(name = "id", nullable = false)
    private Long id;

    // we can uncomment below exact column name due CamelCaseToUnderscoresNamingStrategy in the datasource config

    //@Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(nullable = false)
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
