package reporter;

import websites.Website;

import java.util.ArrayList;
import java.util.List;

public class Reporter implements Broadcast {

    protected List<Website> websites = new ArrayList<>();

    public List<Website> getWebsites() {
        return websites;
    }

    public void addWebsite(Website website) {
        if (website != null) {
            websites.add(website);
        }
    }

    public void deleteWebsite(Website website) {
        if (website != null) {
            websites.remove(website);
        }
    }

    @Override
    public void broadcastMessage(String msg) {
        for (Website website : websites) {
            website.outputMessage(msg);
        }
    }

}
