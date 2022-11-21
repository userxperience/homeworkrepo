package com.hz;

import java.awt.geom.NoninvertibleTransformException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();

        // ask questions
        String q1 = "Do you like eating vegetables?";

        String good = "You healthy person!";
        String bad = "Maybe you should try to eat some carrots";

        // ask question to user
        writer.write(q1);

        // read response
        String ans1 = reader.readLine();

        String[] goodWords = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};


        boolean healthy = false;
        for (String goodword : goodWords) {
            if (ans1.contains(goodword)) {
                writer.write(good);
                healthy = true;
            }
        }
        if (!healthy) {
            writer.write(bad);
        }
        // allow user to read our response
        reader.readLine();
    }
}
