package com.cherryshoe.utils;

import java.util.Random;

public class Utils {
    /*
    * Generate a 'unique' 8 digit id
    */
    public static String get8DigitUniqueId()
    {
        Random r = new Random();
        long l = 10000000  + r.nextInt(20000000);
        
        return Long.toString(l);
    }

}
