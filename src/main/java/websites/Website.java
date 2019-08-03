package websites;

public abstract class Website {

    protected long score;
    protected String convertedMsg;

    protected abstract long countScore(String msg);
    protected abstract String capitalizeChosenLetters(String msg);

}
