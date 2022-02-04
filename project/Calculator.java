import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import java.awt.Cursor;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField Display;

	double firstnum, secondnum, result;
	String operations, answer, Store;
	private JTextField SmallDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator\r\n");
		frmCalculator.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frmCalculator.setBounds(100, 100, 367, 558);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);

		Display = new JTextField();
		Display.setBorder(new EmptyBorder(0, 0, 0, 0));
		Display.setBackground(SystemColor.inactiveCaptionBorder);
		Display.setHorizontalAlignment(SwingConstants.RIGHT);
		Display.setFont(new Font("Times New Roman", Font.PLAIN, 44));
		Display.setBounds(0, 39, 350, 84);
		frmCalculator.getContentPane().add(Display);
		Display.setColumns(10);

		JButton btn7 = new JButton("7");
		btn7.setBorder(new LineBorder(new Color(227, 227, 227), 3));
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn7.setBackground(SystemColor.scrollbar);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn7.setBackground(SystemColor.control);
			}
		});
		btn7.setBackground(SystemColor.control);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = Display.getText() + btn7.getText();
				Display.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn7.setBounds(0, 201, 70, 80);
		frmCalculator.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.setBorder(new LineBorder(new Color(227, 227, 227), 2));
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn8.setBackground(SystemColor.scrollbar);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn8.setBackground(SystemColor.control);
			}
		});
		btn8.setBackground(SystemColor.control);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Display.getText() + btn8.getText();
				Display.setText(EnterNumber);

			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn8.setBounds(70, 201, 70, 80);
		frmCalculator.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn9.setBackground(SystemColor.scrollbar);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn9.setBackground(SystemColor.control);
			}
		});
		btn9.setBorder(new LineBorder(SystemColor.controlHighlight, 3));
		btn9.setBackground(SystemColor.control);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Display.getText() + btn9.getText();
				Display.setText(EnterNumber);

			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn9.setBounds(140, 201, 70, 80);
		frmCalculator.getContentPane().add(btn9);

		JButton btn4 = new JButton("4");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn4.setBackground(SystemColor.scrollbar);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn4.setBackground(SystemColor.control);
			}
		});
		btn4.setBorder(new LineBorder(SystemColor.controlHighlight, 2));
		btn4.setBackground(SystemColor.control);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Display.getText() + btn4.getText();
				Display.setText(EnterNumber);

			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn4.setBounds(0, 281, 70, 80);
		frmCalculator.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn5.setBackground(SystemColor.scrollbar);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn5.setBackground(SystemColor.control);
			}
		});
		btn5.setBorder(new LineBorder(SystemColor.controlHighlight, 3));
		btn5.setBackground(SystemColor.control);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Display.getText() + btn5.getText();
				Display.setText(EnterNumber);

			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn5.setBounds(70, 281, 70, 80);
		frmCalculator.getContentPane().add(btn5);

		JButton btn1 = new JButton("1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn1.setBackground(SystemColor.scrollbar);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn1.setBackground(SystemColor.control);
			}
		});
		btn1.setBorder(new LineBorder(SystemColor.controlHighlight, 3));
		btn1.setBackground(SystemColor.control);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Display.getText() + btn1.getText();
				Display.setText(EnterNumber);

			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn1.setBounds(0, 361, 70, 80);
		frmCalculator.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn2.setBackground(SystemColor.scrollbar);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn2.setBackground(SystemColor.control);
			}
		});
		btn2.setBorder(new LineBorder(SystemColor.controlHighlight, 2));
		btn2.setBackground(SystemColor.control);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Display.getText() + btn2.getText();
				Display.setText(EnterNumber);

			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn2.setBounds(70, 361, 70, 80);
		frmCalculator.getContentPane().add(btn2);

		JButton btn6 = new JButton("6");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn6.setBackground(SystemColor.scrollbar);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn6.setBackground(SystemColor.control);
			}
		});
		btn6.setBorder(new LineBorder(SystemColor.controlHighlight, 2));
		btn6.setBackground(SystemColor.control);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Display.getText() + btn6.getText();
				Display.setText(EnterNumber);

			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn6.setBounds(140, 281, 70, 80);
		frmCalculator.getContentPane().add(btn6);

		JButton btn3 = new JButton("3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn3.setBackground(SystemColor.scrollbar);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn3.setBackground(SystemColor.control);
			}
		});
		btn3.setBorder(new LineBorder(SystemColor.controlHighlight, 3));
		btn3.setBackground(SystemColor.control);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Display.getText() + btn3.getText();
				Display.setText(EnterNumber);

			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn3.setBounds(140, 361, 70, 80);
		frmCalculator.getContentPane().add(btn3);

		JButton btn0 = new JButton("0");
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn0.setBackground(SystemColor.scrollbar);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn0.setBackground(SystemColor.control);
			}
		});
		btn0.setBorder(new LineBorder(SystemColor.controlHighlight, 3));
		btn0.setBackground(SystemColor.control);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Display.getText() + btn0.getText();
				Display.setText(EnterNumber);

			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn0.setBounds(0, 441, 140, 80);
		frmCalculator.getContentPane().add(btn0);

		JButton btnC = new JButton("C");
		btnC.setToolTipText("Clear Dsiplay");
		btnC.setBorder(null);
		btnC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnC.setBackground(new Color(0, 51, 102));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnC.setBackground(new Color(70, 130, 180));
			}
		});
		btnC.setForeground(Color.WHITE);
		btnC.setBackground(new Color(70, 130, 180));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Display.setText(null);
				SmallDisplay.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnC.setBounds(280, 201, 70, 80);
		frmCalculator.getContentPane().add(btnC);

		JButton btnPlus = new JButton("+");
		btnPlus.setBorder(new LineBorder(SystemColor.controlHighlight, 2));
		btnPlus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnPlus.setBackground(SystemColor.controlShadow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnPlus.setBackground(SystemColor.controlHighlight);
			}
		});
		btnPlus.setBackground(SystemColor.controlHighlight);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstnum = Double.parseDouble(Display.getText());

				SmallDisplay.setText(Display.getText() + "+");
				Display.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 27));
		btnPlus.setBounds(280, 281, 70, 160);
		frmCalculator.getContentPane().add(btnPlus);

		JButton btnMinus = new JButton("-");
		btnMinus.setBorder(new LineBorder(SystemColor.controlHighlight, 2));
		btnMinus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnMinus.setBackground(SystemColor.controlShadow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnMinus.setBackground(SystemColor.controlHighlight);
			}
		});
		btnMinus.setBackground(SystemColor.controlHighlight);
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(Display.getText());
				SmallDisplay.setText(Display.getText() + "-");
				Display.setText("");
				operations = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnMinus.setBounds(210, 201, 70, 80);
		frmCalculator.getContentPane().add(btnMinus);

		JButton btnMultiply = new JButton("X");
		btnMultiply.setBorder(new LineBorder(SystemColor.controlHighlight, 2));
		btnMultiply.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnMultiply.setBackground(SystemColor.controlShadow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnMultiply.setBackground(SystemColor.controlHighlight);
			}
		});
		btnMultiply.setBackground(SystemColor.controlHighlight);
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(Display.getText());
				SmallDisplay.setText(Display.getText() + "X");
				Display.setText("");
				operations = "X";
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMultiply.setBounds(210, 361, 70, 80);
		frmCalculator.getContentPane().add(btnMultiply);

		JButton btnDivide = new JButton("/");
		btnDivide.setBorder(new LineBorder(SystemColor.controlHighlight, 2));
		btnDivide.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnDivide.setBackground(SystemColor.controlShadow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnDivide.setBackground(SystemColor.controlHighlight);
			}
		});
		btnDivide.setBackground(SystemColor.controlHighlight);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(Display.getText());
				SmallDisplay.setText(Display.getText() + "/");
				Display.setText("");
				operations = "/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDivide.setBounds(210, 281, 70, 80);
		frmCalculator.getContentPane().add(btnDivide);

		JButton btnEqual = new JButton("=");
		btnEqual.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEqual.setBorder(null);
		btnEqual.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnEqual.setBackground(new Color(139, 0, 0));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnEqual.setBackground(new Color(205, 92, 92));
			}
		});
		btnEqual.setForeground(Color.WHITE);
		btnEqual.setBackground(new Color(205, 92, 92));
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				secondnum = Double.parseDouble(Display.getText());

				if (operations == "+") {
					secondnum = Double.parseDouble(Display.getText());
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					SmallDisplay.setText(SmallDisplay.getText() + Display.getText());
					Display.setText(answer);
					SmallDisplay.setText(null);

				} else if (operations == "-") {
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					SmallDisplay.setText(SmallDisplay.getText() + Display.getText());
					Display.setText(answer);
					SmallDisplay.setText(null);

				} else if (operations == "X") {
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					SmallDisplay.setText(SmallDisplay.getText() + Display.getText());
					Display.setText(answer);
					SmallDisplay.setText(null);
				} else if (operations == "/") {

					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					SmallDisplay.setText(SmallDisplay.getText() + Display.getText());
					Display.setText(answer);
					SmallDisplay.setText(null);
				}
				if (operations == "X^Y") {
					result = Math.pow(firstnum, secondnum);
					answer = String.format("%.2f", result);
					SmallDisplay.setText(SmallDisplay.getText() + Display.getText());
					Display.setText(answer);
					SmallDisplay.setText(null);
				}

			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnEqual.setBounds(280, 441, 70, 80);
		frmCalculator.getContentPane().add(btnEqual);

		JButton btnDot = new JButton(".");
		btnDot.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnDot.setBackground(SystemColor.scrollbar);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnDot.setBackground(SystemColor.control);
			}
		});
		btnDot.setBorder(new LineBorder(SystemColor.controlHighlight, 2));
		btnDot.setBackground(SystemColor.control);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!Display.getText().contains(".")) {
					Display.setText(Display.getText() + btnDot.getText());
				}

			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnDot.setBounds(140, 441, 70, 80);
		frmCalculator.getContentPane().add(btnDot);

		JButton btnPM = new JButton("\u00B1");
		btnPM.setBorder(null);
		btnPM.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnPM.setBackground(SystemColor.controlShadow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnPM.setBackground(SystemColor.controlHighlight);
			}
		});
		btnPM.setBackground(SystemColor.controlHighlight);
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(Display.getText()));
				ops = ops * (-1);
				Display.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPM.setBounds(210, 441, 70, 80);
		frmCalculator.getContentPane().add(btnPM);

		JButton btnPercent = new JButton("%");
		btnPercent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnPercent.setBackground(SystemColor.controlShadow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnPercent.setBackground(new Color(204, 204, 204));
			}
		});
		btnPercent.setBorder(null);
		btnPercent.setBackground(new Color(204, 204, 204));
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(Display.getText());
				firstnum = firstnum / 100;
				Store = String.format("%.2f", firstnum);
				Display.setText(Store);

			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPercent.setBounds(0, 121, 70, 80);
		frmCalculator.getContentPane().add(btnPercent);

		JButton btnBack = new JButton("\uF0E7");
		btnBack.setBorder(null);
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnBack.setBackground(new Color(0, 51, 102));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnBack.setBackground(new Color(70, 130, 180));
			}
		});
		btnBack.setToolTipText("Delete\r\n");
		btnBack.setForeground(Color.WHITE);
		btnBack.setBackground(new Color(70, 130, 180));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if (Display.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(Display.getText());
					strB.deleteCharAt(Display.getText().length() - 1);
					backspace = strB.toString();
					Display.setText(backspace);
				}
			}
		});
		btnBack.setFont(new Font("Wingdings", Font.BOLD, 19));
		btnBack.setBounds(280, 121, 70, 80);
		frmCalculator.getContentPane().add(btnBack);

		SmallDisplay = new JTextField();
		SmallDisplay.setBorder(new EmptyBorder(0, 0, 0, 0));
		SmallDisplay.setBackground(SystemColor.inactiveCaptionBorder);
		SmallDisplay.setFont(new Font("Tahoma", Font.PLAIN, 17));
		SmallDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		SmallDisplay.setBounds(0, 0, 350, 40);
		frmCalculator.getContentPane().add(SmallDisplay);
		SmallDisplay.setColumns(10);

		JButton btnRoot = new JButton("\u221A");
		btnRoot.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnRoot.setBackground(SystemColor.controlShadow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnRoot.setBackground(new Color(204, 204, 204));
			}
		});
		btnRoot.setBorder(null);
		btnRoot.setBackground(new Color(204, 204, 204));
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(Display.getText());
				firstnum = Math.sqrt(firstnum);
				Store = String.format("%.2f", firstnum);
				Display.setText(Store);

			}
		});
		btnRoot.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRoot.setBounds(70, 121, 70, 80);
		frmCalculator.getContentPane().add(btnRoot);

		JButton btnSquare = new JButton("X^2");
		btnSquare.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnSquare.setBackground(SystemColor.controlShadow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnSquare.setBackground(new Color(204, 204, 204));
			}
		});
		btnSquare.setBorder(null);
		btnSquare.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSquare.setBackground(new Color(204, 204, 204));
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(Display.getText());
				firstnum = (firstnum * firstnum);
				Store = String.format("%.2f", firstnum);
				Display.setText(Store);
			}
		});
		btnSquare.setBounds(140, 121, 70, 80);
		frmCalculator.getContentPane().add(btnSquare);

		JButton btnXpowY = new JButton("X^Y\r\n");
		btnXpowY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(Display.getText());
				SmallDisplay.setText(Display.getText() + "^");
				Display.setText("");
				operations = "X^Y";
			}
		});
		btnXpowY.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnXpowY.setBackground(SystemColor.controlShadow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnXpowY.setBackground(new Color(204, 204, 204));
			}
		});
		btnXpowY.setBorder(null);
		btnXpowY.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnXpowY.setBackground(new Color(204, 204, 204));
		btnXpowY.setBounds(210, 121, 70, 80);
		frmCalculator.getContentPane().add(btnXpowY);

	}
}

