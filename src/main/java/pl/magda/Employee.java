package pl.magda;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Employee {
    private String empName;
    private int salary;
}
