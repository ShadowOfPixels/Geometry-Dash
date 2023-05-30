package core;

import javax.swing.*;

public class Core {
    //DECLARATIONS
    public static JFrame window;
    private static Engine engine;
    public static final int WINDOW_LENGTH = 650;
    public static final int WINDOW_BREADTH = 450;

    public static void main(String args[]) {
        window = new JFrame("Geometry Dash");
        engine = new Engine();
        intialize();
    }

    private static void intialize() {
        window.setSize(WINDOW_LENGTH, WINDOW_BREADTH);
        window.add(engine);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        engine.start();
        engine.run();
    }

}
