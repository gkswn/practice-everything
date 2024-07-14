package com.example.practiceeverything.domain.member.dto;

import com.example.practiceeverything.domain.member.Entity.MemberEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class MemberSignUpDto {
    private String inetId;
    private String pwd;
    private String pwdChk;
    private String email;

    public MemberEntity toEntity() {
        return MemberEntity.builder()
                .inetId(this.inetId)
                .email(this.email)
                .pwd(this.pwd)
                .build();
    }
}
