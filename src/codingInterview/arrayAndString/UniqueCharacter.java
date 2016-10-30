package codingInterview.arrayAndString;

import codingInterview.ProblemSolution;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueCharacter implements ProblemSolution {

    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            System.out.println(isUnique(s));
        }
        scanner.close();
    }

    private boolean isUnique(String s) {
        boolean[] charMap = new boolean[128];
        Arrays.fill(charMap, false);
        for (char c : s.toCharArray()) {
            if (charMap[c]) return false;
            charMap[c] = true;
        }
        return true;
    }
}
