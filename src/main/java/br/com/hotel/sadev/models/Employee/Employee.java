package br.com.hotel.sadev.models.Employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.hotel.sadev.models.Person;

@Entity
public class Employee extends Person {
    String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
