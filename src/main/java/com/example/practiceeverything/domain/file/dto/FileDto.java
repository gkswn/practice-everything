package com.example.practiceeverything.domain.file.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@AllArgsConstructor
@Builder
public class FileDto {

    private String fileName;
    private MultipartFile file;

}
