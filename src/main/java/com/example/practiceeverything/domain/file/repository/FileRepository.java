package com.example.practiceeverything.domain.file.repository;

import com.example.practiceeverything.domain.file.entity.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<FileEntity, Long> {
}
