import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{      //ActionListener helps calls the needed functions when user presses the button.
    
    boolean isOperatorClicked=false;        //Public declarations.
    String oldValue;
    int clickedOperator;
    String plus,minus,divide,multiply;
    boolean power;

    JFrame jf;
    JLabel display;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton dotButton;
    JButton zeroButton;
    JButton equalButton;
    JButton divButton;
    JButton mulButton;
    JButton minusButton;
    JButton plusButton;
    JButton clearButton;
    JButton onButton;
    JButton offButton;
    JButton modButton;


    public Calculator() {
        jf = new JFrame("Calculator");   //Framing the screen. 
        jf.setLayout(null);
        jf.setSize(555,570);    //Setting size of the screen.
        jf.setLocation(400,100);    //Setting location of the screen.

        display = new JLabel();      //To create a display screen.
        display.setBounds(30,30, 480, 60);  //For setting the size of the display screen.
        display.setBackground(Color.gray);          //Setting bg color of the display screen.
        display.setOpaque(true);        //For displaying bg color.
        display.setHorizontalAlignment(SwingConstants.RIGHT);   //To align the text in right.
        display.setForeground(Color.white);     //For changing text color.
        jf.add(display);        //For adding the display screen to the frame.

        sevenButton = new JButton("7");     //For displaying 7 button.
        sevenButton.setBounds(30, 120, 80, 80);     //Setting the location and size.
        sevenButton.setFont(new Font("Arial",Font.PLAIN,20));   //Font family & size.
        jf.add(sevenButton);        //Adding button to the frame.
        sevenButton.addActionListener(this);    //For responsively adds text to the display screen.

        eightButton = new JButton("8");
        eightButton.setBounds(130, 120, 80, 80);
        eightButton.setFont(new Font("Arial",Font.PLAIN,20));
        jf.add(eightButton);
        eightButton.addActionListener(this);

        nineButton = new JButton("9");
        nineButton.setBounds(230, 120, 80, 80);
        nineButton.setFont(new Font("Arial",Font.PLAIN,20));
        jf.add(nineButton);
        nineButton.addActionListener(this);

        fourButton = new JButton("4");
        fourButton.setBounds(30, 220, 80, 80);
        fourButton.setFont(new Font("Arial",Font.PLAIN,20));
        jf.add(fourButton);
        fourButton.addActionListener(this);

        fiveButton = new JButton("5");
        fiveButton.setBounds(130, 220, 80, 80);
        fiveButton.setFont(new Font("Arial",Font.PLAIN,20));
        jf.add(fiveButton);
        fiveButton.addActionListener(this);

        sixButton = new JButton("6");
        sixButton.setBounds(230, 220, 80, 80);
        sixButton.setFont(new Font("Arial",Font.PLAIN,20));
        jf.add(sixButton);
        sixButton.addActionListener(this);

        oneButton = new JButton("1");
        oneButton.setBounds(30, 320, 80, 80);
        oneButton.setFont(new Font("Arial",Font.PLAIN,20));
        jf.add(oneButton);
        oneButton.addActionListener(this);

        twoButton = new JButton("2");
        twoButton.setBounds(130, 320, 80, 80);
        twoButton.setFont(new Font("Arial",Font.PLAIN,20));
        jf.add(twoButton);
        twoButton.addActionListener(this);

        threeButton = new JButton("3");
        threeButton.setBounds(230, 320, 80, 80);
        threeButton.setFont(new Font("Arial",Font.PLAIN,20));
        jf.add(threeButton);
        threeButton.addActionListener(this);

        dotButton = new JButton(".");
        dotButton.setBounds(30, 420, 80, 80);
        dotButton.setFont(new Font("Arial",Font.PLAIN,20));
        jf.add(dotButton);
        dotButton.addActionListener(this);

        zeroButton = new JButton("0");
        zeroButton.setBounds(130, 420, 80, 80);
        zeroButton.setFont(new Font("Arial",Font.PLAIN,20));
        jf.add(zeroButton);
        zeroButton.addActionListener(this);

        equalButton = new JButton("=");
        equalButton.setBounds(230, 420, 80, 80);
        equalButton.setFont(new Font("Arial",Font.PLAIN,20));
        jf.add(equalButton);
        equalButton.addActionListener(this);

        divButton = new JButton("/");
        divButton.setBounds(330, 120, 80, 80);
        divButton.setFont(new Font("Arial",Font.PLAIN,20));
        jf.add(divButton);
        divButton.addActionListener(this);

        mulButton = new JButton("x");
        mulButton.setBounds(330, 220, 80, 80);
        mulButton.setFont(new Font("Arial",Font.PLAIN,20));
        jf.add(mulButton);
        mulButton.addActionListener(this);

        minusButton = new JButton("-");
        minusButton.setBounds(330, 320, 80, 80);
        minusButton.setFont(new Font("Arial",Font.PLAIN,20));
        jf.add(minusButton);
        minusButton.addActionListener(this);

        plusButton = new JButton("+");
        plusButton.setBounds(330, 420, 80, 80);
        plusButton.setFont(new Font("Arial",Font.PLAIN,20));
        jf.add(plusButton);
        plusButton.addActionListener(this);

        clearButton = new JButton("C");
        clearButton.setBounds(430, 320, 80, 80);
        clearButton.setFont(new Font("Arial",Font.PLAIN,20));
        jf.add(clearButton);
        clearButton.addActionListener(this);

        onButton = new JButton("AC");
        onButton.setBounds(430, 120, 80,80);
        onButton.setFont(new Font("Arial",Font.PLAIN,20));
        jf.add(onButton);
        onButton.addActionListener(this);

        offButton = new JButton("OFF");
        offButton.setBounds(430, 220, 80,80);
        offButton.setFont(new Font("Arial",Font.PLAIN,20));
        jf.add(offButton);
        offButton.addActionListener(this);

        modButton = new JButton("%");
        modButton.setBounds(430, 420, 80, 80);
        modButton.setFont(new Font("Arial",Font.PLAIN,20));
        jf.add(modButton);
        modButton.addActionListener(this);
        
        jf.setVisible(true);        //To make the frame visible.
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //For automatically closing the program whenever closes the screen.
        
    }
    public static void main(String[] args) {
        new Calculator();
    }
    @Override
    public void actionPerformed(ActionEvent e) {        //Actions that should perform when clicking buttons.

        if(e.getSource()==sevenButton)
        {
            if(power){
                if(isOperatorClicked){                  //To check operator is clicked or not.
                    display.setText("7");
                    isOperatorClicked=false;
                }
                else{
                    display.setText(display.getText()+"7");     //To view the number with previous clicked number.
                }
            }
        }
            
        else if(e.getSource()==eightButton)
        {
            if(power){
                if(isOperatorClicked){
                    display.setText("8");
                    isOperatorClicked=false;
                }
                else{
                    display.setText(display.getText()+"8");
                }
            }
        }
        else if(e.getSource()==nineButton)
        {
            if(power){
                if(isOperatorClicked){
                    display.setText("9");
                    isOperatorClicked=false;
                }
                else{
                    display.setText(display.getText()+"9");
                }
            }
        }
        else if(e.getSource()==fourButton)
        {
            if(power){
                if(isOperatorClicked){
                    display.setText("4");
                    isOperatorClicked=false;
                }
                else{
                    display.setText(display.getText()+"4");
                }
            }
        }
        else if(e.getSource()==fiveButton)
        {
            if(power){
                if(isOperatorClicked){
                    display.setText("5");
                    isOperatorClicked=false;
                }
                else{
                    display.setText(display.getText()+"5");
                }
            }
        }
        else if(e.getSource()==sixButton)
        {
            if(power){
                if(isOperatorClicked){
                    display.setText("6");
                    isOperatorClicked=false;
                }
                else{
                    display.setText(display.getText()+"6");
                }
            }
        }
        else if(e.getSource()==oneButton)
        {
            if(power){
                if(isOperatorClicked){
                    display.setText("1");
                    isOperatorClicked=false;
                }
                else{
                    display.setText(display.getText()+"1");
                }
            }
        }
        else if(e.getSource()==twoButton)
        {
            if(power){
                if(isOperatorClicked){
                    display.setText("2");
                    isOperatorClicked=false;
                }
                else{
                    display.setText(display.getText()+"2");
                }
            }
        }
        else if(e.getSource()==threeButton)
        {
            if(power){
                if(isOperatorClicked){
                    display.setText("3");
                    isOperatorClicked=false;
                }
                else{
                    display.setText(display.getText()+"3");
                }
            }
        }
        else if(e.getSource()==zeroButton)
        {
            if(power){
                if(isOperatorClicked){
                    display.setText("0");
                    isOperatorClicked=false;
                }
                else{
                    display.setText(display.getText()+"0");
                }
            }
        }
        else if(e.getSource()==dotButton)
        {
            if(power){
                if(isOperatorClicked){
                    display.setText(".");
                    isOperatorClicked=false;
                }
                else{
                    display.setText(display.getText()+".");
                }
            }
        }
        else if(e.getSource()==equalButton)
        {
            if(power){
                String newValue = display.getText();        //Assigning new value to a variable.

                float newValueF = Float.parseFloat(newValue);   //Changing datatype.
                float oldValueF = Float.parseFloat(oldValue);
                float result=0;
                switch (clickedOperator) {                      //Operations performing.
                        case 1:result=oldValueF/newValueF;
                            break;
                        case 2:result=oldValueF*newValueF;
                            break;
                        case 3:result=oldValueF-newValueF;
                            break;
                        case 4:result=oldValueF+newValueF;
                            break;
                        case 5:result=oldValueF%newValueF;
                            break;
                        default:
                            break;
                }
                display.setText(result+"");
            }
        }
        else if(e.getSource()==divButton)
        {
            isOperatorClicked=true;
            clickedOperator = 1;        //Assigning clicked operator to 1 for representing division.
            oldValue = display.getText();
        }
        else if(e.getSource()==mulButton)
        {
            isOperatorClicked=true;
            clickedOperator = 2;
            oldValue = display.getText();
        }
        else if(e.getSource()==minusButton)
        {
            isOperatorClicked=true;
            oldValue = display.getText();
            clickedOperator = 3;
            
        }
        else if(e.getSource()==plusButton)
        {
            isOperatorClicked=true;
            oldValue = display.getText();
            clickedOperator = 4;
            
        }
        else if(e.getSource()==clearButton)
        {
            display.setText("");
        }
        else if(e.getSource()==onButton){
            display.setText("0");
            power=true;
        }
        
        else if(e.getSource()==offButton)
        {
            display.setText("");
            power=false;
        }
        else if(e.getSource()==modButton)
        {
            isOperatorClicked=true;
            oldValue = display.getText();
            clickedOperator = 5;
        }

        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");

        
    }

   
}