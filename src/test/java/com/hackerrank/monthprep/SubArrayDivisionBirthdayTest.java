package com.hackerrank.monthprep;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubArrayDivisionBirthdayTest {
    @Test
    public void testSubArrayDivision1() {
        List<Integer> list = List.of(1, 2, 1, 3, 2);
        int divisions = SubArrayDivisionBirthday.birthday(list, 3, 2);
        assertEquals(2, divisions);
    }

    @Test
    public void testSubArrayDivision2() {
        List<Integer> list = List.of(1, 1, 1, 1, 1, 1);
        int divisions = SubArrayDivisionBirthday.birthday(list, 3, 2);
        assertEquals(0, divisions);
    }

    @Test
    public void testSubArrayDivision3() {
        List<Integer> list = List.of(4);
        int divisions = SubArrayDivisionBirthday.birthday(list, 4, 1);
        assertEquals(1, divisions);
    }

}
