package edu.escuelaing.LabDes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyName {

    @GetMapping({ "/" })
    public String getName() {
        return "Hola Juan David Martinez";
    }
}