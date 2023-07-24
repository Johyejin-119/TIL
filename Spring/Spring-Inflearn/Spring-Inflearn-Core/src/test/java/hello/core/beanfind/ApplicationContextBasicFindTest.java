package hello.core.beanfind;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ApplicationContextBasicFindTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("빈 이름으로 조회")
    void findBeanByName() {
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        assertThat(memberService).isInstanceOf(MemberServiceImpl.class); // memberService 가 MemberServiceImpl 의 인스턴스 인가
    }

    @Test
    @DisplayName("이름 없이 타입으로만 조회")
    void findBeanByType() {
        MemberService memberService = ac.getBean(MemberService.class);
        assertThat(memberService).isInstanceOf(MemberServiceImpl.class); // memberService 가 MemberServiceImpl 의 인스턴스 인가
    }

    @Test
    @DisplayName("구체 타입으로 조회")
    void findBeanByName2() {
        // 역할이 아닌 구현에 의존 -> 좋지 못한 방법, 유연성이 떨어짐
        MemberServiceImpl memberService = ac.getBean("memberService", MemberServiceImpl.class); // 반환 타입인 인터페이스(memberService)가 아니고, 구체적인 인스턴스 타입(MemberServiceImpl)로도 가능
       assertThat(memberService).isInstanceOf(MemberServiceImpl.class); // memberService 가 MemberServiceImpl 의 인스턴스 인가
    }

    @Test
    @DisplayName("빈 이름으로 조회X") // 정상적으로 동작 안하는 경우 
    void findBeanByNameX() {
        // ac.getBean("xxxxx", MemberService.class);
        
        // 아래 로직 실행 시 NoSuchBeanDefinitionException 예외 터져야 함
        assertThrows(NoSuchBeanDefinitionException.class,
                () -> ac.getBean("xxxxx", MemberService.class));
    }
}
