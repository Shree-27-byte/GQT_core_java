package Project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Swings extends JFrame implements ActionListener {
    String[] questions = {
        "What comes next in the series: 2, 4, 8, 16, __?",
        "If the cost of 5 pens is 75rs, what is the cost of 3 pens?",
        "What is the missing number in the series: 3, 6, 9, __, 15?",
        "If 5x = 20, what is the value of x?",
        "Which of the following is a prime number?",
        "If a train travels 60 km in 1.5 hours, what is its speed?",
        "Find the odd one",
        "If 2A + 3 = 11, what is the value of A?",
        "Which number is divisible by 3?",
        "A clock shows 3:00. What angle triangle it is?"
    };
    String[][] options = {
        {"18", "20", "24", "32"},
        {"30rs", "45rs", "60rs", "90rs"},
        {"10", "11", "12", "13"},
        {"2", "3", "4", "5"},
        {"17", "9", "15", "21"},
        {"30 km/h", "45 km/h", "40 km/h", "50 km/h"},
        {"4", "6", "9", "8"},
        {"4", "3", "6", "5"},
        {"21", "22", "25", "29"},
        {"0°", "90°", "15°", "30°"}
    };
    char[] answers = {'D', 'B', 'C', 'C', 'A', 'C', 'C', 'A', 'A', 'B'};
    int[] prizes = {1000, 2000, 3000, 5000, 10000, 20000, 35000, 50000, 70000, 100000};

    int currentQuestion = 0;
    int lastCorrect = -1;
    boolean lifelineUsed = false;

    JLabel questionLabel, messageLabel;
    JRadioButton[] optionButtons = new JRadioButton[4];
    ButtonGroup optionsGroup;
    JButton nextButton, lifelineButton, quitButton;

    public Swings() {
        setTitle("Quiz Game");
        setSize(650, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Question label
        questionLabel = new JLabel();
        questionLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
        questionLabel.setHorizontalAlignment(JLabel.CENTER);
        questionLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        // Center panel for options + message
        JPanel centerPanel = new JPanel(new BorderLayout(10, 10));

        // Options panel
        JPanel optionsPanel = new JPanel(new GridLayout(4, 1, 5, 5));
        optionsPanel.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
        optionsGroup = new ButtonGroup();
        for (int i = 0; i < 4; i++) {
            optionButtons[i] = new JRadioButton();
            optionButtons[i].setFont(new Font("Bookman Old Style", Font.BOLD, 16));
            optionsGroup.add(optionButtons[i]);
            optionsPanel.add(optionButtons[i]);
        }
        // Message label inside question panel
        messageLabel = new JLabel(" ");
        messageLabel.setFont(new Font("Arial", Font.BOLD, 18));
        messageLabel.setHorizontalAlignment(JLabel.CENTER);
        messageLabel.setForeground(Color.BLACK);

        centerPanel.add(optionsPanel, BorderLayout.CENTER);
        centerPanel.add(messageLabel, BorderLayout.SOUTH);
        
        // Bottom panel with buttons
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 10)); 
        lifelineButton = new JButton("Lifeline");
        nextButton = new JButton("Next");
        quitButton = new JButton("Quit");

        lifelineButton.addActionListener(this);
        nextButton.addActionListener(this);
        quitButton.addActionListener(this);
        bottomPanel.add(lifelineButton);
        bottomPanel.add(nextButton);
        bottomPanel.add(quitButton);
        add(questionLabel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
        loadQuestion();
        setVisible(true);
    }
    void loadQuestion() {
        optionsGroup.clearSelection();
        questionLabel.setText("Q" + (currentQuestion + 1) + ". " + questions[currentQuestion]);
        for (int i = 0; i < 4; i++) {
            optionButtons[i].setText(options[currentQuestion][i]);
            optionButtons[i].setVisible(true);
            optionButtons[i].setEnabled(true);
        }
        messageLabel.setText(" ");
        messageLabel.setForeground(Color.BLACK);
    }
    char getSelectedOption() {
        for (int i = 0; i < 4; i++) {
            if (optionButtons[i].isSelected()) {
                return (char) ('A' + i);
            }   }
        return 'X';
    }
    void askAudience() {
        messageLabel.setText("Audience suggests: " + answers[currentQuestion]);
        messageLabel.setForeground(Color.MAGENTA);
    }
    void useFiftyFifty() {
        char correct = answers[currentQuestion];
        int correctIndex = correct - 'A';
        int removed = 0;
        for (int j = 0; j < 4; j++) {
            if (j != correctIndex && removed < 2) {
                optionButtons[j].setVisible(false);
                removed++;
            }}
        messageLabel.setText("50-50 lifeline used!");
        messageLabel.setForeground(Color.ORANGE);
    }
    void endGame(int finalPrize) {
        messageLabel.setText(" Wrong Answer! Final Prize: " + finalPrize + " Rs.");
        messageLabel.setForeground(Color.RED);
        nextButton.setEnabled(false);
        lifelineButton.setEnabled(false);
        quitButton.setEnabled(false);
        for (JRadioButton btn : optionButtons) {
            btn.setEnabled(false);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == lifelineButton) {
            if (lifelineUsed) {
                messageLabel.setText(" Lifeline already used!");
                messageLabel.setForeground(Color.RED);
            } else {
                String[] choices = {"Ask the Audience", "50-50"};
                int choice = JOptionPane.showOptionDialog(this, "Choose a Lifeline", "Lifeline",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                        null, choices, choices[0]);
                if (choice == 0) askAudience();
                else if (choice == 1) useFiftyFifty();
                lifelineUsed = true;
            }
        }
        if (e.getSource() == quitButton) {
            int prize = (lastCorrect >= 0) ? prizes[lastCorrect] : 0;
            messageLabel.setText(" You quit the game. \nFinal Prize: " + prize + " Rs.");
            messageLabel.setForeground(Color.BLUE);
            nextButton.setEnabled(false);
            lifelineButton.setEnabled(false);
            quitButton.setEnabled(false);
            for (JRadioButton btn : optionButtons) {
                btn.setEnabled(false);
            }
        }
        if (e.getSource() == nextButton) {
            char selected = getSelectedOption();
            if (selected == 'X') {
                messageLabel.setText(" Please select an option!");
                messageLabel.setForeground(Color.RED);
                return;
            }
            if (selected == answers[currentQuestion]) {
                int prize = prizes[currentQuestion];
                messageLabel.setText(" Correct Answer!\n You won " + prize + " Rs.");
                messageLabel.setForeground(Color.GREEN);
                lastCorrect = currentQuestion;
                
                // timer to show next message
                Timer timer = new Timer(1000, ev -> {
                    currentQuestion++;
                    if (currentQuestion < questions.length) {
                        loadQuestion();
                    } else {
                        messageLabel.setText("Congratulations You Won The Quiz \nTotal Prize: " + prizes[questions.length - 1] + " Rs.");
                        messageLabel.setForeground(Color.BLUE);
                        nextButton.setEnabled(false);
                        lifelineButton.setEnabled(false);
                        quitButton.setEnabled(false);
                    }
                });
                timer.setRepeats(false);
                timer.start();
            } else {
                int finalPrize = 0;
                if (currentQuestion >= 5 && currentQuestion <= 6) finalPrize = prizes[4];
                else if (currentQuestion >= 7 && currentQuestion <= 8) finalPrize = prizes[6];
                else if (currentQuestion == 9) finalPrize = prizes[8];

                endGame(finalPrize);
            }}}
    public static void main(String[] args) {
        new Swings();
    }
}
