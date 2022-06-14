package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

// 저장소
public interface MemberRepository {
    Member save(Member member); // 저장소에 저장
    Optional<Member> findById(Long id); // id 값
    Optional<Member> findByName(String name); // name 값
    List<Member> findAll(); // 저장된 모든 회원 리스트
}
