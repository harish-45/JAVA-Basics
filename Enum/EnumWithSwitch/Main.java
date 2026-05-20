package Enum.EnumWithSwitch;

public class Main {
    public enum State {
        PANDING, REJECT, FULLFIL;
    }

    public static void main(String[] args) {
        State state = State.PANDING;

        String res = switch (state) {
            case PANDING -> "request is panding ";
            case FULLFIL -> "request is fullfilled";
            case REJECT -> "request is rejected";
        };

        System.out.println(res);
    }
}
