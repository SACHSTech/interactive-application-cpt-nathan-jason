import processing.core.PApplet;

/**
 * Template for programs with Processing graphics output.
 * @author Your Name
 */
public class Sketch extends PApplet {

    int columns = 15;
    int rows = 8;
    boolean[][] grid = new boolean[columns][rows];

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

    
    

    // int[] yArray = {100, 160, 220, 280, 340, 460, 520};
    String[] sounds = {"hi-hat.wav", "snare.wav", "kick.wav", "bass.wav", "synthPlusOne.wav", "synth.wav", "synthMinusOne.wav"};

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

        noStroke();
        fill(110,115,100);
        rect(0,305,1000,50);
      }
    }
  }


    public void mousePressed(){
        // Convert click position into grid index coordinates
    int c = (mouseX - 100) / 60;
    int r = (mouseY - 65) / 60;


    System.out.println(c + "," + r);


    // Check if the click landed inside grid boundaries
    if (c >= 0 && c < columns && r >= 0 && r < rows) {
     
      // Check if mouse is inside boundary of square
      int squareX = 100 + (c * 60);
      int squareY = 65 + (r * 60);
     
      if (mouseX >= squareX && mouseX <= squareX + 50 &&
          mouseY >= squareY && mouseY <= squareY + 50) {
           
        // Switches the square to true or false
        grid[c][r] = !grid[c][r];
      }
    }
  }
}




