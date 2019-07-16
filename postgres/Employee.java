package com.zeedhi.samples.postgres;

import com.fasterxml.jackson.annotation.JsonProperty;

class Employee {
    @JsonProperty("employee_id")
    private int employeeId;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String name;
    @JsonProperty("email")
    private String email;
    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("hire_date")
    private String hireDate;
    @JsonProperty("job_id")
    private String jobId;
    @JsonProperty("salary")
    private String salary;
    @JsonProperty("commission_pct")
    private String commissionPct;
    @JsonProperty("manager_id")
    private String managerId;
    @JsonProperty("department_id")
    private String departmentId;
}
