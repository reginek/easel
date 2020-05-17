package com.myit.util.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * This class is devoted to incorporate functionality working with streams.
 */
public class Streams {

    /**
     * Excludes the pointed strings from the input list of strings.
     *
     * @param sourceStrings the input list of strings
     * @param excludingStrings the list of strings to be excluded
     * @return the list of strings which doesn't contain excluding strings
     */
    List<String> exclude(List<String> sourceStrings, List<String> excludingStrings) {
        List<String> resultingStrings = sourceStrings.stream()
                .filter(str -> excludingStrings.stream().noneMatch(exclStr -> str.startsWith(exclStr.toUpperCase())))
                .collect(Collectors.toList());
        return resultingStrings;
    }
}
