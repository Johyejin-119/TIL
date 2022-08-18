package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;


    // 멤버 저장
    public void save(Member member) {
        em.persist(member);
    }

    // 멤버 조회
    public Member findOne(Long id) {
        return em.find(Member.class, id); // type, pk
    }

    // 멤버 리스트 조회
    public List<Member> findAll() {
        return em.createQuery("select m from Member m", Member.class) // JPQL, 반환 타입
                  .getResultList();
    }

    // 이름에 의한 멤버 리스트 조회
    public List<Member> findByName(String name) {
        return em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();
    }
}
