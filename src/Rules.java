import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    JButton start, back;
    JTextField topic;

    Rules() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome to Knowledge Knockout");
        heading.setBounds(180, 20, 700, 80);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(80, 40, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
                "<html>" +
                        "There are only 2 rules:" + "<br><br>" +
                        "1. You can't give any wrong answer" + "<br><br>" +
                        "2. You'll get 15 seconds for each questions" + "<br><br>" +
                        "<html>"
        );
        add(rules);

        JLabel enterTopic = new JLabel("Enter topic name:");
        enterTopic.setBounds(80, 400, 300, 40);
        enterTopic.setFont(new Font("Tahoma", Font.PLAIN, 24));
        enterTopic.setForeground(new Color(0, 0, 0));
        add(enterTopic);

        topic = new JTextField();
        topic.setBounds(280, 404, 430, 36);
        topic.setText("Java");
        topic.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(topic);

        start = new JButton("Start");
        start.setBounds(280, 500, 100, 40);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.setFont(new Font("Tahoma", Font.PLAIN, 20));
        start.addActionListener(this);
        add(start);

        back = new JButton("Back");
        back.setBounds(420, 500, 100, 40);
        back.setBackground(new Color(69, 69, 69));
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma", Font.PLAIN, 20));
        back.addActionListener(this);
        add(back);

        setSize(820, 680);
        setLocation(360, 60);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(topic.getText());
        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules();
    }
}