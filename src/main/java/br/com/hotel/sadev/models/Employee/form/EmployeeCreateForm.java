package br.com.hotel.sadev.models.Employee.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class EmployeeCreateForm {

    @NotNull @NotEmpty @Length(min = 10)
    private String fullName;

    @NotNull @NotEmpty @Email
    private String email;

    @NotNull @NotEmpty
    private String phone;

    @NotNull @NotEmpty @Length(min = 6)
    private String password;

    @NotNull @NotEmpty
    private String role;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
