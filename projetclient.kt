package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.sql.DriverManager.println

@RestController
class MyRestControler {

    //http://localhost:8080/test
    //Associer à une url
    @GetMapping("/test")
    fun test(): String {
        println("/test")

        return "HelloWorld"
    }
}