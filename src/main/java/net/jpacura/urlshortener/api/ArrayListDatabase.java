package net.jpacura.urlshortener.api;

import net.jpacura.urlshortener.model.ShortenedUrl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class ArrayListDatabase implements DatabaseAdapter {

    private ArrayList<ShortenedUrl> shortenedUrls;

    @Autowired
    private ShortenedUrlGenerator shortenedUrlGenerator;

    public ArrayListDatabase()
    {
        shortenedUrls = new ArrayList<>();
    }

    @Override
    public ShortenedUrl createShortenedUrl(String fullUrl) {
        for(ShortenedUrl s : shortenedUrls)
        {
            if(s.getOriginalUrl().equals(fullUrl))
            {
                // If we have already made a shortened URL for this URL, return the existing one
                return s;
            }
        }

        // If no shortened URL exists yet, create it

        String newShortenedUrl;

        // Make sure we do not assign an existing url again
        do {
            newShortenedUrl = shortenedUrlGenerator.generate();
        } while(getFullUrl(newShortenedUrl) != null);

        ShortenedUrl s = new ShortenedUrl(fullUrl, newShortenedUrl);
        shortenedUrls.add(s);
        return s;
    }

    @Override
    public ShortenedUrl getFullUrl(String shortenedUrl) {
        for(ShortenedUrl s : shortenedUrls)
        {
            if(s.getShortenedUrl().equals(shortenedUrl))
            {
                return s;
            }
        }

        // If the shortened URL does not exist, return null
        return null;
    }
}
