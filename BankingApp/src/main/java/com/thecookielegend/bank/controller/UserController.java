package com.thecookielegend.bank.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "World") String name) {
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = i;
        }
        String s = arrayToString(array);
        return String.format("Numbers! %s", s);
    }


    private String arrayToString(int[] arr) {
        StringBuilder builder = new StringBuilder("[ ");
        for (var i : arr) {
            builder.append(i).append(", ");
        }
        builder.append("]");
        return builder.toString();
    }
}
