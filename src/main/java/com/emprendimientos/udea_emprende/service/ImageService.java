package com.emprendimientos.udea_emprende.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.emprendimientos.udea_emprende.model.Image;
import com.emprendimientos.udea_emprende.repository.ImageRepository;

@Service
public class ImageService {
    private final ImageRepository imageRepository;

    public ImageService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    public List<Image> getAllImages() {
        return imageRepository.findAll();
    }

    public Image getImageById(Integer imageId) {
        return imageRepository.findById(imageId).orElse(null);
    }

    public Image saveImage(Image image) {
        return imageRepository.save(image);
    }

    public void deleteImageById(Integer imageId) {
        imageRepository.deleteById(imageId);
    }
}
