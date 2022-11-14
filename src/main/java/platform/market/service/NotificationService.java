package platform.market.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @KafkaListener(topics = "order.created",groupId = "order.created")
    public void notifyOrderCreated(){

    }

    @KafkaListener(topics = "order.canceled",groupId = "order.canceled")
    public void notifyOrderCanceled(){

    }
}
