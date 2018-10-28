package net.jpacura.urlshortener.model;

public class ShortenedUrl {
    private String shortenedUrl;
    private String originalUrl;

    public ShortenedUrl(String originalUrl, String shortenedUrl)
    {
        this.shortenedUrl = shortenedUrl;
        this.originalUrl = originalUrl;
    }

    public String getShortenedUrl()
    {
        return shortenedUrl;
    }

    public String getOriginalUrl()
    {
        return originalUrl;
    }
}
