import java.awt.*;
import java.awt.event.*;

public class AWT_Event_Handeling {
    public static void main(String[] args) {

/////////////////////////////// Frame & Label ////////////////////////////////////////

        Frame f = new Frame();
        f.setLayout(null);
        f.setSize(700,600);
        f.setTitle("Event Handeling");
        f.setVisible(true);

        Label l1 = new Label("Name");
        l1.setBounds(20,40,80,30);

        TextField t1 = new TextField("Enter Name Here");
        t1.setBounds(100,40,150,30);

/////////////////////////// Event Handeling //////////////////////////////////
        
        Button b = new Button("Submit");
        b.setBounds(80,100,50,30);
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("Hello");
            }
        });

        f.add(l1);
        f.add(t1);
        f.add(b);
    }
}
