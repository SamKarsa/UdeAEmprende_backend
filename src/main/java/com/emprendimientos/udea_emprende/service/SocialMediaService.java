package com.emprendimientos.udea_emprende.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emprendimientos.udea_emprende.model.SocialMedia;
import com.emprendimientos.udea_emprende.repository.SocialMediaRepository;

@Service
public class SocialMediaService {
    private final SocialMediaRepository socialMediaRepository;

    public SocialMediaService(SocialMediaRepository socialMediaRepository) {
        this.socialMediaRepository = socialMediaRepository;
    }

    public List<SocialMedia> getAllSocialMedias() {
        return socialMediaRepository.findAll();
    }

    public SocialMedia getSocialMediaById(Integer socialMediaId) {
        return socialMediaRepository.findById(socialMediaId).orElse(null);
    }

    public SocialMedia saveSocialMedia(SocialMedia socialMedia) {
        return socialMediaRepository.save(socialMedia);
    }

    public void deleteSocialMediaById(Integer socialMediaId) {
        socialMediaRepository.deleteById(socialMediaId);
    }
}
