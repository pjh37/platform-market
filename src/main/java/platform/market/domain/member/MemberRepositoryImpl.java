package platform.market.domain.member;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepositoryCustom{
    private final JPAQueryFactory jpaQueryFactory;
}
