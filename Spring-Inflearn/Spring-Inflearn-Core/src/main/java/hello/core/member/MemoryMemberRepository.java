package hello.core.member;

import java.util.HashMap;
import java.util.Map;

// 회원 저장소 구현체
public class MemoryMemberRepository implements MemberRepository{
    private static Map<Long, Member> store = new HashMap<>(); // 간단한 예제로 동시성문제는 고려하지 않음

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
