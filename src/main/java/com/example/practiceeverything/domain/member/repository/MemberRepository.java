package com.example.practiceeverything.domain.member.repository;

import com.example.practiceeverything.domain.member.Entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
}
