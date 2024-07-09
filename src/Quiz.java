import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Quiz extends JFrame implements ActionListener {
    JLabel questionNo, question, currentScore;
    JRadioButton option1, option2, option3, option4;
    ButtonGroup optionGroup;
    JButton next, submit;

    public static int timer = 15;
    public static boolean answered = false;
    public static int count = 0;
    public static int score = 0;
    public static int no = 1;

    Questions questionsSet;
    String[][] questions;
    String[][] answers;
    String[][] userAnswer = new String[100][1];

    Quiz(String topic) {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        QuestionsFactory questionsFactory = new QuestionsFactory();
        questionsSet = questionsFactory.getQuestions(topic);
        questions = questionsSet.getQuestions();
        answers = questionsSet.getAnswers();

        questionNo = new JLabel();
        questionNo.setBounds(20, 20, 50, 30);
        questionNo.setFont(new Font("Tahoma", Font.PLAIN, 22));
        add(questionNo);

        question = new JLabel();
        question.setBounds(60, 20, 1400, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 22));
        add(question);

        currentScore = new JLabel();
        currentScore.setBounds(360, 480, 900, 30);
        currentScore.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(currentScore);

        option1 = new JRadioButton();
        option1.setBounds(60, 70, 700, 30);
        option1.setBackground(Color.WHITE);
        option1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(option1);

        option2 = new JRadioButton();
        option2.setBounds(60, 110, 700, 30);
        option2.setBackground(Color.WHITE);
        option2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(option2);

        option3 = new JRadioButton();
        option3.setBounds(60, 150, 700, 30);
        option3.setBackground(Color.WHITE);
        option3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(option3);

        option4 = new JRadioButton();
        option4.setBounds(60, 190, 700, 30);
        option4.setBackground(Color.WHITE);
        option4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(option4);

        optionGroup = new ButtonGroup();
        optionGroup.add(option1);
        optionGroup.add(option2);
        optionGroup.add(option3);
        optionGroup.add(option4);

        next = new JButton("Next");
        next.setBounds(760, 480, 120, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 20));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);


        score = 0;
        no = 1;
        Random random = new Random();
        count = random.nextInt(100);
        start(count);

        setSize(1220, 680);
        setLocation(160, 60);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            option1.setEnabled(true);
            option2.setEnabled(true);
            option3.setEnabled(true);
            option4.setEnabled(true);

            answered = true;
            if (optionGroup.getSelection() == null) {
                userAnswer[count][0] = "";
            } else {
                userAnswer[count][0] = optionGroup.getSelection().getActionCommand();
            }
            if (userAnswer[count][0].equals(answers[count][0])) {
                score++;
            } else {
                setVisible(false);
                new Score(score);
            }

            count++;
            start(count);
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        String time = timer + " seconds remaining";
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));

        if (timer > 0) {
            g.drawString(time, 480, 400);
        } else {
            g.drawString("Times up!!", 550, 400);
        }

        timer--;

        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (answered == true) {
            answered = false;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            option1.setEnabled(true);
            option2.setEnabled(true);
            option3.setEnabled(true);
            option4.setEnabled(true);

            if (optionGroup.getSelection() == null) {
                setVisible(false);
                new Score(score);
            } else {
                userAnswer[count][0] = optionGroup.getSelection().getActionCommand();
                if (userAnswer[count][0].equals(answers[count][0])) {
                    score++;
                } else {
                    setVisible(false);
                    new Score(score);
                }
            }
            count++;
            start(count);
        }

    }

    public void start(int count) {
        questionNo.setText("" + no++ + ". ");
        question.setText(questions[count][0]);

        option1.setText(questions[count][1]);
        option1.setActionCommand(questions[count][1]);

        option2.setText(questions[count][2]);
        option2.setActionCommand(questions[count][2]);

        option3.setText(questions[count][3]);
        option3.setActionCommand(questions[count][3]);

        option4.setText(questions[count][4]);
        option4.setActionCommand(questions[count][4]);

        optionGroup.clearSelection();

        currentScore.setText("Score: " + score);
    }

    public static void main(String[] args) {
        new Quiz("Java");
    }
}