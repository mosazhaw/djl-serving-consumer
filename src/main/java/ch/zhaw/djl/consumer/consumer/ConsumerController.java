package ch.zhaw.djl.consumer.consumer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConsumerController {

    @GetMapping("/ping")
    public String ping() {
        return "DJL Consumer app is up and running!";
    }

}