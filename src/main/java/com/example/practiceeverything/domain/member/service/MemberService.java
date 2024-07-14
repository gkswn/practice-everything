package com.example.practiceeverything.domain.member.service;

import com.example.practiceeverything.domain.member.Entity.MemberEntity;
import com.example.practiceeverything.domain.member.Exception.MemberException;
import com.example.practiceeverything.domain.member.dto.MemberSignUpDto;
import com.example.practiceeverything.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Member;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public void createMember(MemberSignUpDto memberSignUpDto) {

        if (!memberSignUpDto.getPwd().equals(memberSignUpDto.getPwdChk())) {
            throw new RuntimeException();
        }
        memberRepository.save(memberSignUpDto.toEntity());
    }
}
