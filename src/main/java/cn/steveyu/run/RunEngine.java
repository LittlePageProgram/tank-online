package cn.steveyu.run;

public class RunEngine {
    public static void main(String[] args) {
        new RunEngine().start();
    }

    /**
     * The entrance of the Game
     */
    public void start() {
        TankFrame.getInstance();
    }
}
