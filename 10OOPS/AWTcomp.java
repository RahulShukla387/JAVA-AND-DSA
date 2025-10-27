import java.awt.*;
public class AWTcomp extends Frame {
    //constructor
    AWTcomp(){
     Button b = new Button("Click me");
     b.setBounds(30, 100, 80, 30);
     add(b);
      TextField t = new TextField(10);
      t.setText("This is text");
      t.setBounds(30, 100, 80, 30);
      add(t);
     setSize(400, 400); // frame size.
     setLayout(null);
     setVisible(true);
    }
   public static void main(String[] args) {
    AWTcomp a = new AWTcomp();
   }
}
