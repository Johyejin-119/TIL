package jpabook.jpashop;

import jpabook.jpashop.domain.Order;
import jpabook.jpashop.domain.OrderItem;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        // 트랜잭션 시작
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        // 우리가 실행할 코드 작성
        try {
            // 단방향 매핑 시
            Order order1 = new Order();
            em.persist(order1);

            OrderItem orderItem = new OrderItem();
            orderItem.setOrder(order1);

            em.persist(orderItem);


            // 양방향 매핑 시
            //Order order = new Order();
            //order.addOrderItem(new OrderItem());


            // => 단방향 매핑으로도 조회가 가능하다! 양방향 매핑은 개발의 편의성(ex. JPQL)을 높인다

            tx.commit();
        } catch (Exception e) {
            em.close();
        }
        emf.close();
    }
}
