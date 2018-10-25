import javax.swing.*;
import javax.swing.event.*;
import java.util.Scanner;
import java.lang.Math;
import java.awt.event.*;
import java.awt.*;
class Calc implements ActionListener
{
    JFrame f;
    JTextField t;
    double temp, temp1, result, a;
    static double m1, m2;
    int k = 1, x = 0, y = 0, z = 0;
    char ch;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr,bsin,bcos,btan,blog,binversex,bxsq,bxpowy,bmodx,bln,bsqroot,bpimul,bexp; 
    static int operator=0;
     Calc()
    {
        f=new JFrame("Calculator");
        t=new JTextField();
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        bdiv=new JButton("/");
        bmul=new JButton("*");
        bsub=new JButton("-");
        badd=new JButton("+");
        bdec=new JButton(".");
        beq=new JButton("=");
        bdel=new JButton("DEL");
        bclr=new JButton("CLR");
        bsin=new JButton("SIN");
        bcos=new JButton("COS");
        btan=new JButton("TAN");
        blog=new JButton("log");
        bln=new  JButton("ln");
        binversex=new JButton("1/x");
        bxsq=new JButton("x^2");
        bxpowy=new JButton("x^3");
        bmodx=new JButton("|x|");
        bsqroot=new JButton("Sqrt");
        bpimul=new JButton("PI");
        bexp=new JButton("Exp");

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(true);
        
        t.setBounds(20,30,600,40);

        b7.setBounds(30,90,90,30);
        b8.setBounds(110,90,90,30);
        b9.setBounds(190,90,90,30);
        bdiv.setBounds(270,90,90,30);
        bsin.setBounds(350,90,90,30);
        bcos.setBounds(430,90,90,30);
        btan.setBounds(510,90,90,30);
        
        b4.setBounds(30,160,90,30);
        b5.setBounds(110,160,90,30);
        b6.setBounds(190,160,90,30);
        bmul.setBounds(270,160,90,30);
        bln.setBounds(350,160,90,30);
        blog.setBounds(430,160,90,30);
        binversex.setBounds(510,160,90,30);

        b1.setBounds(30,230,90,30);
        b2.setBounds(110,230,90,30);
        b3.setBounds(190,230,90,30);
        bsub.setBounds(270,230,90,30);
        bmodx.setBounds(350,230,90,30);
        bxsq.setBounds(430,230,90,30);
        bxpowy.setBounds(510,230,90,30);
        
        bdec.setBounds(30,310,90,30);
        b0.setBounds(110,310,90,30);
        beq.setBounds(190,310,90,30);
        badd.setBounds(270,310,90,30);
        bsqroot.setBounds(350,310,90,30);
        bpimul.setBounds(430,310,90,30);
        bexp.setBounds(510,310,90,30);
        
        bdel.setBounds(60,370,90,30);
        bclr.setBounds(190,370,90,30);
        f.add(t);f.add(b7);f.add(b8);f.add(b9);f.add(bdiv);
        f.add(b4);f.add(b5);f.add(b6);f.add(bmul);f.add(b1);f.add(b2);
        f.add(b3);f.add(bsub);f.add(bdec); f.add(b0);f.add(beq);
        f.add(badd);f.add(bdel);f.add(bclr);f.add(bsin);f.add(bcos);f.add(btan);f.add(blog);
        f.add(bln);f.add(binversex);f.add(bmodx); f.add(bxsq);f.add(bxpowy);
        f.add(bsqroot); f.add(bpimul);f.add(bexp);
         
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bsub.addActionListener(this);
        bdec.addActionListener(this);
        beq.addActionListener(this);
        bdel.addActionListener(this);
        bclr.addActionListener(this);
        bsin.addActionListener(this);
        bcos.addActionListener(this);
        btan.addActionListener(this);
        blog.addActionListener(this);
        bln.addActionListener(this);
        binversex.addActionListener(this);
        bmodx.addActionListener(this);
        bxsq.addActionListener(this);
        bxpowy.addActionListener(this);
        bsqroot.addActionListener(this);
        bpimul.addActionListener(this);
        bexp.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.equals("1")) {
            if (z == 0) {
                t.setText(t.getText() + "1");
            } else {
                t.setText("");
                t.setText(t.getText() + "1");
                z = 0;
            }
        }
        if (s.equals("2")) {
            if (z == 0) {
                t.setText(t.getText() + "2");
            } else {
                t.setText("");
                t.setText(t.getText() + "2");
                z = 0;
            }
        }
        if (s.equals("3")) {
            if (z == 0) {
                t.setText(t.getText() + "3");
            } else {
                t.setText("");
                t.setText(t.getText() + "3");
                z = 0;
            }
        }
        if (s.equals("4")) {
            if (z == 0) {
                t.setText(t.getText() + "4");
            } else {
                t.setText("");
                t.setText(t.getText() + "4");
                z = 0;
            }
        }
        if (s.equals("5")) {
            if (z == 0) {
                t.setText(t.getText() + "5");
            } else {
                t.setText("");
                t.setText(t.getText() + "5");
                z = 0;
            }
        }
        if (s.equals("6")) {
            if (z == 0) {
                t.setText(t.getText() + "6");
            } else {
                t.setText("");
                t.setText(t.getText() + "6");
                z = 0;
            }
        }
        if (s.equals("7")) {
            if (z == 0) {
                t.setText(t.getText() + "7");
            } else {
                t.setText("");
                t.setText(t.getText() + "7");
                z = 0;
            }
        }
        if (s.equals("8")) {
            if (z == 0) {
                t.setText(t.getText() + "8");
            } else {
                t.setText("");
                t.setText(t.getText() + "8");
                z = 0;
            }
        }
        if (s.equals("9")) {
            if (z == 0) {
                t.setText(t.getText() + "9");
            } else {
                t.setText("");
                t.setText(t.getText() + "9");
                z = 0;
            }
        }
        if (s.equals("0")) {
            if (z == 0) {
                t.setText(t.getText() + "0");
            } else {
                t.setText("");
                t.setText(t.getText() + "0");
                z = 0;
            }
        }
        if (s.equals("log")) {
            if (t.getText().equals("")) {
                t.setText("");
            } else {
                a =Math.log(Double.parseDouble(t.getText()));
                t.setText("");
                t.setText(t.getText() + a);
            }
        }
        if (s.equals("ln")) {
            if (t.getText().equals("")) {
                t.setText("");
            } else {
                double tmp=Math.log(Math.exp(1));
                a =(Math.log(Double.parseDouble(t.getText()))/tmp);
                t.setText("");
                t.setText(t.getText() + a);
            }
        }
        if (s.equals("1/x")) {
            if (t.getText().equals("")) {
                t.setText("");
            } else {
                a = 1 / Double.parseDouble(t.getText());
                t.setText("");
                t.setText(t.getText() + a);
            }
        }
        if (s.equals("Exp")) {
            if (t.getText().equals("")) {
                t.setText("");
            } else {
                a = Math.exp(Double.parseDouble(t.getText()));
                t.setText("");
                t.setText(t.getText() + a);
            }
        }
        if(s.equals("|x|"))
        {
            if(t.getText().equals(""))
            {
                t.setText("");
            }
            else
            {
                a=Math.abs(Double.parseDouble(t.getText()));
                t.setText("");
                t.setText(t.getText() + a);
            }
        }
        if (s.equals("x^2")) {
            if (t.getText().equals("")) {
                t.setText("");
            } else {
                a = Math.pow(Double.parseDouble(t.getText()), 2);
                t.setText("");
                t.setText(t.getText() + a);
            }
        }
        if (s.equals("+")) {
            if (t.getText().equals("")) {
                t.setText("");
                temp = 0;
                ch = '+';
            } else {
                temp = Double.parseDouble(t.getText());
                t.setText("");
                ch = '+';
                y = 0;
                x = 0;
            }
            t.requestFocus();
        }
        if (s.equals("-")) {
            if (t.getText().equals("")) {
                t.setText("");
                temp = 0;
                ch = '-';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(t.getText());
                t.setText("");
                ch = '-';
            }
            t.requestFocus();
        }
        if (s.equals("/")) {
            if (t.getText().equals("")) {
                t.setText("");
                temp = 1;
                ch = '/';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(t.getText());
                ch = '/';
                t.setText("");
            }
            t.requestFocus();
        }
        if (s.equals("*")) {
            if (t.getText().equals("")) {
                t.setText("");
                temp = 1;
                ch = '*';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(t.getText());
                ch = '*';
                t.setText("");
            }
            t.requestFocus();
        }
        if (s.equals("Sqrt")) {
            if (t.getText().equals("")) {
                t.setText("");
            } else {
                a = Math.sqrt(Double.parseDouble(t.getText()));
                t.setText("");
                t.setText(t.getText() + a);
            }
        }
        if(s.equals("PI"))
        {
            if (t.getText().equals("")) {
                t.setText("");
            }
                else
                {
                    a=Math.PI*(Double.parseDouble(t.getText()));
                    t.setText("");
                    t.setText(t.getText() + a);
                }
        }  
        if (s.equals("SIN")) {
            if (t.getText().equals("")) {
                t.setText("");
            } else {
                a = Math.sin(Double.parseDouble(t.getText()));
                t.setText("");
                t.setText(t.getText() + a);
            }
        }
        if (s.equals("COS")) {
            if (t.getText().equals("")) {
                t.setText("");
            } else {
                a = Math.cos(Double.parseDouble(t.getText()));
                t.setText("");
                t.setText(t.getText() + a);
            }
        }
        if (s.equals("TAN")) {
            if (t.getText().equals("")) {
                t.setText("");
            } else {
                a = Math.tan(Double.parseDouble(t.getText()));
                t.setText("");
                t.setText(t.getText() + a);
            }
        }
        if (s.equals("=")) {
            if (t.getText().equals("")) {
                t.setText("");
            } else {
                temp1 = Double.parseDouble(t.getText());
                switch (ch) {
                case '+':
                    result = temp + temp1;
                    break;
                case '-':
                    result = temp - temp1;
                    break;
                case '/':
                    result = temp / temp1;
                    break;
                case '*':
                    result = temp * temp1;
                    break;
                }
                t.setText("");
                t.setText(t.getText() + result);
                z = 1;
            }
        }
         if (s.equals(".")) {
            if (y == 0) {
                t.setText(t.getText() + ".");
                y = 1;
            } else {
                t.setText(t.getText());
            }
        }
        if (s.equals("x^3")) {
            if (t.getText().equals("")) {
                t.setText("");
            } else {
                a = Math.pow(Double.parseDouble(t.getText()), 3);
                t.setText("");
                t.setText(t.getText() + a);
            }
        }
        if (s.equals("CLR")) {
            t.setText("");
            x = 0;
            y = 0;
            z = 0;
        }

        if(s.equals("DEL"))
        {
            String str=t.getText();
            t.setText("");
            for(int i=0;i<str.length()-1;i++)
            t.setText(t.getText()+str.charAt(i));
        }  






    }   
        public static void main(String s[])
        {
           new Calc();
        }
}       
    