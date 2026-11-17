import zero.App;
import zero.ui.Label;
import zero.ui.Button;
import zero.ui.Column;
public class Main extends App {
    @Override public void settings() {
        title("Samsung");
        size(420, 240);
        padding(10); }

    @Override public void setup() {
        Label galaxyNote10 = new Label("Say hi to the new galaxy note 10");
        Button button = new button
        show(galaxyNote10);
    }

    public static void main(String[] args) { launch(args); }
}