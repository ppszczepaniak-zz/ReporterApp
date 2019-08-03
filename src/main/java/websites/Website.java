package websites;

public abstract class Website {

    private long score;
    private String convertedMsg;


    protected abstract void countAndMark(String msg);


    public long getScore() {
        return score;
    }

    protected void setScore(long score) {
        this.score = score;
    }

    public String getConvertedMsg() {
        return convertedMsg;
    }

    protected void setConvertedMsg(String convertedMsg) {
        this.convertedMsg = convertedMsg;
    }


}
