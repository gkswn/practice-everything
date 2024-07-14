package com.example.practiceeverything.domain.file.service;

import com.example.practiceeverything.domain.file.dto.FileDto;
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
                .fileName(file.getOriginalFilename())
                .file(file.getBytes())
                .build();
        return fileRepository.save(fileEntity);
    }

    public FileEntity getFileById(Long id) {
        return fileRepository.findById(id).orElseThrow(() -> new RuntimeException("File not found with id " + id));
    }
}
