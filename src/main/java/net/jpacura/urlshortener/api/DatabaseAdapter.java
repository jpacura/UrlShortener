package net.jpacura.urlshortener.api;

import net.jpacura.urlshortener.model.ShortenedUrl;

public interface DatabaseAdapter
{
    ShortenedUrl createShortenedUrl(String fullUrl);
    ShortenedUrl getFullUrl(String shortenedUrl);
}
