import zero.App;
import zero.ui.Label;
import zero.ui.Button;
import zero.ui.Column;
import zero.ui.TextField;
public class Main extends App {
    @Override public void settings() {
        title("Samsung");
        size(420, 240);
        padding(10); }

    @Override public void setup() {
        Label galaxyNote10 = new Label("Say hi to the new galaxy note 10");
        TextField name = new TextField();
        name.setPromptText("Name");
        Label ghs = new Label("");
        Button button = new Button("Say Hi");
        button.onClick(()->
                ghs.setText(name.getText() +": Hi"));
        show(new Column(10,galaxyNote10,name,button,ghs));
    }

    public static void main(String[] args) { launch(args); }
}