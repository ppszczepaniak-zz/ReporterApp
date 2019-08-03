package websites;

public class CustomWebsite extends Website {

    @Override
    public void countAndMark(String msg) {
        long score = 0;
        StringBuilder stringBuilder = new StringBuilder();
        try{
            if (msg.length() > 0) {
            msg = msg.toLowerCase();
            for (int i = 0; i < msg.length(); i++) {

                if (String.valueOf(msg.charAt(i)).matches("[a-kA-K]")) {
                    score++;
                    stringBuilder.append(String.valueOf(msg.charAt(i)).toUpperCase());
                } else {
                    stringBuilder.append(msg.charAt(i));
                }
            }
        }
        } catch (NullPointerException e){
            System.out.println("Komunikat błędu: " + e.getMessage());
        }
        setScore(score);
        setConvertedMsg(stringBuilder.toString());
    
    }
}
