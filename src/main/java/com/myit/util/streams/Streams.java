package com.myit.util.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    List<String> exclude(List<String> sourceStrings, List<String> excludingStrings) {
        List<String> resultingStrings = sourceStrings.stream()
                .filter(str -> excludingStrings.stream().noneMatch(exclStr -> str.startsWith(exclStr.toUpperCase())))
                .collect(Collectors.toList());
        return resultingStrings;
    }
}
