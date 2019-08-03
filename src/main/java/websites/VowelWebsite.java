package websites;

public class VowelWebsite extends Website {

    private static final String NAME = "Vowel news";

    public VowelWebsite() {
        super(NAME);
    }

    @Override
    public void countAndMark(String msg) {
        long count = 0;
        StringBuilder newMsg = new StringBuilder();

        try {
            if (msg.length() > 0) {
                //Converting entire string to lower case to reduce the comparisons
                msg = msg.toLowerCase();
                for (int i = 0; i < msg.length(); i++) {
                    if (String.valueOf(msg.charAt(i)).matches("[aeiouy]")) {
                        count++;
                        newMsg.append(String.valueOf(msg.charAt(i)).toUpperCase());
                    } else {
                        newMsg.append(msg.charAt(i));
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        setScore(count);
        setConvertedMsg(newMsg.toString());
    }

    @Override
    public String toString() {
        return "VowelWebsite";
    }
}
