import java.awt.*;

public class awt_components {
    public static void main(String[] args) {
        
        // MenuBar mb = new MenuBar();

        Frame f = new Frame();
        f.setVisible(true);
        f.setSize(700,600);
        f.setTitle("Experiment");
        f.setLayout(null);

//////////////////////// Label ////////////////////////////////

        Label l1 = new Label("Username");
        l1.setBounds(20,40,80,30);

        Label l2 = new Label("Password");
        l2.setBounds(20,70,80,30);

        Label l3 = new Label("Mobile");
        l3.setBounds(20,100,80,30);

///////////////////////////////////////////////////////////////

////////////////// TextField //////////////////////////////////

        TextField tf1 = new TextField(10);
        tf1.setBounds(120,40,180,30);
        tf1.setText("Enter your username here");

        TextField tf2 = new TextField(10);
        tf2.setBounds(120,70,180,30);
        tf2.setText("Enter your Password here");

        TextField tf3 = new TextField(10);
        tf3.setBounds(120,100,180,30);
        tf3.setText("Enter your username here");

////////////////////////////////////////////////////////////////

/////////////////////// Checkbox ///////////////////////////////

        Checkbox c1 = new Checkbox("MCA",null,true);
        c1.setBounds(20,150,50,30);

        Checkbox c2 = new Checkbox("BCA",null,false);
        c2.setBounds(20,190,50,30);

////////////////////////////////////////////////////////////////

///////////////////////// List /////////////////////////////////

        List li = new List(2,true);
        li.add("MCA");
        li.add("BTECH");
        li.add("BSC");
        li.setBounds(20,240,80,60);

////////////////////////////////////////////////////////////////

//////////////////// Choices ////////////////////////////////////

        Choice c = new Choice();
        c.add("MCA");
        c.add("BCA");
        c.add("BSC");
        c.setBounds(20,320,60,30);

////////////////////////////////////////////////////////////////

////////////////////////// TextArea ////////////////////////////

        TextArea a = new TextArea("Enter Description",40,40);
        a.setBounds(20,390, 180, 100);

////////////////////////////////////////////////////////////////

///////////////////////// Button //////////////////////////////

        Button b = new Button("Click Me");
        b.setBounds(250, 400, 80,30);

/////////////////////////////////////////////////////////////////

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(c1);
        f.add(c2);
        f.add(li);
        f.add(c);
        f.add(a);
        f.add(b);
        // f.setMenuBar(mb);
    }
}
