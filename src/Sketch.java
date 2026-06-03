import processing.core.PApplet;

/**
 * Template for programs with Processing graphics output.
 * @author Your Name
 */
public class Sketch extends PApplet {

    int columns = 15;
    int rows = 8;
    boolean[][] grid = new boolean[columns][rows]

    public static void main(String[] args) {
        PApplet.main("Sketch");
    }

    @Override
    public void settings() {
        size(1000, 600); 
    }

    @Override
    public void setup() {
        
        for (int c = 0; c < columns; c++) {
            for (int r = 0; r < rows; r++) {
                grid[c][r] = false;
                }
            }
        }

    
    }
    noStroke();
    fill(110, 115, 100);
    rect(0,300,1000,60);

    // int[] yArray = {100, 160, 220, 280, 340, 460, 520};
    String[] sounds = {"hi-hat.wav", "snare.wav", "kick.wav", "bass.wav", "synthPlusOne.wav", "synth.wav", "synthMinusOne.wav"};

    boolean[][] grid = new boolean[3][3];

    for (int i = 0; i < grid.length; i++) {
        if(grid[i]) {
            fill(0,255,0);
        } else {
            fill(255,255,255);
        }

    public void mousePressed(MouseEvent e) {
           playAudio("kick.wav");
           if (mousePressed) {
           playAudio("kick.wav");
           } 
        }
        
    

    @Override
    public void draw() {
        background(110, 115, 100);
        fill(62, 64, 58);
        rect(0,0,1000,50);
        fill(255);
        circle(150,27,37);
        fill(62, 64, 58);
        triangle(165,26,140,13,140,40);
        fill(255);
        textSize(24);
        text("FL Studio",30, 35);
        text("Hi Hat",10, 100);
        text("Snare",10, 160);
        text("Kick",10, 220);
        text("Bass",10, 280);
        text("Synth +1",10, 400);
        text("Synth",10, 460);
        text("Synth -1",10, 520);

        stroke(0);

    for (int c = 0; c < columns; c++) {
      for (int r = 0; r < rows; r++) {
       
        // Color choice based on grid state
        if (grid[c][r]) {
          fill(255, 0, 0); // Red = active
        } else {
          fill(255);       // White = inactive
        }
       
        // Positions match your original design layout
        square(100 + (c * 60), 65 + (r * 60), 50);
      }
    }
  }

    }

    public void mousePressed(){
        System.out.println("mouse clicked at: " + mouseX + ", " + mouseY);

        if (mouseY < 500) {
            playAudio("snare.wav");
        } else if (mouseY > 501) {
            playAudio("kick.wav");
        }
    }

    /** Additional helper methods below */
    private void playAudio(String fileName) {

        System.out.println("Now playing: " + fileName);

    }


