public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new Television();
        remote.turnOn();
        remote.turnOff();
    }
}

interface RemoteControl {
    void turnOn();

    void turnOff();
}

class Television implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("텔레비전 전원이 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("텔레비전 전원이 꺼졌습니다.");
    }
}
