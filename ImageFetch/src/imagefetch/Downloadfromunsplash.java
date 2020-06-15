package imagefetch;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Downloadfromunsplash {

    public static void GetImage(String path, String filename, String resolution) throws MalformedURLException, IOException{
        Random rand = new Random();
        String randomElement = "";
        List<String> Tags = Arrays.asList("dog", "cat", "raccoon", "fox", "bird", "coala", "panda");
        
        int numberOfElements = 1;
        
        for (int i = 0; i < numberOfElements; i++){
            int randomIndex = rand.nextInt(Tags.size());
            randomElement = Tags.get(randomIndex);
        }
        
        URL text = new URL("https://source.unsplash.com/" + resolution + "/?" + randomElement);
        
        try(InputStream in = text.openStream()){
            Files.copy(in, Paths.get(path +filename));
        }
    }

}
