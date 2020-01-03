import java.net.*;
import java.io.*;
import java.awt.Color;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
 
public class MTEchoServer {

    public static void main(String[] args) {
         
        if (args.length != 1) {
            System.err.println("Usage: java EchoServer <port number>");
            System.exit(1);
        }
         
        int portNumber = Integer.parseInt(args[0]);
        MTEchoServer es = new MTEchoServer();
        es.run(portNumber);
     }

     public void run(int portNumber) {
        try {
            ServerSocket serverSocket = new ServerSocket(portNumber);
            while(true) {
               Socket client = serverSocket.accept();
               Connection cc = new Connection(client);
            }
        } catch(Exception e) {
           System.out.println("Exception: "+e);
        }
    }
         
  
}

class Connection extends Thread {
    Socket client;
    PrintWriter out;
    BufferedReader in;

    public Connection(Socket s) { // constructor
       client = s;
       

       try {
           out = new PrintWriter(client.getOutputStream(), true);                   
           in = new BufferedReader(
                new InputStreamReader(client.getInputStream()));
       } catch (IOException e) {
           try {
             client.close();
           } catch (IOException ex) {
             System.out.println("Error while getting socket streams.."+ex);
           }
           return;
       }
        this.start(); // Thread starts here...this start() will call run()
    }
 
    public void run() {

        //ColorPalette Object
        ColorsPalette obj = new ColorsPalette();

        // Global Variables
        int counter = 0;
        String choice;

        // color information
        int rgb = 0;

        // Set the height and width of the canvas
        int width = 640;
        int height = 320;

        // create buffered image object img
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        // file object
        File f = null;

        try{
            // Ask the user/client for a color they want
            //First Set
            out.println("Enter a color (red,green,blue,orange,purple,yellow). You may change how light and dark it is later: ");
            

            // Get the users/clients choice
            choice = in.readLine();

        
            
            // Process the users color choice
            if (choice.equals("blue")) {
                Color blue = new Color(0, 0, 255);
                rgb = blue.getRGB();
            }

            else if (choice.equals("yellow")) {
                Color yellow = new Color(255, 255, 0);
                rgb = yellow.getRGB();
            }

            else if (choice.equals("green")) {
                Color green = new Color(0, 128, 0);
                rgb = green.getRGB();
            }

            else if (choice.equals("red")) {
                Color red = new Color(102, 0, 0);
                rgb = red.getRGB();
            }

            else if (choice.equals("orange")) {
                Color orange = new Color(255, 165, 0);
                rgb = orange.getRGB();
            }
            else if (choice.equals("purple")) {
                Color purple = new Color(128, 0, 128);
                rgb = purple.getRGB();
            }

            // Choice was not on the list of colors
            else {
                System.out.println("Please enter a valid color");
            }
            
            // Make the canvas and draw the color onto it
            boolean isdone = true;
            while(isdone){
                System.out.println("Checkpoint");
                for (int y = 0; y < height; y++) {
                    for (int x = 0; x < width; x++) {

                        img.setRGB(x, y, rgb);
                    }
                    
                    if (y == 64 || y == 128 || y == 192 || y == 256) {
                        counter++;

                        switch(choice){
                        case "red":
                            rgb = obj.redColor(counter);
                            break;
                        case "blue":
                            rgb = obj.blueColor(counter);
                            break;
                        case "green":
                            rgb = obj.greenColor(counter);
                            break;
                        case "orange":
                            rgb = obj.orangeColor(counter);
                            break;
                        case "yellow":
                            rgb = obj.yellowColor(counter);
                            break;
                        case "purple":
                            rgb = obj.purpleColor(counter);
                        break;
                        case "random":
                            rgb = obj.getRand();
                            break;
                        }
                        //Second Set
                        out.print(obj.rgbToHex(rgb) + " ");
                        System.out.println("Counter: " + counter);
                        
                        
                    }

                
                
                }
                
            
        

                // Save the canvas into an image file.
        
                //Third Set
                out.println("\nWould you like to recive a image of the colors : ");
                String file_answer;
                file_answer = in.readLine();

                if(file_answer.equals("yes")){
        
                    f = new File("Palette.png");
                    ImageIO.write(img, "png", f);
                    FileInputStream fis = new FileInputStream("Palette.png");
                    byte[] buffer = new byte[fis.available()];
                    fis.read(buffer);

                    ObjectOutputStream oos = new ObjectOutputStream(client.getOutputStream());
                    oos.writeObject(buffer);
                    //oos.close();
                    fis.close();
                }
                else{System.out.println("No file write needed");}

                //Fourth Set
                String isfinished;
                isfinished = in.readLine();
                if(isfinished.equals("done")){
                    isdone = false;
                }
                else if(isfinished.equals("lighter")){
                    
                    counter = 4;
                    
                }
                else if(isfinished.equals("darker")){
                    counter = 8;
                }
                else if (isfinished.equals("random")){
                    choice = "random";

                }
                
            // Process the users color choice Second PASS
            if (choice.equals("blue")) {
                Color blue = new Color(0, 0, 255);
                rgb = blue.getRGB();
            }

            else if (choice.equals("yellow")) {
                Color yellow = new Color(255, 255, 0);
                rgb = yellow.getRGB();
            }

            else if (choice.equals("green")) {
                Color green = new Color(0, 128, 0);
                rgb = green.getRGB();
            }

            else if (choice.equals("red")) {
                Color red = new Color(102, 0, 0);
                rgb = red.getRGB();
            }

            else if (choice.equals("orange")) {
                Color orange = new Color(255, 165, 0);
                rgb = orange.getRGB();
            }
            else if (choice.equals("purple")) {
                Color purple = new Color(128, 0, 128);
                rgb = purple.getRGB();
            }

            // Choice was not on the list of colors
            else {
                System.out.println("Please enter a valid color");
            }
            
            }
        }catch(IOException e){
            System.out.println(e.toString());    
        }

        
        try{
            obj.writetoFile(counter);
            
        }
        catch(IOException e){
            System.err.print("Something went wrong writing to file");    
        }



    }
}

