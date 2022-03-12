package br.com.hotel.sadev.repositories.employee;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hotel.sadev.models.Employee.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
