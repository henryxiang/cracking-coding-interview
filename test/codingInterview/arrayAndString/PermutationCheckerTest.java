package codingInterview.arrayAndString;

import codingInterview.BasicTest;
import org.junit.Test;

public class PermutationCheckerTest extends BasicTest {
    private static final String[] inputFiles = {"PermutationCheckerTest-input1.txt"};
    private static final String[] outputFiles = {"PermutationCheckerTest-output1.txt"};

    @Test
    public void test() throws Exception {
        super.setProblemSolution(new PermutationChecker());
        super.setInputFiles(inputFiles);
        super.setOutputFiles(outputFiles);
        super.test();
    }
}