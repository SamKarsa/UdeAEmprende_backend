package com.emprendimientos.udea_emprende.model;

public enum SocialMediaPlatform {
    WHATSAPP("WhatsApp Business"),
    INSTAGRAM("Instagram"),
    FACEBOOK("Facebook"),
    TWITTER("Twitter/X"),
    TIKTOK("TikTok"),
    WEBSITE("Sitio Web");

    private final String displayName;

    SocialMediaPlatform(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
