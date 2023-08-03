package com.tmoh.sprinbootestting.repository;

import com.tmoh.sprinbootestting.model.Employee;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class EmployeeRepositoryTests {

    @Autowired
    private EmployeeRepository  employeeRepository;


    @DisplayName("Junit test for save employee operation")
    @Test
    void givenEmployeeObject_whenSave_thenReturnSavedEmployee() {
        // given - precondition or setup
        Employee employee = Employee.builder()
                .firstName("Mamady")
                .lastName("Doumbouya")
                .email("president@guinee.gn")
                .build();

        // when - action or the behaviour that we are going test
        Employee savedEmployee = employeeRepository.save(employee);

        // then - verify the output
        assertThat(savedEmployee).isNotNull();
        assertThat(savedEmployee.getId()).isGreaterThan(0);
    }
}
