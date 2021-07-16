
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Math;

class TicTacToe extends JFrame implements ActionListener,WindowListener
{
    int p1s=0,p2s=0,c=0;
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    
    JButton b1 = new JButton();
    JButton b2 = new JButton();
    JButton b3 = new JButton();
    JButton b4 = new JButton();
    JButton b5 = new JButton();
    JButton b6 = new JButton();
    JButton b7 = new JButton();
    JButton b8 = new JButton();
    JButton b9 = new JButton();
    
    JLabel l1 = new JLabel("Player 1 Score is :"+p1s);
    JLabel l2 = new JLabel("Player 2 Score is :"+p2s);
    JLabel l3 = new JLabel();
    
    TicTacToe()
    {
        setLayout(null);
        setSize(900,500);
        
        p1.setLayout(new GridLayout(3,3,5,5));
        p2.setLayout(null);
        
        p1.setBounds(30,30,400,400);
        p2.setBounds(500,0,400,500);
        
        l1.setBounds(50,50,200,60);
        l2.setBounds(50,200,200,60);
        l3.setBounds(50,350,200,60);
        
        
        p1.add(b1);p1.add(b2);p1.add(b3);
        p1.add(b4);p1.add(b5);p1.add(b6);
        p1.add(b7);p1.add(b8);p1.add(b9);
        
        p2.add(l1);p2.add(l2);p2.add(l3);
        
        add(p1);
        add(p2);
        
        b1.setFont(new Font("Arial", Font.PLAIN, 50));
        b2.setFont(new Font("Arial", Font.PLAIN, 50));
        b3.setFont(new Font("Arial", Font.PLAIN, 50));
        b4.setFont(new Font("Arial", Font.PLAIN, 50));
        b5.setFont(new Font("Arial", Font.PLAIN, 50));
        b6.setFont(new Font("Arial", Font.PLAIN, 50));
        b7.setFont(new Font("Arial", Font.PLAIN, 50));
        b8.setFont(new Font("Arial", Font.PLAIN, 50));
        b9.setFont(new Font("Arial", Font.PLAIN, 50));
        
        l2.setFont(new Font("Arial", Font.PLAIN, 20));
        l1.setFont(new Font("Arial", Font.PLAIN, 20));
        l3.setFont(new Font("Arial", Font.PLAIN, 20));
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        addWindowListener(this);
        
        setVisible(true);
        
    }

    public static void main(String args[])
    {
        TicTacToe t = new TicTacToe();
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1 && e.getActionCommand() != "X" && e.getActionCommand() != "O")
        {
            if(c%2 == 0)
                b1.setText("X");
            else
                b1.setText("O");
            c++;
        }
        else if(e.getSource() == b2 && e.getActionCommand() != "X" && e.getActionCommand() != "O")
        {
            if(c%2 == 0)
                b2.setText("X");
            else
                b2.setText("O");
            c++;
        }
        else if(e.getSource() == b3 && e.getActionCommand() != "X" && e.getActionCommand() != "O")
        {
            if(c%2 == 0)
                b3.setText("X");
            else
                b3.setText("O");
            c++;
        }
        else if(e.getSource() == b4 && e.getActionCommand() != "X" && e.getActionCommand() != "O")
        {
            if(c%2 == 0)
                b4.setText("X");
            else
                b4.setText("O");
            c++;
        }
        else if(e.getSource() == b5 && e.getActionCommand() != "X" && e.getActionCommand() != "O")
        {
            if(c%2 == 0)
                b5.setText("X");
            else
                b5.setText("O");
            c++;
        }
        else if(e.getSource() == b6 && e.getActionCommand() != "X" && e.getActionCommand() != "O")
        {
            if(c%2 == 0)
                b6.setText("X");
            else
                b6.setText("O");
            c++;
        }
        else if(e.getSource() == b7 && e.getActionCommand() != "X" && e.getActionCommand() != "O")
        {
            if(c%2 == 0)
                b7.setText("X");
            else
                b7.setText("O");
            c++;
        }
        else if(e.getSource() == b8 && e.getActionCommand() != "X" && e.getActionCommand() != "O")
        {
            if(c%2 == 0)
                b8.setText("X");
            else
                b8.setText("O");
            c++;
        }
        else if(e.getSource() == b9 && e.getActionCommand() != "X" && e.getActionCommand() != "O")
        {
            if(c%2 == 0)
                b9.setText("X");
            else
                b9.setText("O");
            c++;
        }
        
