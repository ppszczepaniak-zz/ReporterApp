package websites;

public class CustomWebsite extends Website{
    static final String NAME = "Custom Feed";

    public CustomWebsite() {
        super(NAME);
    }

    @Override
    public void countAndMark(String msg) {
        long score = 0;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            if (msg.length() > 0) {
                msg = msg.toLowerCase();
                for (int i = 0; i < msg.length(); i++) {

                    if (String.valueOf(msg.charAt(i)).matches("[a-k]")) {
                        score++;
                        stringBuilder.append(String.valueOf(msg.charAt(i)).toUpperCase());
                    } else {
                        stringBuilder.append(msg.charAt(i));
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        setScore(score);
        setConvertedMsg(stringBuilder.toString());

    }

}
