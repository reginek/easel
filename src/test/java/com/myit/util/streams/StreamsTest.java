package com.myit.util.streams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsTest {

    @Test
    void excludeWhenExcludingListOfStringsAreNotEmpty() {
        List<String> sourceStrings = new ArrayList<>(Arrays.asList("4C6", "4C7", "4N"));
        List<String> excludingStrings = new ArrayList<>(Arrays.asList("4N", "4X"));
        List<String> resultingStrings = new ArrayList<>(Arrays.asList("4C6", "4C7"));
        Assertions.assertEquals(resultingStrings, new Streams().exclude(sourceStrings, excludingStrings));
    }

    @Test
    void excludeWhenExcludingListOfStringsIsEmpty() {
        List<String> sourceStrings = new ArrayList<>(Arrays.asList("4C6", "4C7", "4N"));
        List<String> excludingStrings = new ArrayList<>();
        List<String> resultingStrings = new ArrayList<>(Arrays.asList("4C6", "4C7", "4N"));
        Assertions.assertEquals(resultingStrings, new Streams().exclude(sourceStrings, excludingStrings));
    }
}
