package org.example.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @RequestMapping ("/hello")
     public String m() {

      return "hello worlssssd";
     }
}
