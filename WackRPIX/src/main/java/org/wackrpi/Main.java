package org.wackrpi;

import org.wackrpi.modules.SQLModule;

public class Main {
    public static void main(String[] args) {
        //String prompt = args[0];

        //System.out.println(
        //        OpenAIModule.generateMessage(250, true, 1.0, 1.0, 1.0, prompt)
        //);

        SQLModule database = new SQLModule("localhost:5432/my_database", "wackrpi", "password");
        database.close();
    }
}