import processing.core.PApplet;

/**
 * Template for programs with Processing graphics output.
 * @author Your Name
 */
public class Sketch extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }

    @Override
    public void settings() {
        size(1000, 600); 
    }

    @Override
    public void setup() {

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

    for(int y = 25; y <= height - 120; y += 60){

        for(int i = 0; i < width; i += 60){
            square(100 + i,y + 40,50);
        }
    }
    noStroke();
    fill(110, 115, 100);
    rect(0,300,1000,60);

    }

    @Override
    public void draw() {

    }

    /** Additional helper methods below */

}
