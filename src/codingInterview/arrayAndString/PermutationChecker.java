package codingInterview.arrayAndString;

import codingInterview.ProblemSolution;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PermutationChecker implements ProblemSolution {
    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            System.out.println(isPermutation(s1, s2));
        }
    }

    private boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        Map<Character, Integer> charMap = new HashMap<>();
        for (char c : s1.toCharArray()) {
            if (!charMap.containsKey(c))
                charMap.put(c, 0);
            int n = charMap.get(c);
            charMap.put(c, n+1);
        }

        for (char c : s2.toCharArray()) {
            if (!charMap.containsKey(c))
                return false;
            int n = charMap.get(c);
            charMap.put(c, n-1);
        }

        for (char c : charMap.keySet()) {
            if (charMap.get(c) != 0)
                return false;
        }

        return true;
    }
}
