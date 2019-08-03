package websites;

public class VowelWebsite extends Website {

    @Override
    public void countAndMark(String msg) {
        long count = 0;
        StringBuilder newMsg = new StringBuilder();

        //Converting entire string to lower case to reduce the comparisons
        msg = msg.toLowerCase();

        if (msg.length() > 0) {
            for (int i = 0; i < msg.length(); i++) {
                char ch = msg.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                    newMsg.append(String.valueOf(msg.charAt(i)).toUpperCase());
                } else {
                    newMsg.append(msg.charAt(i));
                }
            }
        }

        setScore(count);
        setConvertedMsg(newMsg.toString());
    }

}
