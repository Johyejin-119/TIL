package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MemberServiceTest {

    MemberService memberService;
    MemoryMemberRepository memoryMemberRepository;

    @BeforeEach
    public void beforeEach() {
        memoryMemberRepository = new MemoryMemberRepository();
        memberService = new MemberService(memoryMemberRepository);
    }


    @AfterEach
    public void afterEach() {
        memoryMemberRepository.clearStore();
    }

    @Test
    void 회원가입() {
        // given 무언가 주어졌을 때
        Member member = new Member();
        member.setName("spring");

        // when 이런 상황이라면
        Long saveId = memberService.join(member); // 새로 저장한 id

        // then 원하는 결과가 나와야 함함
        Member findMember = memberService.findOne(saveId).get(); // 저장소의 id
        assertThat(member.getName()).isEqualTo(findMember.getName()); // 위 두 id의 name 이 같은 가

    }

    @Test
    public void 중복_회원_예외() {
        // given
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring");

        // when
        // 같은 값(spring) 저장
        memberService.join(member1);

        // 1. 람다식
        // memberService.join(member2) 로직 실행 시, IllegalStateException 예외가 터지는 가
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));
        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");

/*      // 2. try~catch
        try {
            memberService.join(member2);
            // 실패
            fail();
        } catch (IllegalStateException e) {
            // 정상
            // validateDuplicateMember 회원 중복 방지 메서드의 메시지와 동일한 가
            assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
        }
*/


        // then
    }


    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}