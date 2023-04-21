//package org.unibl.etf.pj2.util;

//import org.unibl.etf.pj2.integer.PJ2Integer;
//import otg.unibl.etf.pj2.string.PJ2String;

public class Util {
    public static String concat (String s1, String s2) {
        return PJ2String.upper(s1)+PJ2String.upper(s2);
    }

    public static Integer reverse (Integer i1, Integer i2) {
        return PJ2Integer.reversed(i1)+PJ2Integer.reversed(i2);
    }
}
