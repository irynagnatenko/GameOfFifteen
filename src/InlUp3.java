import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Cretated by Madeleine Lennhamn
 * Date: 2020-10-25
 * Time: 08:40
 * Project: $ {PROJECT_NAME}
 * Copyright: MIT
 *
 *   TODO: Kontrollera att bara knapparna intill blank knapp byter nummer.
 *   TODO: Nollställ knapp 16 varje gång man trycker på "new game".
 *   TODO: Skriv ut en text att man vunnit när alla knappar är på plats.
 *
 *
 */

public class InlUp3 extends JFrame implements ActionListener {


    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, newGame;
    static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);


    public InlUp3() {

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b10 = new JButton("10");
        b11 = new JButton("11");
        b12 = new JButton("12");
        b13 = new JButton("13");
        b14 = new JButton("14");
        b15 = new JButton("15");
        b16 = new JButton(" ");
        newGame = new JButton("New game!");


        b1.setBounds(10, 30, 80, 80);
        b2.setBounds(90, 30, 80, 80);
        b3.setBounds(170, 30, 80, 80);
        b4.setBounds(250, 30, 80, 80);
        b5.setBounds(10, 110, 80, 80);
        b6.setBounds(90, 110, 80, 80);
        b7.setBounds(170, 110, 80, 80);
        b8.setBounds(250, 110, 80, 80);
        b9.setBounds(10, 190, 80, 80);
        b10.setBounds(90, 190, 80, 80);
        b11.setBounds(170, 190, 80, 80);
        b12.setBounds(250, 190, 80, 80);
        b13.setBounds(10, 270, 80, 80);
        b14.setBounds(90, 270, 80, 80);
        b15.setBounds(170, 270, 80, 80);
        b16.setBounds(250, 270, 80, 80);
        newGame.setBounds(120, 370, 100, 40);


        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        add(b12);
        add(b13);
        add(b14);
        add(b15);
        add(b16);
        add(newGame);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        newGame.addActionListener(this);


        newGame.setBackground(Color.BLACK);
        newGame.setForeground(Color.black);
        setSize(340, 450);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }


    public static void main(String[] args) {
        InlUp3 i = new InlUp3();
        shuffleArray(numbers);

    }

    public static void shuffleArray(List<Integer> numbers) {
        Collections.shuffle(numbers);

    }


    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == newGame) {

            Collections.shuffle(numbers);
            b1.setText(String.valueOf(numbers.get(0)));
            b2.setText(String.valueOf(numbers.get(1)));
            b3.setText(String.valueOf(numbers.get(2)));
            b4.setText(String.valueOf(numbers.get(3)));
            b5.setText(String.valueOf(numbers.get(4)));
            b6.setText(String.valueOf(numbers.get(5)));
            b7.setText(String.valueOf(numbers.get(6)));
            b8.setText(String.valueOf(numbers.get(7)));
            b9.setText(String.valueOf(numbers.get(8)));
            b10.setText(String.valueOf(numbers.get(9)));
            b11.setText(String.valueOf(numbers.get(10)));
            b12.setText(String.valueOf(numbers.get(11)));
            b13.setText(String.valueOf(numbers.get(12)));
            b14.setText(String.valueOf(numbers.get(13)));
            b15.setText(String.valueOf(numbers.get(14)));

            System.out.println(numbers);
             /*
            Skriver ut den slumpade ordningen på numren i arrayen "numbers"
            när man klickar på "New game" i spelet .
             */


        }

        if (e.getSource() == b1) {
            String contains = b1.getText();

            if (b2.getText().equals(" ")) {
                String contains2 = b2.getText();
                b1.setText(contains2);
                b2.setText(contains);

            } else if (b5.getText().equals(" ")) {
                String contains2 = b5.getText();
                b1.setText(contains2);
                b5.setText(contains);


            } else if (b6.getText().equals(" ")) {
                String contains2 = b6.getText();
                b1.setText(contains2);
                b6.setText(contains);

            }

        }


        if (e.getSource() == b2) {
            String contains = b2.getText();

            if (b1.getText().equals(" ")) {
                String contains2 = b1.getText();
                b2.setText(contains2);
                b1.setText(contains);

            } else if (b6.getText().equals(" ")) {
                String contains2 = b6.getText();
                b2.setText(contains2);
                b6.setText(contains);


            } else if (b3.getText().equals(" ")) {
                String contains2 = b3.getText();
                b2.setText(contains2);
                b3.setText(contains);

            }

        }


        if (e.getSource() == b3) {
            String contains = b3.getText();

            if (b2.getText().equals(" ")) {
                String contains2 = b2.getText();
                b3.setText(contains2);
                b2.setText(contains);

            } else if (b4.getText().equals(" ")) {
                String contains2 = b4.getText();
                b3.setText(contains2);
                b4.setText(contains);


            } else if (b7.getText().equals(" ")) {
                String contains2 = b7.getText();
                b3.setText(contains2);
                b7.setText(contains);

            }

        }


        if (e.getSource() == b4) {
            String contains = b4.getText();


            if (b3.getText().equals(" ")) {
                String contains2 = b3.getText();
                b4.setText(contains2);
                b3.setText(contains);

            } else if (b8.getText().equals(" ")) {
                String contains2 = b8.getText();
                b4.setText(contains2);
                b8.setText(contains);

            }

        }

        if (e.getSource() == b5) {
            String contains = b5.getText();

            if (b1.getText().equals(" ")) {
                String contains2 = b1.getText();
                b5.setText(contains2);
                b1.setText(contains);


            } else if (b6.getText().equals(" ")) {
                String contains2 = b6.getText();
                b5.setText(contains2);
                b6.setText(contains);


            } else if (b9.getText().equals(" ")) {
                String contains2 = b9.getText();
                b5.setText(contains2);
                b9.setText(contains);

            }

        }


        if (e.getSource() == b6) {
            String contains = b6.getText();

            if (b2.getText().equals(" ")) {
                String contains2 = b2.getText();
                b6.setText(contains2);
                b2.setText(contains);

            } else if (b5.getText().equals(" ")) {
                String contains2 = b5.getText();
                b6.setText(contains2);
                b5.setText(contains);


            } else if (b7.getText().equals(" ")) {
                String contains2 = b7.getText();
                b6.setText(contains2);
                b7.setText(contains);

            } else if (b10.getText().equals(" ")) {
                String contains2 = b10.getText();
                b6.setText(contains2);
                b10.setText(contains);

            }

        }

        if (e.getSource() == b7) {
            String contains = b7.getText();

            if (b3.getText().equals(" ")) {
                String contains2 = b3.getText();
                b7.setText(contains2);
                b3.setText(contains);

            } else if (b6.getText().equals(" ")) {
                String contains2 = b6.getText();
                b7.setText(contains2);
                b6.setText(contains);


            } else if (b8.getText().equals(" ")) {
                String contains2 = b8.getText();
                b7.setText(contains2);
                b8.setText(contains);

            } else if (b11.getText().equals(" ")) {
                String contains2 = b11.getText();
                b7.setText(contains2);
                b11.setText(contains);

            }

        }


        if (e.getSource() == b8) {
            String contains = b8.getText();

            if (b4.getText().equals(" ")) {
                String contains2 = b4.getText();
                b8.setText(contains2);
                b4.setText(contains);

            } else if (b7.getText().equals(" ")) {
                String contains2 = b7.getText();
                b8.setText(contains2);
                b7.setText(contains);


            } else if (b12.getText().equals(" ")) {
                String contains2 = b12.getText();
                b8.setText(contains2);
                b12.setText(contains);

            }
        }


        if (e.getSource() == b9) {
            String contains = b9.getText();

            if (b5.getText().equals(" ")) {
                String contains2 = b5.getText();
                b9.setText(contains2);
                b5.setText(contains);

            } else if (b10.getText().equals(" ")) {
                String contains2 = b10.getText();
                b9.setText(contains2);
                b10.setText(contains);


            } else if (b13.getText().equals(" ")) {
                String contains2 = b13.getText();
                b9.setText(contains2);
                b13.setText(contains);

            }
        }

        if (e.getSource() == b10) {
            String contains = b10.getText();

            if (b6.getText().equals(" ")) {
                String contains2 = b6.getText();
                b10.setText(contains2);
                b6.setText(contains);

            } else if (b9.getText().equals(" ")) {
                String contains2 = b9.getText();
                b10.setText(contains2);
                b9.setText(contains);


            } else if (b11.getText().equals(" ")) {
                String contains2 = b11.getText();
                b10.setText(contains2);
                b11.setText(contains);

            } else if (b14.getText().equals(" ")) {
                String contains2 = b14.getText();
                b10.setText(contains2);
                b14.setText(contains);

            }

        }


        if (e.getSource() == b11) {
            String contains = b11.getText();

            if (b7.getText().equals(" ")) {
                String contains2 = b7.getText();
                b11.setText(contains2);
                b7.setText(contains);

            } else if (b10.getText().equals(" ")) {
                String contains2 = b10.getText();
                b11.setText(contains2);
                b10.setText(contains);


            } else if (b12.getText().equals(" ")) {
                String contains2 = b12.getText();
                b11.setText(contains2);
                b12.setText(contains);

            } else if (b15.getText().equals(" ")) {
                String contains2 = b15.getText();
                b11.setText(contains2);
                b15.setText(contains);

            }

        }
        if (e.getSource() == b12) {
            String contains = b12.getText();

            if (b16.getText().equals(" ")) {
                String contains2 = b16.getText();
                b12.setText(contains2);
                b16.setText(contains);


            } else if (b11.getText().equals(" ")) {
                String contains2 = b11.getText();
                b12.setText(contains2);
                b11.setText(contains);


            } else if (b8.getText().equals(" ")) {
                String contains2 = b8.getText();
                b12.setText(contains2);
                b8.setText(contains);

            }
        }

        if (e.getSource() == b13) {
            String contains = b13.getText();

            if (b9.getText().equals(" ")) {
                String contains2 = b9.getText();
                b13.setText(contains2);
                b9.setText(contains);

            } else if (b14.getText().equals(" ")) {
                String contains2 = b14.getText();
                b13.setText(contains2);
                b14.setText(contains);


            }

        }

        if (e.getSource() == b14) {
            String contains = b14.getText();

            if (b10.getText().equals(" ")) {
                String contains2 = b10.getText();
                b14.setText(contains2);
                b10.setText(contains);

            } else if (b13.getText().equals(" ")) {
                String contains2 = b13.getText();
                b14.setText(contains2);
                b13.setText(contains);

            } else if (b15.getText().equals(" ")) {
                String contains2 = b15.getText();
                b14.setText(contains2);
                b15.setText(contains);
            }


        }


        if (e.getSource() == b15) {
            String contains = b15.getText();

            if (b14.getText().equals(" ")) {
                String contains2 = b14.getText();
                b15.setText(contains2);
                b14.setText(contains);
            } else if (b11.getText().equals(" ")) {
                String contains2 = b11.getText();
                b15.setText(contains2);
                b11.setText(contains);
            } else if (b16.getText().equals(" ")) {
                String contains2 = b16.getText();
                b15.setText(contains2);
                b16.setText(contains);
            }

        }

        if (e.getSource() == b16) {
            String contains = b16.getText();
            if (b15.getText().equals(" ")) {
                String contains2 = b15.getText();
                b16.setText(contains2);
                b15.setText(contains);
            }
            if (b12.getText().equals(" ")) {
                String contains2 = b12.getText();
                b16.setText(contains2);
                b12.setText(contains);
            }
        }


    }


}

