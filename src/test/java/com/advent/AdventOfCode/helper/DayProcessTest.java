package com.advent.AdventOfCode.helper;

import com.advent.AdventOfCode.model.Day;
import com.advent.AdventOfCode.util.Scraper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DayProcessTest {

    @Autowired
    @Mock
    Scraper scraper;

    @Autowired
    @InjectMocks
    DayProcess dayProcess;

    @Test
    void Day1Part1Test() throws IOException, InterruptedException {

     when(scraper.fetchPuzzleDescription(1)).thenReturn("This is the puzzle description");
     when(scraper.fetchPuzzleInput(1)).thenReturn("3   4\n" +
             "4   3\n" +
             "2   5\n" +
             "1   3\n" +
             "3   9\n" +
             "3   3");

     Day day = dayProcess.solveDay1Part1(1,1);
     assertEquals("11", day.getAnswer());
    }

    @Test
    void Day1Part2Test() throws IOException, InterruptedException {

        when(scraper.fetchPuzzleDescription(1)).thenReturn("This is the puzzle description");
        when(scraper.fetchPuzzleInput(1)).thenReturn("3   4\n" +
                "4   3\n" +
                "2   5\n" +
                "1   3\n" +
                "3   9\n" +
                "3   3");

        Day day = dayProcess.solveDay1Part2(1,2);
        assertEquals( "13", day.getAnswer());
    }

    @Test
    void Day2Part1Test() throws IOException, InterruptedException {

        when(scraper.fetchPuzzleDescription(2)).thenReturn("This is the puzzle description");
        when(scraper.fetchPuzzleInput(2)).thenReturn("7 6 4 2 1\n" +
                "1 2 7 8 9\n" +
                "9 7 6 2 1\n" +
                "1 3 2 4 5\n" +
                "8 6 4 4 1\n" +
                "1 3 6 7 9");

        Day day = dayProcess.solveDay2Part1(2,1);
        assertEquals( "2", day.getAnswer());
    }

    @Test
    void Day2Part2Test() throws IOException, InterruptedException {

        when(scraper.fetchPuzzleDescription(2)).thenReturn("This is the puzzle description");
        when(scraper.fetchPuzzleInput(2)).thenReturn("7 6 4 2 1\n" +
                "1 2 7 8 9\n" +
                "9 7 6 2 1\n" +
                "1 3 2 4 5\n" +
                "8 6 4 4 1\n" +
                "1 3 6 7 9");

        Day day = dayProcess.solveDay2Part2(2,2);
        assertEquals( "4", day.getAnswer());
    }

    @Test
    void Day3Part1Test() throws IOException, InterruptedException {

        when(scraper.fetchPuzzleDescription(3)).thenReturn("This is the puzzle description");
        when(scraper.fetchPuzzleInput(3)).thenReturn("xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))");

        Day day = dayProcess.solveDay3Part1(3,1);
        assertEquals( "161", day.getAnswer());
    }

    @Test
    void Day3Part2Test() throws IOException, InterruptedException {

        when(scraper.fetchPuzzleDescription(3)).thenReturn("This is the puzzle description");
        when(scraper.fetchPuzzleInput(3)).thenReturn("xmul(2,4)&mul[3,7]!^don't()_mul(5,5)+mul(32,64](mul(11,8)undo()?mul(8,5))");

        Day day = dayProcess.solveDay3Part2(3,2);
        assertEquals( "48", day.getAnswer());
    }

    @Test
    void Day4Part1Test() throws IOException, InterruptedException {

        when(scraper.fetchPuzzleDescription(4)).thenReturn("This is the puzzle description");
        when(scraper.fetchPuzzleInput(4)).thenReturn("MMMSXXMASM\n" +
                "MSAMXMSMSA\n" +
                "AMXSXMAAMM\n" +
                "MSAMASMSMX\n" +
                "XMASAMXAMM\n" +
                "XXAMMXXAMA\n" +
                "SMSMSASXSS\n" +
                "SAXAMASAAA\n" +
                "MAMMMXMMMM\n" +
                "MXMXAXMASX");

        Day day = dayProcess.solveDay4Part1(4,1);
        assertEquals( "18", day.getAnswer());
    }

    @Test
    void Day4Part2Test() throws IOException, InterruptedException {

        when(scraper.fetchPuzzleDescription(4)).thenReturn("This is the puzzle description");
        when(scraper.fetchPuzzleInput(4)).thenReturn(".M.S......\n" +
                "..A..MSMS.\n" +
                ".M.S.MAA..\n" +
                "..A.ASMSM.\n" +
                ".M.S.M....\n" +
                "..........\n" +
                "S.S.S.S.S.\n" +
                ".A.A.A.A..\n" +
                "M.M.M.M.M.\n" +
                "..........");

        Day day = dayProcess.solveDay4Part2(4,2);
        assertEquals( "9", day.getAnswer());
    }

    @Test
    void Day5Part1Test() throws IOException, InterruptedException {

        when(scraper.fetchPuzzleDescription(5)).thenReturn("This is the puzzle description");
        when(scraper.fetchPuzzleInput(5)).thenReturn("47|53\n" +
                "97|13\n" +
                "97|61\n" +
                "97|47\n" +
                "75|29\n" +
                "61|13\n" +
                "75|53\n" +
                "29|13\n" +
                "97|29\n" +
                "53|29\n" +
                "61|53\n" +
                "97|53\n" +
                "61|29\n" +
                "47|13\n" +
                "75|47\n" +
                "97|75\n" +
                "47|61\n" +
                "75|61\n" +
                "47|29\n" +
                "75|13\n" +
                "53|13\n" +
                "\n" +
                "75,47,61,53,29\n" +
                "97,61,53,29,13\n" +
                "75,29,13\n" +
                "75,97,47,61,53\n" +
                "61,13,29\n" +
                "97,13,75,29,47");

        Day day = dayProcess.solveDay5Part1(5,1);
        assertEquals( "143", day.getAnswer());
    }

    @Test
    void Day5Part2Test() throws IOException, InterruptedException {

        when(scraper.fetchPuzzleDescription(5)).thenReturn("This is the puzzle description");
        when(scraper.fetchPuzzleInput(5)).thenReturn("47|53\n" +
                "97|13\n" +
                "97|61\n" +
                "97|47\n" +
                "75|29\n" +
                "61|13\n" +
                "75|53\n" +
                "29|13\n" +
                "97|29\n" +
                "53|29\n" +
                "61|53\n" +
                "97|53\n" +
                "61|29\n" +
                "47|13\n" +
                "75|47\n" +
                "97|75\n" +
                "47|61\n" +
                "75|61\n" +
                "47|29\n" +
                "75|13\n" +
                "53|13\n" +
                "\n" +
                "75,47,61,53,29\n" +
                "97,61,53,29,13\n" +
                "75,29,13\n" +
                "75,97,47,61,53\n" +
                "61,13,29\n" +
                "97,13,75,29,47");

        Day day = dayProcess.solveDay5Part2(5,2);
        assertEquals( "123", day.getAnswer());
    }

    @Test
    void Day69Part1Test() throws IOException, InterruptedException {

        when(scraper.fetchPuzzleDescription(6)).thenReturn("This is the puzzle description");
        when(scraper.fetchPuzzleInput(6)).thenReturn("");

        Day day = dayProcess.solveDay5Part2(6,1);
        assertEquals( "123", day.getAnswer());
    }

    @Test
    void Day6Part1Test() throws IOException, InterruptedException {

        when(scraper.fetchPuzzleDescription(6)).thenReturn("This is the puzzle description");
        when(scraper.fetchPuzzleInput(6)).thenReturn("");

        Day day = dayProcess.solveDay5Part2(6,2);
        assertEquals( "123", day.getAnswer());
    }
}
