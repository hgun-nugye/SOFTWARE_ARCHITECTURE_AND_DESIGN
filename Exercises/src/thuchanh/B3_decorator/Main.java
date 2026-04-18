package thuchanh.B3_decorator;

public class Main {
    public static void main(String[] args) {
        Widget w1 = new ButtonWidget("Access");
        w1 = new Center(w1);
        System.out.println(w1.build());

        Widget text = new TextWidget("Hello Flutter");
        Widget button = new ButtonWidget("Click Me");

        // Bọc text vào Container rồi Center
        Widget decoratedText = new Center(new Container(text, "blue"));

        // Bọc button vào Row
        Widget decoratedButton = new Row(button);

        System.out.println(decoratedText.build());
        System.out.println(decoratedButton.build());
    }
}
