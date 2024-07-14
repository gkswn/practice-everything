package com.example.practiceeverything.domain.file.service;

import com.example.practiceeverything.domain.file.dto.FileDto;
import com.example.practiceeverything.domain.file.entity.FileEntity;
import com.example.practiceeverything.domain.file.repository.FileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
@RequiredArgsConstructor
public class FileService {
    private final FileRepository fileRepository;

    public FileEntity saveFile(FileDto fileDto) throws IOException {
        FileEntity fileEntity = FileEntity.builder()
                .fileId(fileDto.getFile().getOriginalFilename())
                .file(fileDto.getFile().getBytes())
                .build();
        return fileRepository.save(fileEntity);
    }
}
