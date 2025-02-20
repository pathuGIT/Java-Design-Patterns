package PlugCase;

public class PlugAdapter implements ThreePinPlug{
    private TwoPinPlug twoPinPlug;

    public PlugAdapter(TwoPinPlug twoPinPlug) {
        this.twoPinPlug = twoPinPlug;
    }

    @Override
    public void connectThreePin() {
        twoPinPlug.connectTwoPin();
    }

}
