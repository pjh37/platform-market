package platform.market.domain.order;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderRepositoryImpl implements OrderRepositoryCustom{
    private final JPAQueryFactory jpaQueryFactory;
}
