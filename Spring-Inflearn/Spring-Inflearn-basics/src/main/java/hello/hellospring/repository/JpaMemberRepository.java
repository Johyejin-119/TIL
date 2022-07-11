package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class JpaMemberRepository implements MemberRepository {

    private final EntityManager em; // JPA 사용

    public JpaMemberRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Member save(Member member) {
        em.persist(member); // persist 영속화
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        // PK 로 받았기 때문에 이런 형식으로 조회 가능
        Member member = em.find(Member.class, id); // (조회할 타입, 대상)
        return Optional.ofNullable(member);
    }

    @Override
    public Optional<Member> findByName(String name) {
        List<Member> result = em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();
        return result.stream().findAny();
    }

    @Override
    public List<Member> findAll() {
        // 개체(m) 자체를 select
        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }
}
