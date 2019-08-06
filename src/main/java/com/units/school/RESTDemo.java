package com.units.school;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RESTDemo implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        final String uri = "http://10.51.10.111:1000/registrations";
        Student student = new Student();
        student.setStudentName("John");
        student.setStudentNumber("00000");

        Student addedStudent = restTemplate.postForObject(uri,student, Student.class);
        System.out.println(addedStudent.toString());





    }

}
