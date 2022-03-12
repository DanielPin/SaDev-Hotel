package br.com.hotel.sadev.services.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hotel.sadev.models.Employee.Employee;
import br.com.hotel.sadev.models.Employee.form.EmployeeCreateForm;
import br.com.hotel.sadev.repositories.employee.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;


    public Employee registerEmployee(EmployeeCreateForm employeeCreateForm) throws Exception {
        try {
            Employee employee = new Employee();
            employee.setFullName(employeeCreateForm.getFullName());
            employee.setEmail(employeeCreateForm.getEmail());
            employee.setPhone(employeeCreateForm.getPhone());
            employee.setPassword(employeeCreateForm.getPassword());
            employee.setRole(employeeCreateForm.getRole());
            return employeeRepository.save(employee);
        } catch (Exception e) {
            throw new Exception("Erro ao cadastrar funcionário");
        }
    }
}
