package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository(); // 회원 찾기
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy(); // 고정 할인


    // 단일 책임 원칙 O
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);// 멤버 찾기
        int discountPrice = discountPolicy.discount(member, itemPrice); // 최종적으로 할인받은 멤버, 가격 정보

        return new Order(memberId, itemName, itemPrice, discountPrice); // 최종적으로 생성된 주문
    }
}
