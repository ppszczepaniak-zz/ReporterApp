import reporter.Reporter;
import websites.ConsonantWebsite;
import websites.CustomWebsite;
import websites.VowelWebsite;

public class Main {
    public static void main(String[] args) {
        //W klasie Main należy stworzyć obiekt reportera,
        // który współpracuje z różnymi typami portali i wywołać dla niego metodę broadcastMessage .

        Reporter reporter = new Reporter();

        VowelWebsite vowelWebsite = new VowelWebsite();
        ConsonantWebsite consonantWebsite = new ConsonantWebsite();
        CustomWebsite customWebsite = new CustomWebsite();

        reporter.addWebsite(vowelWebsite);
        reporter.addWebsite(consonantWebsite);
        reporter.addWebsite(customWebsite);

        reporter.broadcastMessage("Cows lose their jobs as milk prices drop");
//a
    }
}




