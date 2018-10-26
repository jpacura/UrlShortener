package net.jpacura.urlshortener.api;

public interface DatabaseAdapter
{
    boolean createShortenedUrl(String fullUrl);
    String getFullUrl(String shortenedUrl);
}
