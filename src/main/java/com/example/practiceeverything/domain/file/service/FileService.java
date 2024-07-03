package com.example.practiceeverything.domain.file.service;

import com.example.practiceeverything.domain.file.entity.FileEntity;
import com.example.practiceeverything.domain.file.repository.FileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class FileService {
    private final FileRepository fileRepository;

    public FileEntity saveFile(MultipartFile file) throws IOException {
        FileEntity fileEntity = FileEntity.builder()
                .fileId(file.getOriginalFilename())
                .file(file.getBytes())
                .build();
        return fileRepository.save(fileEntity);
    }
}
