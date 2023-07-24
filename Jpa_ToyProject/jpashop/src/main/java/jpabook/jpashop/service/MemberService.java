package jpabook.jpashop.service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true) // 데이터 변경 시 트랜잭션 작업 필수 // readOnly 조회 성능 최적화(데이터 읽기만)
@RequiredArgsConstructor // 생성자 인젝션
public class MemberService {
    private final MemberRepository memberRepository;

    /**
     * 회원 가입
    */
    @Transactional // 중요한 쓰기 부분에만 적용
    public Long join(Member member) {
        validateDuplicateMember(member); // 중복회원 검증
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        // 문제가 있다면 Exception
        List<Member> findMembers = memberRepository.findByName(member.getName());// 동일한 이름이 있는 지 확인
        if (!findMembers.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }

    // 회원 전체 조회
    public List<Member> findMember() {
        return memberRepository.findAll();
    }

    // 회원 한명 조회
    public Member findOne(Long memberId) {
        return memberRepository.findOne(memberId);
    }
}
