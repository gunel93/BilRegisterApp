package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RegisterController {

    private final List<Register> registerList = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagreRegister(Register register){
        registerList.add(register);

    }

    @GetMapping("/hentAlle")
    public List<Register> hentAlle(){
        return registerList;
    }

    @GetMapping("/slettAlle")
    public void slettAlle(){
        registerList.clear();
    }
}
