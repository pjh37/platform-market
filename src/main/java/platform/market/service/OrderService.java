package platform.market.service;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import platform.market.event.OrderCreatedEvent;
import platform.market.service.dto.OrderCreatedRequestDTO;
import platform.market.service.dto.OrderCreatedResponseDTO;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final KafkaTemplate<String,Object> kafkaTemplate;
    private final ApplicationEventPublisher applicationEventPublisher;

    @Transactional
    public OrderCreatedResponseDTO save(OrderCreatedRequestDTO request){
        applicationEventPublisher.publishEvent(new OrderCreatedEvent());
        return null;
    }
}
