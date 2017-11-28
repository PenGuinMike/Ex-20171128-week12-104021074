import javax.swing.*;
import java.awt.*;

public class SFrame extends JFrame{
    Container cp;
    private JTextArea jta = new JTextArea();
    private JScrollPane jsp = new JScrollPane(jta);

    private JLabel jlbIP = new JLabel("Server IP:");
    private JLabel jlbIP1 = new JLabel("8787878787");
    private JLabel jlbPort = new JLabel("Port:");

    private JButton jbtnStart = new JButton("Start");
    private JButton jbtnStop = new JButton("Stop");
    private JButton jbtnExit = new JButton("Exit");
    private JButton jbtnSend = new JButton("Send");

    private JTextField jtf = new JTextField();

    private JPanel jpnC = new JPanel(new GridLayout(3,3,5,5));
    private JPanel jpnR = new JPanel(new GridLayout(7,1,6,10));
    private JPanel jpnA = new JPanel(new GridLayout(1,3,5,6));
    private JPanel jpnB = new JPanel(new GridLayout(2,1,3,6));

    private JButton btn [] = new JButton[9];


    public SFrame (){
        init();
    }

    private void init(){
        this.setBounds(0,0,800,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout());

        jpnR.add(jlbIP);jpnR.add(jlbIP1);
        jpnR.add(jlbPort);jpnR.add(jtf);
        jpnR.add(jbtnStart);jpnR.add(jbtnStop);
        jpnR.add(jbtnExit);

        cp.add(jpnC,BorderLayout.CENTER);
//        jpnA.add(jsp);jpnA.add(jpnC);jpnA.add(jpnR);
        cp.add(jsp,BorderLayout.WEST);
        jsp.setPreferredSize(new Dimension(160,450));
        jpnR.setPreferredSize(new Dimension(95,450));
//        jpnC.setPreferredSize(new Dimension(240,450));
        cp.add(jpnR,BorderLayout.EAST);
//        cp.add();
        for(int i=0;i<9;i++){
            btn[i]=new JButton();
            jpnC.add(btn[i]);
        }
    }
}