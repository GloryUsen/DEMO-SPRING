package com.tour.demospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SpringController {

    @GetMapping("/int/{number/{digits}")
    public int Numbers(@PathVariable ("int") int number,
                       @PathVariable ("digit") int digit) {
        return number + digit;

    }

    @GetMapping
}
