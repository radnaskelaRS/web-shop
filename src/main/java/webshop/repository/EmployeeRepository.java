package webshop.repository;

import org.springframework.data.repository.CrudRepository;

import webshop.entity.Employee;

/**
 * @author Aleksandar Gerden
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
