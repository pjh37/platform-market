package platform.market.event.handler;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;
import platform.market.event.OrderCreatedEvent;

@Component
@RequiredArgsConstructor
public class OrderEventHandler {
    private final KafkaTemplate<String,Object> kafkaTemplate;

    @TransactionalEventListener
    public void orderCreated(OrderCreatedEvent orderCreatedEvent){

    }
}
