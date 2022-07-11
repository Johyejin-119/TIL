package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository {

    // 실무의 동시성 문제는 해당 실습에서 다루지 않음 -> 기본 Map, log sequence 
    private static Map<Long, Member> store = new HashMap<>(); // 공유되는 변수
    private static long sequence = 0L; // key 값 생성

    @Override
    public Member save(Member member) { // 저장
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) { // id 찾기
        // null 이 반환될 가능성이 있으므로 Optional.ofNullable()로 감싸서 반환
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) { // name 찾기
        // filter 로 저장소(store)에 있는
        // name(member.getName())과 찾으려는 name 이 같은 지 확인
        // 같은 name 을 찾으면(findAny()) 반환
        // -> 루프를 돌면서 값을 끝까지 찾고, 값이 없다면 Optional 에 null 이 포함되어 반환
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();
    }

    @Override
    public List<Member> findAll() {
        // 반환은 List 으로 많이 사용
        // store(Map<Long, Member>)의 values(Member) 값들을 반환
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}
