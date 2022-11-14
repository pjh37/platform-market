package platform.market.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducer {
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void send(){
        OrderDTO orderDTO= OrderDTO.builder()
                .name("orderTEST")
                .quantity(20)
                .build();
        kafkaTemplate.send("order.created",orderDTO);
    }
}
