package com.genrep.processing.test

import processing.core.PApplet

/**
 * Created by klime on 5/11/2016.
 */
class ProcessingExampleKtl : PApplet() {

    companion object Factory {
        fun run(){
            var pe:ProcessingExampleKtl = ProcessingExampleKtl()
            pe.setSize(400,400)
            pe.runSketch()
        }
    }
    override fun setup() {
        background(0)
    }

    override fun draw() {
        stroke(255)
        if (mousePressed) {
            line(mouseX.toFloat(), mouseY.toFloat(), pmouseX.toFloat(), pmouseY.toFloat())
        }
    }
}
fun main(args : Array<String>) {
    ProcessingExampleKtl.run()
}