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

public class ColorPalette {

    public static void main(String[] args)throws IOException {

        // Global Variables
        int counter = 0;

        // color information
        int rgb = 0;

        ColorPalette obj = new ColorPalette();

        // Set the height and width of the canvas
        int width = 640;
        int height = 320;

        // create buffered image object img
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        // file object
        File f = null;
        
        // Ask the user for a color they want
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a color");

        // Get the users choice
        String choice = in.nextLine();




        // Process the users color choice
        if (choice.equals("blue")) {
            Color blue = new Color(0, 0, 255);
            rgb = blue.getRGB();
        }

        else if (choice.equals("white")) {
            Color white = new Color(255, 255, 255);
            rgb = white.getRGB();
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

        // Choice was not on the list of colors
        else {
            System.out.println("Please enter a valid color");
        }







        // Make the canvas and draw the color onto it
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                img.setRGB(x, y, rgb);
            }
            if(y == 319){
                counter = 0;
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
                //case "orange":
                   // rgb = obj.orangeColor(counter);
                   // break;
                }
                System.out.println("Counter " + counter);
                
            }
        }
        obj.writetoFile(counter);





        // Save the canvas into an image file.
        try {
            f = new File("D:\\Image\\Output.png");
            ImageIO.write(img, "png", f);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

    }




    // Function for choice of blue
    public int blueColor(int x) {
        int rgb = 0;
        if (x == 1) {
            Color blue = new Color(0, 0, 179);
            rgb = blue.getRGB();
        }
        if (x == 2) {
            Color blue = new Color(0, 0, 140);
            rgb = blue.getRGB();
        }
        if (x == 3) {
            Color blue = new Color(0, 0, 102);
            rgb = blue.getRGB();
        }
        if (x == 4) {
            Color blue = new Color(0, 0, 80);
            rgb = blue.getRGB();
        }
        
        return rgb;
    }

    // Function for choice of Red
    public int redColor(int x) {
        int rgb = 0;
        if (x == 1) {
            Color red = new Color(140, 0, 0);
            rgb = red.getRGB();

        }
        if (x == 2) {
            Color red = new Color(179, 0, 0);
            rgb = red.getRGB();
        }
        if (x == 3) {
            Color red = new Color(217, 0, 0);
            rgb = red.getRGB();
        }
        if (x == 4) {
            Color red = new Color(255, 25, 25);
            rgb = red.getRGB();
        }
        return rgb;
    }

    // Function for choice of green
    public int greenColor(int x) {
        int rgb = 0;
        if (x == 1) {
            Color green = new Color(0, 102, 0);
            rgb = green.getRGB();

        }
        if (x == 2) {
            Color green = new Color(0, 140, 0);
            rgb = green.getRGB();
        }
        if (x == 3) {
            Color green = new Color(0, 179, 0);
            rgb = green.getRGB();
        }
        if (x == 4) {
            Color green = new Color(0, 217, 0);
            rgb = green.getRGB();
        }
        return rgb;
    }


    public void writetoFile(int hex) throws IOException {
        Writer output;
        output = new BufferedWriter(new FileWriter("style.css", true));
        output.append("body {background-color: " + hex + ";}");
        output.close();
    }
/*
    // Function for choice of green
    public int orangeColor(int x) {
            int r, g, b;
            Scanner in = new Scanner(System.in);
            System.out.println("Light orange or Dark orange? ");
            String type = in.nextLine();

            if(type.equals("light")){


            }
           

            

        }
*/    
}


