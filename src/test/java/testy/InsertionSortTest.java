package testy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    void insertionSortImperative() {

        int[] input = {6, 2, 3, 4, 5, 1};

        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] result = InsertionSort.insertionSortImperative(input);

        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(result), "the two arrays are not equal");
    }
}