
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josephcucco
 */
public class Main {
    
    public static void main (String[] args) throws IOException {
        int x = 1;
        while (x == 1) {
            
        
       ImageController i = new ImageController();
        Scanner scanner = new Scanner(System.in);
        String name;
        i.readFromFile();
        
        System.out.println("What would you like to search for?\n");
        name = (scanner.next());
        System.out.println(name);
        i.searchProperties(name);
        
        System.out.println("Your search returned no results.\n");
        
        
        
        
        
        
        i.displayList();
                               
    }
}
}