package com.example.practiceeverything.web.domain.member;

import com.example.practiceeverything.domain.member.dto.MemberSignUpDto;
import com.example.practiceeverything.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Member;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/signUpPage")
    public String signUpPage() {
        return "SignUpPage.html";
    }

    @GetMapping("/loginPage")
    public String getMember() {
        return "loginPage.html";
    }

    @PostMapping("/signUp")
    public String signUp(MemberSignUpDto memberSignUpDto) {
        memberService.createMember(memberSignUpDto);
        return "loginPage.html";
    }

}
