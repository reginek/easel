package com.myit.lists;

import java.util.*;

/**
 * The class is intended to remove duplicates from an unsorted linked list.
 */
public class DupsRemover<T> {

    /**
     * Removes duplicates from the linked list.
     * @param origin the given linked list
     * @return the resulting linked list without duplicates
     */
    public LinkedList<T> execute_v1(LinkedList<T> origin) {
        Set<T> bufferSet = new LinkedHashSet<>(origin);
        LinkedList<T> result = new LinkedList<>(bufferSet);
        return result;
    }

    public LinkedList<T> execute_v2(LinkedList<T> origin) {
        /**
         * 1. iterate through each element of the linked list
         * 2. and compare each one with another next
         * 3. if it equals any another then remove the last one
         */
        ListIterator<T> iterator = origin.listIterator();
        while (iterator.hasNext()) {
            ;
        }
        return origin;
    }
}
