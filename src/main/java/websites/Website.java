package websites;

public abstract class Website implements Observer {

    private String name;
    private long score;
    private String convertedMsg;

    public Website(String name) {
        this.name = name;
    }

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

    public String getName() {
        return name;
    }

    @Override
    public String outputMessage(String msg) {
        countAndMark(msg);
        String message = "(" + getName() + ", " + getScore() + ") informs: " + getConvertedMsg();
        System.out.println(message);
        return message;
    }
}
