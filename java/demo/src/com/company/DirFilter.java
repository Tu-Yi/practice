package com.company;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;
/**
 * @author huhx
 */
public class DirFilter implements FilenameFilter {
    final static String REGEX = ".*\\.java";

    @Override
    public boolean accept(File dir, String name) {
        return Pattern.matches(REGEX, name);
    }
}