package websites;

public class CustomWebsite extends Website {

    public CustomWebsite() {
        super();

    }

    @Override
    public long countScore(String msg) {
        if (!msg.matches("[a-kA-K]") || msg.equals(null))return 0;


        long score = 0;
        for (int i = 0; i < msg.length() ; i++) {
            if(String.valueOf(msg.charAt(i)).matches("a-kA-K")){
                score++;

            }

        }


        return score ;
    }

    @Override
    public String capitalizeChosenLetters(String msg) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < msg.length(); i++) {
            if(String.valueOf(msg.charAt(i)).matches("[a-kA-K]")){
                stringBuilder.append(String.valueOf(msg.charAt(i)).toUpperCase());

            }
            else {
                stringBuilder.append(msg.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "CustomWebsite{}";
    }
}
