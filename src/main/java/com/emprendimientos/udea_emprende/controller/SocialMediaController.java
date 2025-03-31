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

import com.emprendimientos.udea_emprende.model.SocialMedia;
import com.emprendimientos.udea_emprende.service.SocialMediaService;

@RestController
@RequestMapping("/api/socialMedias")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class SocialMediaController {
    @Autowired
    private SocialMediaService socialMediaService;

    @GetMapping
    public List<SocialMedia> getAllSocialMedia() {
        return socialMediaService.getAllSocialMedias();
    }

    @PostMapping
    public SocialMedia createNewSocialMedia(@RequestBody SocialMedia newSocialMedia) {
        socialMediaService.saveSocialMedia(newSocialMedia);
        return newSocialMedia;
    }

    @GetMapping("/{id}")
    public SocialMedia getSocialMediaById(@PathVariable Integer id) {
        return socialMediaService.getSocialMediaById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteSocialMediaById(@PathVariable Integer id) {
        socialMediaService.deleteSocialMediaById(id);
    }
}
