package com.example.practiceeverything.domain.file.dto;

import com.example.practiceeverything.domain.file.entity.FileEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Getter
@AllArgsConstructor
@Builder
public class FileDto {

    private String fileName;
    private MultipartFile file;

    public FileEntity toEntity(FileDto fileDto) {
        try {
            return FileEntity.builder()
                    .file(fileDto.getFile().getBytes())
                    .fileName(fileDto.getFile().getOriginalFilename())
                    .build();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
