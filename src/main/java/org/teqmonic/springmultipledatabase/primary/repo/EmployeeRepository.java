package org.teqmonic.springmultipledatabase.primary.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.teqmonic.springmultipledatabase.primary.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
