package com.thoughtworks.wjlin.monopoly.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandGenerator {

    public static String generator() {
        String command = "";

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        try {
            command = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return command;
        }

    }
}
