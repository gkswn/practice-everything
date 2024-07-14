package com.example.practiceeverything.domain.member.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String inetId;

    @Column(nullable = false)
    private String name;

    @Column
    private String pwd;

    @Column
    private String email;

    @Column
    private String phoneNumber;
}
