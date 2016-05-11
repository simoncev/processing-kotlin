package com.genrep.processing.test;

import processing.core.*;

/**
 * Created by klime on 5/11/2016.
 */
public class ProcessingExample extends PApplet {

    public void setup() {
        background(0);
    }

    public void draw() {
        stroke(255);
        if (mousePressed) {
            line(mouseX,mouseY,pmouseX,pmouseY);
        }
    }

    public static void main(String[] args) {
        ProcessingExample pe = new ProcessingExample();
        pe.setSize(400,400);
        pe.runSketch();
    }
}
