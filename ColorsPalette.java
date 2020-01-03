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
import java.util.Random;

public class ColorsPalette{

    //Global Variable
    int r, g, b;
    Random rand = new Random(System.currentTimeMillis());



    public ColorsPalette(){

    }

    // Function for choice of blue
    public int blueColor(int x) {
        int rgb = 0;
        if (x == 1) {
            Color blue = new Color(0, 0, 245);
            rgb = blue.getRGB();
        }
        if (x == 2) {
            Color blue = new Color(0, 0, 235);
            rgb = blue.getRGB();
        }
        if (x == 3) {
            Color blue = new Color(0, 0, 225);
            rgb = blue.getRGB();
        }
        if (x == 4) {
            Color blue = new Color(0, 0, 220);
            rgb = blue.getRGB();
        }
        if (x == 5) {
            Color blue = new Color(25, 25, 255);
            rgb = blue.getRGB();
        }
        if (x == 6) {
            Color blue = new Color(51, 51, 255);
            rgb = blue.getRGB();
        }
        if (x == 7) {
            Color blue = new Color(77, 77, 255);
            rgb = blue.getRGB();
        }
        if (x == 8) {
            Color blue = new Color(102, 102, 255);
            rgb = blue.getRGB();
        }
        if (x == 9) {
            Color blue = new Color(0, 0, 179);
            rgb = blue.getRGB();
        }
        if (x == 10) {
            Color blue = new Color(0, 0, 140);
            rgb = blue.getRGB();
        }
        if (x == 11) {
            Color blue = new Color(0, 0, 120);
            rgb = blue.getRGB();
        }
        if (x == 12) {
            Color blue = new Color(0, 0, 102);
            rgb = blue.getRGB();
        }
        
        return rgb;
    }

    // Function for choice of Red
    public int redColor(int x) {
        int rgb = 0;
        if (x == 1) {
            Color red = new Color(163, 0, 10);
            rgb = red.getRGB();
        }
        if (x == 2) {
            Color red = new Color(144, 0, 8);
            rgb = red.getRGB();
        }
        if (x == 3) {
            Color red = new Color(118, 0, 3);
            rgb = red.getRGB();
        }
        if (x == 4) {
            Color red = new Color(157, 0, 18);
            rgb = red.getRGB();
        }
        if (x == 5) {
            Color red = new Color(140, 0, 0);
            rgb = red.getRGB();
        }
        if (x == 6) {
            Color red = new Color(179, 0, 0);
            rgb = red.getRGB();
        }
        if (x == 7) {
            Color red = new Color(255, 25, 25);
            rgb = red.getRGB();
        }
        if (x == 8) {
            Color red = new Color(255, 51, 51);
            rgb = red.getRGB();
        }
        if (x == 9) {
            Color red = new Color(102, 0, 0);
            rgb = red.getRGB();
        }
        if (x == 10) {
            Color red = new Color(90, 0, 0);
            rgb = red.getRGB();
        }
        if (x == 11) {
            Color red = new Color(75, 0, 0);
            rgb = red.getRGB();
        }
        if (x == 12) {
            Color red = new Color(65, 0, 0);
            rgb = red.getRGB();
        }
        return rgb;
    }

    // Function for choice of green
    public int greenColor(int x) {
        int rgb = 0;
        if (x == 1) {
            Color green = new Color(0, 138, 0);
            rgb = green.getRGB();
        }
        if (x == 2) {
            Color green = new Color(0, 148, 0);
            rgb = green.getRGB();
        }
        if (x == 3) {
            Color green = new Color(0, 158, 0);
            rgb = green.getRGB();
        }
        if (x == 4) {
            Color green = new Color(0, 168, 0);
            rgb = green.getRGB();
        }
        if (x == 5) {
            Color green = new Color(0, 217, 0);
            rgb = green.getRGB();
        }
        if (x == 6) {
            Color green = new Color(25, 255, 25);
            rgb = green.getRGB();
        }
        if (x == 7) {
            Color green = new Color(51, 255, 51);
            rgb = green.getRGB();
        }
        if (x == 8) {
            Color green = new Color(77, 255, 77);
            rgb = green.getRGB();
        }
        if (x == 9) {
            Color green = new Color(0, 102, 0);
            rgb = green.getRGB();
        }
        if (x == 10) {
            Color green = new Color(0, 163, 0);
            rgb = green.getRGB();
        }
        if (x == 11) {
            Color green = new Color(0, 198, 20);
            rgb = green.getRGB();
        }
        if (x == 12) {
            Color green = new Color(0, 72, 13);
            rgb = green.getRGB();
        }
        return rgb;
    }

