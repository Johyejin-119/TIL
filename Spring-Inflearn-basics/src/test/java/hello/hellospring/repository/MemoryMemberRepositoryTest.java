package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    // 각 테스트 메서드들이 끝나면, 저장된 데이터를 clear 하는 콜백메서드
    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }


    @Test
    public void save() {
        // 새롭게 생성한 데이터
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        // 저장소에서 꺼낸 데이터
        // Optional 에서 값을 꺼낼 때는 .get()
        Member result = repository.findById(member.getId()).get(); // id 찾기

        // 위 두 데이터가 동일한지 테스트
        // 1. 단순비교 true
        // System.out.println("result = " + (result == member));

        // 2. jupiter 사용
        // Assertions.assertEquals(member, result); // spring(member)이 저장소의 저장된 값(result)으로 나오는 가

        // 3. assertj 사용(실무)
        assertThat(member).isEqualTo(result);

    }

    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring1").get(); // name 찾기

        assertThat(result).isEqualTo(member1); // spring1(result) 는 member1 의 값과 동일한 가

    }

    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        List<Member> result = repository.findAll(); // 전체 값 찾기
        assertThat(result.size()).isEqualTo(2); // spring1, spring2 값은 총 2개인 가

    }


}
