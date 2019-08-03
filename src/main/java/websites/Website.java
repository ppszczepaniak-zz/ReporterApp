package websites;

public abstract class Website {

    private long score;
    private String convertedMsg;



    protected abstract long countScore(String msg);
    protected abstract String capitalizeChosenLetters(String msg);

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public String getConvertedMsg() {
        return convertedMsg;
    }

    public void setConvertedMsg(String convertedMsg) {
        this.convertedMsg = convertedMsg;
    }


}
