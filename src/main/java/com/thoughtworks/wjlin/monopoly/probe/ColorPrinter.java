package com.thoughtworks.wjlin.monopoly.probe;

import static org.fusesource.jansi.Ansi.ansi;
import static org.fusesource.jansi.Ansi.Color.*;


public class ColorPrinter {

    public static void main(String[] args) {
        System.out.println( ansi().eraseScreen().fg(RED).a("Hello").fg(GREEN).a(" World").reset() );
    }
}
