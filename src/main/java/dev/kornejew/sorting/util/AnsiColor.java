package dev.kornejew.sorting.util;

/**
 * ANSI color definition used for console prints.
 *
 * @author Dennis Kornejew
 * @since 14.04.2021 22:06
 */
public enum AnsiColor {
    RESET("\u001B[0m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m");

    private final String color;

    AnsiColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
