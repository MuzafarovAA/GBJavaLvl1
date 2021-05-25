package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterApp extends JFrame {

    private int value;
    private int iterationStep = 1;

    public CounterApp(int initialValue) {
        setTitle("Счетчик");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setResizable(false);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 32);

        value = initialValue;

        JLabel counterLabel = new JLabel(String.valueOf(value));
        counterLabel.setFont(font);
        counterLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterLabel, BorderLayout.CENTER);

        JTextField iterationText = new JTextField();
        iterationText.setHorizontalAlignment(SwingConstants.CENTER);
        add(iterationText, BorderLayout.PAGE_START);

        JButton buttonMinus = new JButton("<");
        buttonMinus.setFont(font);
        add(buttonMinus, BorderLayout.LINE_START);

        JButton buttonPlus = new JButton(">");
        buttonPlus.setFont(font);
        add(buttonPlus, BorderLayout.LINE_END);

        JButton buttonClear = new JButton("Сброс");
        add(buttonClear, BorderLayout.PAGE_END);

        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value -= iterationStep;
                counterLabel.setText(String.valueOf(value));
            }
        });

        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value += iterationStep;
                counterLabel.setText(String.valueOf(value));
            }
        });

        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = 0;
                iterationStep = 1;
                counterLabel.setText(String.valueOf(value));
                iterationText.setText(null);
            }
        });

        iterationText.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                iterationStep = Integer.parseInt(iterationText.getText());
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CounterApp(0);
            }
        });

    }
}