    public int orangeColor(int x){
        r = 255;
        g = 165;
        b = 0;
        int rgb = 0;

         if(x ==1){   
            Color orange = new Color(255, 178, 25);
            rgb = orange.getRGB();
         }
    
         if(x == 2){   
            Color orange = new Color(255, 187, 51);
            rgb = orange.getRGB();
         }
         if(x == 3){   
            Color orange = new Color(255, 196, 77);
            rgb = orange.getRGB();
         }
         if(x == 4){   
            Color orange = new Color(255, 204, 102);
            rgb = orange.getRGB();
         }
         if(x ==5){   
            Color orange = new Color(255, 178, 25);
            rgb = orange.getRGB();
         }
    
         if(x == 6){   
            Color orange = new Color(255, 187, 51);
            rgb = orange.getRGB();
         }
         if(x == 7){   
            Color orange = new Color(255, 196, 77);
            rgb = orange.getRGB();
         }
         if(x == 8){   
            Color orange = new Color(255, 204, 102);
            rgb = orange.getRGB();
         }if(x ==9){   
            Color orange = new Color(255, 165, 0);
            rgb = orange.getRGB();
         }
    
         if(x == 10){   
            Color orange = new Color(255, 136, 0);
            rgb = orange.getRGB();
         }
         if(x == 11){   
            Color orange = new Color(255, 110, 0);
            rgb = orange.getRGB();
         }
         if(x == 12){   
            Color orange = new Color(255, 85, 0);
            rgb = orange.getRGB();
         }
        return rgb;
    }

    public int yellowColor(int x){
        r = 255;
        g = 165;
        b = 0;
        int rgb = 0;

         if(x ==1){   
            Color yellow = new Color(255, 245, 0);
            rgb = yellow.getRGB();
         }
    
         if(x == 2){   
            Color yellow = new Color(255,235 , 0);
            rgb = yellow.getRGB();
         }
         if(x == 3){   
            Color yellow = new Color(255, 225, 0);
            rgb = yellow.getRGB();
         }
         if(x == 4){   
            Color yellow = new Color(255, 215, 0);
            rgb = yellow.getRGB();
         }
         if(x ==5){   
            Color yellow = new Color(255, 255, 51);
            rgb = yellow.getRGB();
         }
    
         if(x == 6){   
            Color yellow = new Color(255, 255, 102);
            rgb = yellow.getRGB();
         }
         if(x == 7){   
            Color yellow = new Color(255, 255, 153);
            rgb = yellow.getRGB();
         }
         if(x == 8){   
            Color yellow = new Color(255, 255, 200);
            rgb = yellow.getRGB();
         }if(x ==9){   
            Color yellow = new Color(204, 204, 0);
            rgb = yellow.getRGB();
         }
         if(x == 10){   
            Color yellow = new Color(153, 153, 0);
            rgb = yellow.getRGB();
         }
         if(x == 11){   
            Color yellow = new Color(102, 102, 0);
            rgb = yellow.getRGB();
         }
         if(x == 12){   
            Color yellow = new Color(71, 71, 0);
            rgb = yellow.getRGB();
         }
        return rgb;
    }

    public int purpleColor(int x){
        r = 255;
        g = 165;
        b = 0;
        int rgb = 0;

         if(x ==1){   
            Color purple = new Color(138, 0, 138);
            rgb = purple.getRGB();
         }
    
         if(x == 2){   
            Color purple = new Color(148,0 , 148);
            rgb = purple.getRGB();
         }
         if(x == 3){   
            Color purple = new Color(158, 0, 158);
            rgb = purple.getRGB();
         }
         if(x == 4){   
            Color purple = new Color(168, 0, 168);
            rgb = purple.getRGB();
         }
         if(x ==5){   
            Color purple = new Color(139, 0, 139);
            rgb = purple.getRGB();
         }
    
         if(x == 6){   
            Color purple = new Color(153, 50, 204);
            rgb = purple.getRGB();
         }
         if(x == 7){   
            Color purple = new Color(147, 112, 219);
            rgb = purple.getRGB();
         }
         if(x == 8){   
            Color purple = new Color(218, 112, 214);
            rgb = purple.getRGB();
         }if(x ==9){   
            Color purple = new Color(110, 0, 110);
            rgb = purple.getRGB();
         }
         if(x == 10){   
            Color purple = new Color(90, 0, 90);
            rgb = purple.getRGB();
         }
         if(x == 11){   
            Color purple = new Color(70, 0, 130);
            rgb = purple.getRGB();
         }
         if(x == 12){   
            Color purple= new Color(70, 0, 140);
            rgb = purple.getRGB();
         }
        return rgb;
    }

    public String rgbToHex(int rgb){
        String hex = Integer.toHexString(rgb & 0xffffff);
        if(hex.length() < 6){
            if(hex.length() == 5){
                hex = "0" + hex;
            }
            if(hex.length() == 4){
                hex = "00" + hex;
            }
            if(hex.length() == 3){
                hex = "000" + hex;
            }
            if(hex.length() == 2){
                hex = "0000" + hex;
            }

        }
        hex = "#" + hex;
        return hex;
    }


    public void writetoFile(int hex) throws IOException {
        Writer output;
        output = new BufferedWriter(new FileWriter("style.css", true));
        output.append("body {background-color: " + hex + ";}");
        output.close();
    }

    public int getRand(){
        int max = 255;
        int min = 0;
        int rgb;
        int r = rand.nextInt((max-min)+1)+min;
        int g = rand.nextInt((max-min)+1)+min;
        int b = rand.nextInt((max-min)+1)+min;
        
        Color custom = new Color(r, g, b);
        rgb = custom.getRGB();
        
        return rgb;
    }
}