package net.javaguides.ems.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // to create the getter
@Setter // to create the setter
@NoArgsConstructor // to create the no argument constructor
@AllArgsConstructor // to create the parameterized constructor
@Entity // we use this to specify class as a JP Entity
@Table(name="employees") // to specify the table details

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // to specify the primary key and use database auto increment features
    private Long id;

    @Column(name="first_name") // to map database table collumn with class
    //to explicitly configure the column name for this field
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email_id", nullable = false, unique = true) // set the email field to be cannot be null and ar3e always unique
    private String email;

    public Employee(Long id, String firstName, String lastName, String email) {
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
