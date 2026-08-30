public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl tvRemote = new RemoteControl(tv);

        tvRemote.togglePower();
        tvRemote.volumeUp();
        tvRemote.channelUp();

        System.out.println("--- TV controlled by a basic remote ---");
        tv.printStatus();

        Device radio = new Radio();
        AdvancedRemoteControl radioRemote =
                new AdvancedRemoteControl(radio);

        radioRemote.togglePower();
        radioRemote.channelUp();
        radioRemote.volumeUp();
        radioRemote.mute();

        System.out.println();
        System.out.println("--- Radio controlled by an advanced remote ---");
        radio.printStatus();
    }
}
