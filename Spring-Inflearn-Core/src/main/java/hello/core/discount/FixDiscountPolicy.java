package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {
    private int discountFixAmount = 1000; // 1000원 할인
    
    @Override
    public int discount(Member member, int price) {
        // VIP 만 1000원 할인
        if (member.getGrade() == Grade.VIP) { // enum 타입이면 == 사용 가능
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
