import zero.App;
import zero.ui.Label;

public class Main extends App {
    @Override public void settings() {
        title("Samsung");
        size(420,240);
        padding(20); }

    @Override public void setup() {
        Label galaxyNote10 = new Label("Say Hi To The New Galaxy Note 10");
        show(galaxyNote10);
    }

    public static void main(String[] args) { launch(args); }
}