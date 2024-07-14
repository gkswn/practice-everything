package com.example.practiceeverything.domain.member.Entity;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String inetId;

    @Column
    private String name;

    @Column
    private String pwd;

    @Column
    private String email;

    @Column
    private String phoneNumber;
}
