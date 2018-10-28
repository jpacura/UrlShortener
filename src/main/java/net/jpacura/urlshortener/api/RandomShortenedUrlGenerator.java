package net.jpacura.urlshortener.api;

import java.util.Random;

public class RandomShortenedUrlGenerator implements ShortenedUrlGenerator {

    @Override
    public String generate() {
        // URL Format: XXX-XXX-XXX, where X is a lowercase letter (26 total)
        // Example: https://urlshortener.local/u/abc-def-ghi

        StringBuilder newUrl = new StringBuilder(11);
        Random rng = new Random();

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                int rand = rng.nextInt(25);
                char c = (char)('a' + rand);
                newUrl.append(c);
            }

            if(i < 2)
            {
                newUrl.append('-');
            }
        }

        return newUrl.toString();
    }
}
