package ch.nostromo.xmlresponsetest.controller;

import ch.nostromo.xmlresponsetest.dto.MyCoolObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/")
public class TestController {

    @GetMapping("/defaultRequest")
    public MyCoolObject customConfig() {
        return new MyCoolObject("Hello from Default Request", new Date());
    }

}
