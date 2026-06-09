import processing.core.PApplet;

/**
 * Template for programs with Processing graphics output.
 * @author Nathan and Jason
 */

// We switched beat maker to pattern maker
public class Sketch extends PApplet {
  int columns = 16;
  int rows = 8;
  int[][] grid = new int[columns][rows];


  public static void main(String[] args) {
    PApplet.main("Sketch");
  }

  public void settings() {
    size(1000, 600);
  }

  public void draw() {
    background(110, 115, 100);
    drawUi();
    drawSquares();
  }

  public void drawUi(){
    // Base UI
    fill(62, 64, 58);
    rect(0, 0, 1000, 50);
    fill(255);
    textSize(30);
    text("Pattern Maker 3000", 400, 35);

    fill(255);
    textSize(24);
    text("Click on the squares to cycle through the colors", 260,560);
  }

  public void drawSquares(){
    // Creates the squares
    stroke(1);
    for (int c = 0; c < columns; c++) {
      for (int r = 0; r < rows; r++) {
       
        // Color choice based on grid number
        if (grid[c][r] == 0) {
          fill(255); // White
        } else if (grid[c][r] == 1) {
          fill(246,0,0);       // Red
        } else if (grid[c][r] == 2) {
          fill(255, 140, 0); // Orange
        } else if (grid[c][r] == 3) {
          fill(255, 238, 0); // Yellow
        } else if (grid[c][r] == 4) {
          fill(77, 233, 76); // Green
        } else if (grid[c][r] == 5) {
          fill(55, 131, 255); // Blue
        } else if (grid[c][r] == 6) {
          fill(72, 21, 170); // Purple
        }
       
        // creates gaps between squares
        square(20 + (c * 60), 65 + (r * 60), 50);
      }
    }
  }

  public void mousePressed() {
    // Convert click position into grid number coordinates
    int c = (mouseX - 20) / 60;
    int r = (mouseY - 65) / 60;

    System.out.println(c + "," + r);


    // Check if the click landed inside grid boundaries
    if (c >= 0 && c < columns && r >= 0 && r < rows) {
     
      // Calculates square posiition based on the column and row number
      int squareX = 20 + (c * 60);
      int squareY = 65 + (r * 60);
     
      if (mouseX >= squareX && mouseX <= squareX + 50 &&
          mouseY >= squareY && mouseY <= squareY + 50) { // Runs when click position is within boundary
           
        // Moves to the next color after every click
        grid[c][r] = grid[c][r] + 1;


        if (grid[c][r] > 6) {
          grid[c][r] = 0; // Limits the cycle by 6 colors and resets when it goes past
        }
      }
    }
  }
}