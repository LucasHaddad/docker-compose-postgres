package com.zeedhi.samples.postgres;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.stereotype.Controller
class PostgresController {

    @GetMapping("/postgres")
    public String get() {
        return "greeting";
    }

    @PostMapping("/postgres")
    public String post(@RequestBody Employee employee) {
        return "greeting";
    }

    @PutMapping("/postgres")
    public String put(@RequestBody Employee employee) {
        return "greeting";
    }

    @DeleteMapping("/postgres/{employee_id}")
    public String delete() {
        return "greeting";
    }
}