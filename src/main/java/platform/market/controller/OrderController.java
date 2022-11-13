package platform.market.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import platform.market.service.KafkaProducer;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final KafkaProducer kafkaProducer;

    @GetMapping("/order")
    public void orderCreated(){
        kafkaProducer.send();
    }
}