        String s1 = b1.getText();
        String s2 = b2.getText();
        String s3 = b3.getText();
        String s4 = b4.getText();
        String s5 = b5.getText();
        String s6 = b6.getText();
        String s7 = b7.getText();
        String s8 = b8.getText();
        String s9 = b9.getText();
        if(c>4)
        {
        if(s1.equals("X") && s2.equals("X") && s3.equals("X"))
        {
           ++p1s;
           l1.setText("Player 1 Score is : "+p1s);
           l3.setText("Last Game : P1");
           clear();
        }
        else if(s1.equals("O") && s2.equals("O") && s3.equals("O"))
        {
           ++p2s;
           l2.setText("Player 2 Score is : "+p2s);
           l3.setText("Last Game : P2");
           clear();
        } else if(s4.equals("X") && s5.equals("X") && s6.equals("X"))
        {
           ++p1s;
           l1.setText("Player 1 Score is : "+p1s);
           l3.setText("Last Game : P1");
           clear();
        }
         else if(s4.equals("O") && s5.equals("O") && s6.equals("O"))
        {
           ++p2s;
           l2.setText("Player 2 Score is : "+p2s);
           l3.setText("Last Game : P2");
           clear();
        } else if(s7.equals("X") && s8.equals("X") && s9.equals("X"))
        {
           ++p1s;
           l1.setText("Player 1 Score is : "+p1s);
           l3.setText("Last Game : P1");
           clear();
        } else if(s7.equals("O") && s8.equals("O") && s9.equals("O"))
        {
           ++p2s;
           l2.setText("Player 2 Score is : "+p2s);
           l3.setText("Last Game : P2");
           clear();
        }  else if(s1.equals("X") && s4.equals("X") && s7.equals("X"))
        {
           ++p1s;
           l1.setText("Player 1 Score is : "+p1s);
           l3.setText("Last Game : P1");
           clear();
        }else if(s1.equals("O") && s4.equals("O") && s7.equals("O"))
        {
           ++p2s;
           l2.setText("Player 2 Score is : "+p2s);
           l3.setText("Last Game : P2");
           clear();
        }  else if(s2.equals("X") && s5.equals("X") && s8.equals("X"))
        {
           ++p1s;
           l1.setText("Player 1 Score is : "+p1s);
           l3.setText("Last Game : P1");
           clear();
        }else if(s2.equals("O") && s5.equals("O") && s8.equals("O"))
        {
           ++p2s;
           l2.setText("Player 2 Score is : "+p2s);
           l3.setText("Last Game : P2");
           clear();
        } else if(s3.equals("X") && s6.equals("X") && s9.equals("X"))
        {
           ++p1s;
           l1.setText("Player 1 Score is : "+p1s);
           l3.setText("Last Game : P1");
           clear();
        }else if(s3.equals("O") && s6.equals("O") && s9.equals("O"))
        {
           ++p2s;
           l2.setText("Player 2 Score is : "+p2s);
           l3.setText("Last Game : P2");
           clear();
        } else if(s1.equals("X") && s5.equals("X") && s9.equals("X"))
        {
           ++p1s;
           l1.setText("Player 1 Score is : "+p1s);
           l3.setText("Last Game : P1");
           clear();
        }else if(s1.equals("O") && s5.equals("O") && s9.equals("O"))
        {
           ++p2s;
           l2.setText("Player 2 Score is : "+p2s);
           l3.setText("Last Game : P2");
           clear();
        } else if(s3.equals("X") && s5.equals("X") && s7.equals("X"))
        {
           ++p1s;
           l1.setText("Player 1 Score is : "+p1s);
           l3.setText("Last Game : P1");
           clear();
        }else if(s3.equals("O") && s5.equals("O") && s7.equals("O"))
        {
           ++p2s;
           l2.setText("Player 2 Score is : "+p2s);
           l3.setText("Last Game : P2");
           clear();
        }
        else if(c==9)
        {
            l3.setText("Last Game : Draw");
        }
        
        if(c == 9)
        {
            c = 0;
            clear();
        }
        }
            
    }
    
    void clear()
    {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        c = 0;
    }
    
    void ran()
    {
        int rand = (int)(Math.random() * 10);
    }

    @Override
    public void windowOpened(WindowEvent e)
    {
    }

    @Override
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e)
    {
    }

    @Override
    public void windowIconified(WindowEvent e)
    {
    }

    @Override
    public void windowDeiconified(WindowEvent e)
    {
    }

    @Override
    public void windowActivated(WindowEvent e)
    {
    }

    @Override
    public void windowDeactivated(WindowEvent e)
    {
    }
}
