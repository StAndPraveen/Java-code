import java.awt.*;
import java.applet.*;
import java.awt.event.*;



/* <applet code=ApletCalci.java width=250 height=250 > </applet> */

public class ApletCalci extends Applet implements ActionListener {
    Label l1,l2;
    TextField t1, t2, t3;
    Button addition, subtraction, multiplication, division;
     
    public void init(){
        l1 = new Label("enter first no"); add(l1);
        l1 = new Label("enter second no"); add(l2);
        t1 = new TextField(10); add(t1);
        t2 = new TextField(10); add(t2);
        t3 = new TextField(10); add(t3);

        addition = new Button("+");
        add(addition);
        addition.addActionListener(this);

        subtraction = new Button("-");
        add(subtraction);
        subtraction.addActionListener(this);

        multiplication = new Button("*");
        add(multiplication);
        multiplication.addActionListener(this);

        division = new Button("/");
        add(division);
        division.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){ 
        if(ae.getSource()==addition){
            int a,b,sum;
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
            sum = a+b;
            t3.setText(String.valueOf(sum));
        }

        if(ae.getSource()==subtraction){
            int a,b,sub;
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
            sub = a-b;
            t3.setText(String.valueOf(sub));
        }
    }
}
