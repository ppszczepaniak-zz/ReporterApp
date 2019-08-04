import reporter.Reporter;
import websites.ConsonantWebsite;
import websites.CustomWebsite;
import websites.VowelWebsite;

public class Main {
    public static void main(String[] args) {
        Reporter reporter = new Reporter();

        VowelWebsite vowelWebsite = new VowelWebsite();
        ConsonantWebsite consonantWebsite = new ConsonantWebsite();
        CustomWebsite customWebsite = new CustomWebsite();

        reporter.addWebsite(vowelWebsite);
        reporter.addWebsite(consonantWebsite);
        reporter.addWebsite(customWebsite);

        reporter.broadcastMessage("Cows lose their jobs as milk prices drop");
    }
}




