package platform.market.domain.delivery;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DeliveryRepositoryImpl implements DeliveryRepositoryCustom{
    private final JPAQueryFactory jpaQueryFactory;
}
