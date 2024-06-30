import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {

    JLabel questionNo, question;
    JRadioButton option1, option2, opt3, option4;
    ButtonGroup optionGroup;
    JButton next, submit, lifeline;

    public static int timer = 15;
    public static int answered = 0;
    public static int count = 0;
    public static int score = 0;

    String name;

    String[][] questions;
    String[][] answers;
    String[][] userAnswer = new String[10][1];

    Quiz(String name) {
        this.name = name;
        setBounds(50, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
//        JLabel image = new JLabel(i1);
//        image.setBounds(0, 0, 1440, 392);
//        add(image);

        JavaQuestions javaQuestions = new JavaQuestions();
        questions = javaQuestions.getQuestions();
        answers = javaQuestions.getAnswers();

        questionNo = new JLabel();
        questionNo.setBounds(100, 450, 50, 30);
        questionNo.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(questionNo);

        question = new JLabel();
        question.setBounds(150, 450, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(question);

        option1 = new JRadioButton();
        option1.setBounds(170, 520, 700, 30);
        option1.setBackground(Color.WHITE);
        option1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(option1);

        option2 = new JRadioButton();
        option2.setBounds(170, 560, 700, 30);
        option2.setBackground(Color.WHITE);
        option2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(option2);

        opt3 = new JRadioButton();
        opt3.setBounds(170, 600, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);

        option4 = new JRadioButton();
        option4.setBounds(170, 640, 700, 30);
        option4.setBackground(Color.WHITE);
        option4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(option4);

        optionGroup = new ButtonGroup();
        optionGroup.add(option1);
        optionGroup.add(option2);
        optionGroup.add(opt3);
        optionGroup.add(option4);

        next = new JButton("Next");
        next.setBounds(1100, 550, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        lifeline = new JButton("50-50 Lifeline");
        lifeline.setBounds(1100, 630, 200, 40);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(30, 144, 255));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);

        submit = new JButton("Submit");
        submit.setBounds(1100, 710, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);

        start(count);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            option1.setEnabled(true);
            option2.setEnabled(true);
            opt3.setEnabled(true);
            option4.setEnabled(true);

            answered = 1;
            if (optionGroup.getSelection() == null) {
                userAnswer[count][0] = "";
            } else {
                userAnswer[count][0] = optionGroup.getSelection().getActionCommand();
            }

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            count++;
            start(count);
        } else if (ae.getSource() == lifeline) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                option2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                option1.setEnabled(false);
                option4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        } else if (ae.getSource() == submit) {
            answered = 1;
            if (optionGroup.getSelection() == null) {
                userAnswer[count][0] = "";
            } else {
                userAnswer[count][0] = optionGroup.getSelection().getActionCommand();
            }

            for (int i = 0; i < userAnswer.length; i++) {
                if (userAnswer[i][0].equals(answers[i][0])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new Score(name, score);
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        String time = "Time left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));

        if (timer > 0) {
            g.drawString(time, 1100, 500);
        } else {
            g.drawString("Times up!!", 1100, 500);
        }

        timer--; // 14

        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (answered == 1) {
            answered = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            option1.setEnabled(true);
            option2.setEnabled(true);
            opt3.setEnabled(true);
            option4.setEnabled(true);

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (optionGroup.getSelection() == null) {
                    userAnswer[count][0] = "";
                } else {
                    userAnswer[count][0] = optionGroup.getSelection().getActionCommand();
                }

                for (int i = 0; i < userAnswer.length; i++) {
                    if (userAnswer[i][0].equals(answers[i][0])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new Score(name, score);
            } else { // next button
                if (optionGroup.getSelection() == null) {
                    userAnswer[count][0] = "";
                } else {
                    userAnswer[count][0] = optionGroup.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }

    }

    public void start(int count) {
        questionNo.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        option1.setText(questions[count][1]);
        option1.setActionCommand(questions[count][1]);

        option2.setText(questions[count][2]);
        option2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        option4.setText(questions[count][4]);
        option4.setActionCommand(questions[count][4]);

        optionGroup.clearSelection();
    }

    public static void main(String[] args) {
        new Quiz("User");
    }
}