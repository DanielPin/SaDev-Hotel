package br.com.hotel.sadev.controllers.Employee;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hotel.sadev.models.Employee.Employee;
import br.com.hotel.sadev.models.Employee.form.EmployeeCreateForm;
import br.com.hotel.sadev.services.employee.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping()
    public ResponseEntity<?> registerEmployee(@RequestBody @Valid EmployeeCreateForm employeeCreateForm) {
        try {
            Employee employee = employeeService.registerEmployee(employeeCreateForm);
            return ResponseEntity.ok(employee);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
