package PlugCase;

public class AdaptorDemo {
    public static void main(String[] args) {
        TwoPinPlug twoPinPlug = new TwoPinPlug();

        ThreePinPlug plug = new PlugAdapter(twoPinPlug);
        plug.connectThreePin();
    }
}
