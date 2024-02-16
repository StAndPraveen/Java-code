import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code=ApletTwoNumbers.java width=250 height=250 > </applet> */

public class ApletTwoNumbers extends Applet implements ActionListener {
    TextField firstNum, secondNum, resultNum;


    public ApletTwoNumbers(){
        firstNum = new TextField(15);
        secondNum = new TextField(15);
        resultNum = new TextField(5);

        secondNum.addActionListener(this);

        add(new Label("enter first number"));  add(firstNum);
        add(new Label("enter first number"));  add(secondNum);
        add(new Label("S U M"));  add(resultNum);      
    }
    public void actionPerformed(ActionEvent e){
        String str1 = firstNum.getText();
        double fn = Double.parseDouble(str1);
        double sn = Double.parseDouble(secondNum.getText());

        resultNum.setText("sum is "+(fn+sn));
    }
}
