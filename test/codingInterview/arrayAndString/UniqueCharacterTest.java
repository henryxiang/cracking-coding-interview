package codingInterview.arrayAndString;

import codingInterview.BasicTest;
import org.junit.Test;

public class UniqueCharacterTest extends BasicTest {
    private static final String[] inputFiles = {"UniqueCharacterTest-input1.txt"};
    private static final String[] outputFiles = {"UniqueCharacterTest-output1.txt"};

    @Test
    public void test() throws Exception {
        super.setProblemSolution(new UniqueCharacter());
        super.setInputFiles(inputFiles);
        super.setOutputFiles(outputFiles);
        super.test();
    }
}
