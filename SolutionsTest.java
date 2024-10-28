import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.Test;

public class SolutionsTest {

    @Test
    public void testBearandBigBrotherWithInput4And7() {
        Solutions solution = new Solutions();
        String input = "4\n7\n";

        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Scanner scanner = new Scanner(System.in);
        solution.BearandBigBrother(scanner);

        System.setIn(System.in);
        System.setOut(System.out);

        String expectedOutput = "2";
        String actualOutput = outputStream.toString().trim();

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testBearandBigBrotherWithInput4And9() {
        Solutions solution = new Solutions();
        String input = "4\n9\n";

        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Scanner scanner = new Scanner(System.in);
        solution.BearandBigBrother(scanner);

        System.setIn(System.in);
        System.setOut(System.out);

        String expectedOutput = "3";
        String actualOutput = outputStream.toString().trim();

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testVanyaandFencesWithInput3And7() {
        Solutions solution = new Solutions();
        String input = "3\n7\n4\n5\n14\n";

        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Scanner scanner = new Scanner(System.in);
        solution.VanyaandFences(scanner);

        System.setIn(System.in);
        System.setOut(System.out);

        String expectedOutput = "4";
        String actualOutput = outputStream.toString().trim();

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testVanyaandFencesWithInput6And1() {
        Solutions solution = new Solutions();
        String input = "6\n1\n1\n1\n1\n1\n1\n1\n";

        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Scanner scanner = new Scanner(System.in);
        solution.VanyaandFences(scanner);

        System.setIn(System.in);
        System.setOut(System.out);

        String expectedOutput = "6";
        String actualOutput = outputStream.toString().trim();

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testAntonandDanikWithInput6AndADAAAA() {
        Solutions solution = new Solutions();
        String input = "6\nADAAAA\n";

        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Scanner scanner = new Scanner(System.in);
        solution.AntonandDanik(scanner);

        System.setIn(System.in);
        System.setOut(System.out);

        String expectedOutput = "Anton";
        String actualOutput = outputStream.toString().trim();

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testAntonandDanikWithInput7AndDDDAADA() {
        Solutions solution = new Solutions();
        String input = "7\nDDDAADA\n";

        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Scanner scanner = new Scanner(System.in);
        solution.AntonandDanik(scanner);

        System.setIn(System.in);
        System.setOut(System.out);

        String expectedOutput = "Danik";
        String actualOutput = outputStream.toString().trim();

        assertEquals(expectedOutput, actualOutput);
    }
}

