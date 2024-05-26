package com.example.javaspring1;

import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.jfr.DataAmount;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(maxAge = 3600)
@RestController
public class ControllerFood {
    private final ObjectMapper om = new ObjectMapper();

    @GetMapping
    public Qwer get() {
       return new Qwer();
    }

    @PostMapping("/{number}")
    public Qwer post(@PathVariable Integer number) {
        Qwer numQwer = new Qwer();
        numQwer.id = number+10;
        return  numQwer;
    }

    static class Qwer {
        private String ind = "текст с сервера";
        private Integer id = 10;

        public String getInd() {
            return ind;
        }
        public void setInd(String ind) {
            this.ind = ind;
        }

        public Integer getId() {
            return id;
        }
        public void setId(Integer id) {
            this.id = id;
        }
    }
}
