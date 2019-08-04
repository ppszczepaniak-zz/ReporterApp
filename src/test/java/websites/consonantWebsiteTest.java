package websites;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class consonantWebsiteTest {
    ConsonantWebsite consonantWebsite = new ConsonantWebsite();

    @ParameterizedTest
    @CsvFileSource(resources = "/consonantsCount.csv")
    void countTest(String message, int score, boolean result) {
        consonantWebsite.countAndMark(message);
        assertEquals(result, (consonantWebsite.getScore() == score));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/consonantsMark.csv")
    void markTest(String initialMsg, String resultedMsg) {
        consonantWebsite.countAndMark(initialMsg);
        assertEquals(resultedMsg, (consonantWebsite.getConvertedMsg()));
    }
}
