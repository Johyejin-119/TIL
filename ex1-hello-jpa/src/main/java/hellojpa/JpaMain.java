package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        
        // 트랜잭션 시작
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        // 우리가 실행할 코드 작성
        try {
            //Member member = em.find(Member.class, 1L);
            //member.setName("HelloJPA");
            List<Member> resultList = em.createQuery("select m from Member as m", Member.class)
                    .setFirstResult(2)
                    .setMaxResults(5)
                    .getResultList(); // 대상은 객체

            tx.commit();
        } catch (Exception e) {
            em.close();
        }
        emf.close();
    }
}
