package platform.market.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {

    @KafkaListener(topics = "order.created",groupId = "order.created")
    public void deliveryStart(){

    }

    @KafkaListener(topics = "order.canceled",groupId = "order.canceled")
    public void deliveryCanceled(){

    }
}
