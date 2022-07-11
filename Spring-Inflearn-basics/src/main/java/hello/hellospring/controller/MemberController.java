package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/new")
    public String createForm() {
        return "members/createMemberForm";
    }

    // 회원 웹 기능 등록
    @PostMapping("/members/new")
    public String create(MemberForm form) {
        Member member = new Member();
        member.setName(form.getName()); // form 에서 입력한 name 을 받아와서(get), 멤버 객체에 저장

        memberService.join(member);

        return "redirect:/";
    }


    // 회원 웹 기능 조회
    @GetMapping("/members")
    public String list(Model model) {
        List<Member> members = memberService.findMembers(); // findMembers() 로 데이터 다 꺼내오기
        model.addAttribute("members", members); // model 에 members 리스트 전체를 추가
        return "members/memberList";
    }
}
