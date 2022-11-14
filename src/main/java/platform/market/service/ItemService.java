package platform.market.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @KafkaListener(topics = "order.created",groupId = "order.created")
    public void itemDecreased(){

    }

    @KafkaListener(topics = "order.canceled",groupId = "order.canceled")
    public void itemIncreased(){

    }
}
