package net.thesimpleteam.colors;

import java.awt.Color;

public class Colors {

    private Colors() {}

    public static final String RESET = "\033[0m";
    public static final String BOLD = "\033[1m";
    public static final String UNDERLINE = "\033[4m";
    public static final String REVERSED = "\033[7m";

    public static String getForegroundColorFromRGB(Color color) {
        return getForegroundColorFromRGB(color.getRed(), color.getGreen(), color.getBlue());
    }

    public static String getForegroundColorFromRGB(int r, int g, int b) {
        return String.format("\u001b[38;2;%d;%d;%dm", r, g, b);
    }

    public static String getBackgroundColorFromRGB(Color color) {
        return getBackgroundColorFromRGB(color.getRed(), color.getGreen(), color.getBlue());
    }

    public static String getBackgroundColorFromRGB(int r, int g, int b) {
        return String.format("\u001b[48;2;%d;%d;%dm", r, g, b);
    }
}
