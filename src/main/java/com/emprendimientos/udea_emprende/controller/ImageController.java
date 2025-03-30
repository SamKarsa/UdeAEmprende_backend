package com.emprendimientos.udea_emprende.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emprendimientos.udea_emprende.model.Image;
import com.emprendimientos.udea_emprende.service.ImageService;

@RestController
@RequestMapping("/api/images")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class ImageController {

    @Autowired
    private ImageService imageService;

    @GetMapping
    public List<Image> getAllImages() {
        return imageService.getAllImages();
    }

    @PostMapping
    public Image createNewImage(@RequestBody Image newImage) {
        imageService.saveImage(newImage);
        return newImage;
    }

    @GetMapping("/{id}")
    public Image getImageById(@PathVariable Integer id) {
        return imageService.getImageById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteImageById(@PathVariable Integer id) {
        imageService.deleteImageById(id);
    }

}
