package websites;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

class CustomWebsiteTest {
    private Website website = new CustomWebsite();

    @ParameterizedTest
    @CsvFileSource(resources = "/customCount.csv")
    void countTest(String msg, int score){
        website.countAndMark(msg);
        assertEquals(score, website.getScore() );

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/customMark.csv")
    void markTest(String msgIn, String msgOut){
        website.countAndMark(msgIn);
        assertEquals(msgOut, website.getConvertedMsg());
    }

}
