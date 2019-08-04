package websites;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class vowelWebsiteTest {
    private VowelWebsite vowelWebsite = new VowelWebsite();

    @ParameterizedTest
    @CsvFileSource(resources = "/vowelsCount.csv")
    void countTest(String message, int score, boolean result) {
        vowelWebsite.countAndMark(message);
        assertEquals(result, (vowelWebsite.getScore() == score));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/vowelsMark.csv")
    void markTest(String initialMsg, String resultedMsg) {
        vowelWebsite.countAndMark(initialMsg);
        assertEquals(resultedMsg, (vowelWebsite.getConvertedMsg()));
    }

}
