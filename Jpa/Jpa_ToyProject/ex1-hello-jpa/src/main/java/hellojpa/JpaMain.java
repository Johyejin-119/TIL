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
            // 팀 저장
            Team team = new Team();
            team.setName("TeamA");
            em.persist(team);

            // 회원 저장
            // 연관관계의 주인은? FK가 있는, 다 : 1에서 다쪽인 Member
            Member member = new Member();
            member.setUsername("member1");
            //member. (team); // 주인쪽에서 값을 설정해야 null 값이 안생김 // Member 에 연관관계 편의 메서드 생성 시**
            em.persist(member);

            // Team 에 연관관계 편의 메서드 생성 시**
            team.addMember(member);

            // 반대쪽(다 : 1에서 1쪽인 Team)에서도 값을 넣어줘야 함
            // Member 엔티티에 연관관계 편의 메서드 생성 시 반대쪽에서는 값 넣어주지 않아도 됨
            // team.getMembers().add(member);

            /*
            1차 캐시 없이 DB에서 다시 조회하므로, 연관관계를 기억한다
            -> 반대쪽에서 값을 넣지 않아도 아래 members 조회가 가능하다

            flush, clear 없이 위에서 1차 캐시 저장한 후라면?
            -> 아래 members 조회 시 null 이나 버그가 발생한다.

            // em.flush();
            // em.clear();
             */
            
            Team findTeam = em.find(Team.class, team.getId()); // 1차 캐시를 읽어온다
            List<Member> members = findTeam.getMembers();

            // 양방향 매핑 시, 다 : 1 양쪽 전부 값을 세팅해줘야 한다
            for (Member m : members) {
                System.out.println("m.getUsername() = " + m.getUsername());
            }

            // => Member 엔티티에 연관관계 편의 메서드를 생성하면? 위에서 두 번씩 값을 세팅할 번거로움/실수를 상쇄시킬 수 있다
            // 연관관계 편의 메서드는 하나만 사용해야 한다

            tx.commit();
        } catch (Exception e) {
            em.close();
        }
        emf.close();
    }
}
