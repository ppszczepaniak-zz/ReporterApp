package reporter;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import websites.ConsonantWebsite;
import websites.CustomWebsite;
import websites.VowelWebsite;
import websites.Website;

public class ReporterTest {

        Reporter reporter = new Reporter();
        Website website1 = new ConsonantWebsite();
        Website website2 = new CustomWebsite();
        Website website3 = new VowelWebsite();
        String msg = "Cows lose their jobs as milk prices drop";
    @BeforeEach
    void setUp(){

        reporter.addWebsite(website1);
        reporter.addWebsite(website2);
        reporter.addWebsite(website3);
    }

    @Test
    public void addWebsiteTest(){

        Assertions.assertEquals(website1, reporter.getWebsites().get(0));
        Assertions.assertEquals(website2, reporter.getWebsites().get(1));
        Assertions.assertEquals(website3, reporter.getWebsites().get(2));

    }

    @Test
    public void deleteWebsiteTest(){
        reporter.deleteWebsite(website1);
        Assertions.assertNotEquals(website1,reporter.getWebsites().get(0) );

    }

//    @Test
//    public void broadcastMessageTest(){
//        //Assertions.assertE
//        reporter.broadcastMessage(msg);
//        System.out.println("----");
//        System.out.println(website1.getConvertedMsg());
//    }

}
