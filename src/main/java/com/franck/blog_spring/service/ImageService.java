package com.franck.blog_spring.service;


import com.franck.blog_spring.entity.Image;
import com.franck.blog_spring.repository.ImageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Service
public class ImageService {


    @Value("${image.upload.dir}")
    private String uploadDir;

    @Autowired
    private ImageRepo imageRepo;

    public Image saveImage(MultipartFile file) throws IOException {
        Image image = new Image();
        image.setFileName(file.getOriginalFilename());
        image.setFileType(file.getContentType());
        image.setData(file.getBytes());

        return imageRepo.save(image);
    }

    public Optional<Image> getImage(Long id) {
        return imageRepo.findById(id);
    }

    public void deleteImage(Long id) {
        imageRepo.deleteById(id);
    }
}
