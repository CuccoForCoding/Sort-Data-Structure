
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josephcucco
 */
public class ImageController {

    ArrayList<Image> imageProperties;
     // 0 = imageName, 1 = imageProperties
    
    
    public ImageController() { //instanciate array list;
        imageProperties = new ArrayList<>();
    }

    public void displayList() {
        
        for (int i = 0; i < imageProperties.size(); i++) {
            Image tempImage = new Image();
            tempImage = imageProperties.get(i);
            tempImage.listImageName();
            tempImage.listProperties();           
        }
    }


    public void searchProperties(String property) {
        
       for (int i = 0; i < imageProperties.size(); i++) {
            
            imageProperties.get(i).searchImageProperty(property);
            
        }
    }

    public void readFromFile() throws IOException {
        String fileName = "image_info.txt";

        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(fileName), StandardCharsets.UTF_8));) {
            String line;
            //System.out.println(br.readLine());
            while ((line = br.readLine()) != null) {
                String arr[] = line.split(" ", 2);
                String imageName = (arr[0]);
                Image tempImage = new Image(imageName, arr);
                
                imageProperties.add(tempImage);
            }
        }
    }
}
