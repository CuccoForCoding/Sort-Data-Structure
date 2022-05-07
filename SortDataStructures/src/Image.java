
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
public class Image {
    
    String imageName;
    
    ArrayList<String> properties = new ArrayList();
    
    public Image() {
        
    }
      public Image(String namedImage, String[] propertyArray) {
        imageName = namedImage;
          
        
        for (int i = 1; i < propertyArray.length; i++) {
            properties.add(propertyArray[i]);
            
        }
    }
    
    public void addProperty(String props) {
        properties.add(props);
    }
    
    public void setImageName(String iName) {
        imageName = iName;
    }
    
    public String getImageName() {
        return imageName;
    }
    
    public void listProperties(){
        for (int i = 0; i < properties.size(); i++) {
            System.out.println(properties.get(i));
        }
    }
    
    public void listImageName() {
        System.out.println(imageName);
    }

    public void searchImageProperty(String args) {
        for (int i = 0; i < properties.size(); i++) {
            if(properties.get(i) == args) {
                System.out.println(imageName);
            }
        }
    }
}
