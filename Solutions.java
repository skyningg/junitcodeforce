import java.util.Scanner;

public class Solutions {

    public void BearandBigBrother(Scanner scanner) {
	int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = 0;

        while (a <= b) {
            m++;
            a = a * 3;
            b = b * 2;
        }
        System.out.println(m);
    }

    public void VanyaandFences(Scanner scanner) {
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        int roadWidth = 0;

        for (int i = 0; i < n; i++) {
            int ai = scanner.nextInt();
            if (ai > h) {
                roadWidth += 2;
            } else {
                roadWidth += 1;
            }
        }

        System.out.println(roadWidth);
    }

    public void AntonandDanik(Scanner scanner) {
        int n = scanner.nextInt();
        String s = scanner.next();

        int antonWins = 0;
        int danikWins = 0;

        for (char result : s.toCharArray()) {
            if (result == 'A') {
                antonWins++;
            } else if (result == 'D') {
                danikWins++;
            }
        }

        if (antonWins > danikWins) {
            System.out.println("Anton");
        } else if (danikWins > antonWins) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}

