import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.*;
import java.awt.TextArea;
import java.awt.SystemColor;

public class CinemaPOS extends JFrame {

	private JPanel contentPane;
	private JLabel lblFilms;
	private JButton btnLargeCoke;
	private JButton btnMediumCoke;
	private JButton btnMediumPopcorn;
	private JButton btnLargePopcorn;
	private JButton btnMediumFanta;
	private JButton btnLargeFanta;
	private JButton btnHotDog;
	private JButton btnNachos;
	private JButton btnConfirmOrder;
	private JTextField textDeadpoolSeats;
	private JTextField textLoganSeats;
	private JTextField textMoanaSeats;
	private JTextField textKongSeats;
	private JTextField textElysiumSeats;
	private JTextField textOblivionSeats;
	private JTextField textIronManSeats;
	private JTextField textLegoMovieSeats;
	private JTextField textAntManSeats;
	private JTextField textFrozenSeats;
	private JTextField totalCost;
	
	//Here we have some of the variables for the system mostly consisting of the seat numbers for the various films.
	int finalCost;
	int deadpoolSeats = 150;
	int loganSeats = 200;
	int moanaSeats = 100;
	int kongSeats = 150;
	int elysiumSeats = 100;
	int oblivionSeats = 100;
	int ironManSeats = 150;
	int legoMovieSeats = 100;
	int antManSeats = 200;
	int frozenSeats = 140;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CinemaPOS frame = new CinemaPOS();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CinemaPOS() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 958, 516);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);{}
		
		//Here we have the code which turns the variables seen above into strings for printing the text into various places.
		String deadpoolSeatTotal = String.valueOf(deadpoolSeats);
		String oblivionSeatTotal = String.valueOf(oblivionSeats);
		String ironManSeatTotal = String.valueOf(ironManSeats);
		String loganSeatTotal = String.valueOf(loganSeats);
		String moanaSeatTotal = String.valueOf(moanaSeats);
		String legoMovieSeatTotal = String.valueOf(legoMovieSeats);
		String antManSeatTotal = String.valueOf(antManSeats);
		String kongSeatTotal = String.valueOf(kongSeats);
		String elysiumSeatTotal = String.valueOf(elysiumSeats);
		String frozenSeatTotal = String.valueOf(frozenSeats);
		
		TextArea textReceipt = new TextArea();
		textReceipt.setBounds(0, 0, 730, 477);
		contentPane.add(textReceipt);
		textReceipt.setEditable(false);
		textReceipt.setVisible(false);
		
		JTextArea totalList = new JTextArea();
		totalList.setBounds(695, 11, 228, 321);
		contentPane.add(totalList);
		totalList.setEditable(false);
		
		JPanel panelMain = new JPanel();
		panelMain.setBounds(0, 0, 750, 477);
		contentPane.add(panelMain);
		panelMain.setLayout(null);
		
		JPanel panelFilms = new JPanel();
		panelFilms.setBounds(10, 11, 665, 250);
		panelMain.add(panelFilms);
		panelFilms.setLayout(null);
		
		//Below we have the buttons and their functions for the set of films to choose from
		JButton btnDeadpool = new JButton("Deadpool");
		btnDeadpool.setBounds(10, 32, 117, 25);
		panelFilms.add(btnDeadpool);
		btnDeadpool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//this bellow prints the film name and its cost to the total list box and is the same on all other film buttons.
				totalList.append("Deadool £5" + "\n");
				//this is for adding to the final cost variable which at the end will display the total cost of the purchase and is the same on all other film buttons.
				finalCost = finalCost + 5;
				//this section bellow is for changing the number of remaining seats when a ticket is purchased and is the same on all other film buttons.
				deadpoolSeats = deadpoolSeats - 1;
				String deadpoolSeatTotal = String.valueOf(deadpoolSeats);
				textDeadpoolSeats.setText(deadpoolSeatTotal);
				//this here is for setting the text for the total cost box and is the same on all other film buttons.
				String endTotal = String.valueOf(finalCost);
				totalCost.setText("£" + endTotal);
				//this displays a message on screen reminding the cashier to check if the person is of the correct age for the film and is the same on all other film buttons with varying ages.
				JOptionPane.showMessageDialog(null, "Is the customer aged 15 or above?");
			}
		});
		
		JButton btnOblivion = new JButton("Oblivion");
		btnOblivion.setBounds(10, 132, 117, 25);
		panelFilms.add(btnOblivion);
		btnOblivion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalList.append("Oblivion £3" + "\n");
				finalCost = finalCost + 3;
				oblivionSeats = oblivionSeats - 1;
				String oblivionSeatTotal = String.valueOf(oblivionSeats);
				textOblivionSeats.setText(oblivionSeatTotal);
				String endTotal = String.valueOf(finalCost);
				totalCost.setText("£" + endTotal);
				JOptionPane.showMessageDialog(null, "Is the customer aged 12 or above or are they accompanied by an adult?");
			}
		});
		
		JButton btnIronMan = new JButton("Iron Man");
		btnIronMan.setBounds(139, 132, 117, 25);
		panelFilms.add(btnIronMan);
		btnIronMan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalList.append("Iron Man £2" + "\n");
				finalCost = finalCost + 2;
				ironManSeats = ironManSeats - 1;
				String ironManSeatTotal = String.valueOf(ironManSeats);
				textIronManSeats.setText(ironManSeatTotal);
				String endTotal = String.valueOf(finalCost);
				totalCost.setText("£" + endTotal);
				JOptionPane.showMessageDialog(null, "Is the customer aged 12 or above or are they accompanied by an adult?");
			}
		});
		
		JButton btnLogan = new JButton("Logan");
		btnLogan.setBounds(139, 32, 117, 25);
		panelFilms.add(btnLogan);
		btnLogan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalList.append("Logan £7" + "\n");
				finalCost = finalCost + 7;
				loganSeats = loganSeats - 1;
				String loganSeatTotal = String.valueOf(loganSeats);
				textLoganSeats.setText(loganSeatTotal);
				String endTotal = String.valueOf(finalCost);
				totalCost.setText("£" + endTotal);
				JOptionPane.showMessageDialog(null, "Is the customer aged 18 or above?");
			}
		});
		
		JButton btnMoana = new JButton("Moana");
		btnMoana.setBounds(268, 32, 117, 25);
		panelFilms.add(btnMoana);
		btnMoana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalList.append("Moana £7" + "\n");
				finalCost = finalCost + 7;
				moanaSeats = moanaSeats - 1;
				String moanaSeatTotal = String.valueOf(moanaSeats);
				textMoanaSeats.setText(moanaSeatTotal);
				String endTotal = String.valueOf(finalCost);
				totalCost.setText("£" + endTotal);
			}
		});
		
		JButton btnLegoMovie = new JButton("Lego Movie");
		btnLegoMovie.setBounds(268, 132, 117, 25);
		panelFilms.add(btnLegoMovie);
		btnLegoMovie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalList.append("Lego Movie £5" + "\n");
				finalCost = finalCost + 5;
				legoMovieSeats = legoMovieSeats - 1;
				String legoMovieSeatTotal = String.valueOf(legoMovieSeats);
				textLegoMovieSeats.setText(legoMovieSeatTotal);
				String endTotal = String.valueOf(finalCost);
				totalCost.setText("£" + endTotal);
			}
		});
		
		JButton btnAntMan = new JButton("Ant Man");
		btnAntMan.setBounds(397, 132, 117, 25);
		panelFilms.add(btnAntMan);
		btnAntMan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalList.append("Ant Man £5" + "\n");
				finalCost = finalCost + 5;
				antManSeats = antManSeats - 1;
				String antManSeatTotal = String.valueOf(antManSeats);
				textAntManSeats.setText(antManSeatTotal);
				String endTotal = String.valueOf(finalCost);
				totalCost.setText("£" + endTotal);
				JOptionPane.showMessageDialog(null, "Is the customer aged 12 or above or are they accompanied by an adult?");
			}
		});
		
		JButton btnKong = new JButton("Kong");
		btnKong.setBounds(397, 32, 117, 25);
		panelFilms.add(btnKong);
		btnKong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalList.append("Kong £7" + "\n");
				finalCost = finalCost + 7;
				kongSeats = kongSeats - 1;
				String kongSeatTotal = String.valueOf(kongSeats);
				textKongSeats.setText(kongSeatTotal);
				String endTotal = String.valueOf(finalCost);
				totalCost.setText("£" + endTotal);
				JOptionPane.showMessageDialog(null, "Is the customer aged 12 or above or are they accompanied by an adult?");
			}
		});
		
		JButton btnElysium = new JButton("Elysium");
		btnElysium.setBounds(526, 32, 117, 25);
		panelFilms.add(btnElysium);
		btnElysium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalList.append("Elysium £3" + "\n");
				finalCost = finalCost + 3;
				elysiumSeats = elysiumSeats - 1;
				String elysiumSeatTotal = String.valueOf(elysiumSeats);
				textElysiumSeats.setText(elysiumSeatTotal);
				String endTotal = String.valueOf(finalCost);
				totalCost.setText("£" + endTotal);
				JOptionPane.showMessageDialog(null, "Is the customer aged 15 or above?");
			}
		});
		
		JButton btnFrozen = new JButton("Frozen");
		btnFrozen.setBounds(526, 132, 117, 25);
		panelFilms.add(btnFrozen);
		btnFrozen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalList.append("Frozen £4" + "\n");
				finalCost = finalCost + 4;
				frozenSeats = frozenSeats - 1;
				String frozenSeatTotal = String.valueOf(frozenSeats);
				textFrozenSeats.setText(frozenSeatTotal);
				String endTotal = String.valueOf(finalCost);
				totalCost.setText("£" + endTotal);
			}
		});
		
		//below is the code for creating the various text boxes and labels for the different sections of the system.
		
		textDeadpoolSeats = new JTextField();
		textDeadpoolSeats.setBounds(23, 105, 86, 20);
		panelFilms.add(textDeadpoolSeats);
		textDeadpoolSeats.setHorizontalAlignment(SwingConstants.CENTER);
		textDeadpoolSeats.setBackground(Color.WHITE);
		textDeadpoolSeats.setEditable(false);
		textDeadpoolSeats.setColumns(10);
		textDeadpoolSeats.setText(deadpoolSeatTotal);
		
		textOblivionSeats = new JTextField();
		textOblivionSeats.setBounds(29, 215, 86, 20);
		panelFilms.add(textOblivionSeats);
		textOblivionSeats.setHorizontalAlignment(SwingConstants.CENTER);
		textOblivionSeats.setEditable(false);
		textOblivionSeats.setColumns(10);
		textOblivionSeats.setBackground(Color.WHITE);
		textOblivionSeats.setText(oblivionSeatTotal);
		
		textIronManSeats = new JTextField();
		textIronManSeats.setBounds(160, 215, 86, 20);
		panelFilms.add(textIronManSeats);
		textIronManSeats.setHorizontalAlignment(SwingConstants.CENTER);
		textIronManSeats.setEditable(false);
		textIronManSeats.setColumns(10);
		textIronManSeats.setBackground(Color.WHITE);
		textIronManSeats.setText(ironManSeatTotal);
		
		textLoganSeats = new JTextField();
		textLoganSeats.setBounds(158, 105, 86, 20);
		panelFilms.add(textLoganSeats);
		textLoganSeats.setHorizontalAlignment(SwingConstants.CENTER);
		textLoganSeats.setEditable(false);
		textLoganSeats.setColumns(10);
		textLoganSeats.setBackground(Color.WHITE);
		textLoganSeats.setText(loganSeatTotal);
		
		textMoanaSeats = new JTextField();
		textMoanaSeats.setBounds(284, 105, 86, 20);
		panelFilms.add(textMoanaSeats);
		textMoanaSeats.setHorizontalAlignment(SwingConstants.CENTER);
		textMoanaSeats.setEditable(false);
		textMoanaSeats.setColumns(10);
		textMoanaSeats.setBackground(Color.WHITE);
		textMoanaSeats.setText(moanaSeatTotal);
		
		textLegoMovieSeats = new JTextField();
		textLegoMovieSeats.setBounds(284, 215, 86, 20);
		panelFilms.add(textLegoMovieSeats);
		textLegoMovieSeats.setHorizontalAlignment(SwingConstants.CENTER);
		textLegoMovieSeats.setEditable(false);
		textLegoMovieSeats.setColumns(10);
		textLegoMovieSeats.setBackground(Color.WHITE);
		textLegoMovieSeats.setText(legoMovieSeatTotal);
		
		textAntManSeats = new JTextField();
		textAntManSeats.setBounds(410, 215, 86, 20);
		panelFilms.add(textAntManSeats);
		textAntManSeats.setHorizontalAlignment(SwingConstants.CENTER);
		textAntManSeats.setEditable(false);
		textAntManSeats.setColumns(10);
		textAntManSeats.setBackground(Color.WHITE);
		textAntManSeats.setText(antManSeatTotal);
		
		textKongSeats = new JTextField();
		textKongSeats.setBounds(413, 105, 86, 20);
		panelFilms.add(textKongSeats);
		textKongSeats.setHorizontalAlignment(SwingConstants.CENTER);
		textKongSeats.setEditable(false);
		textKongSeats.setColumns(10);
		textKongSeats.setBackground(Color.WHITE);
		textKongSeats.setText(kongSeatTotal);
		
		textElysiumSeats = new JTextField();
		textElysiumSeats.setBounds(549, 105, 86, 20);
		panelFilms.add(textElysiumSeats);
		textElysiumSeats.setHorizontalAlignment(SwingConstants.CENTER);
		textElysiumSeats.setEditable(false);
		textElysiumSeats.setColumns(10);
		textElysiumSeats.setBackground(Color.WHITE);
		textElysiumSeats.setText(elysiumSeatTotal);
		
		textFrozenSeats = new JTextField();
		textFrozenSeats.setBounds(542, 215, 86, 20);
		panelFilms.add(textFrozenSeats);
		textFrozenSeats.setHorizontalAlignment(SwingConstants.CENTER);
		textFrozenSeats.setEditable(false);
		textFrozenSeats.setColumns(10);
		textFrozenSeats.setBackground(Color.WHITE);
		textFrozenSeats.setText(frozenSeatTotal);
		
		JLabel lblPrice1 = new JLabel("Price: \u00A35");
		lblPrice1.setBounds(39, 58, 70, 15);
		panelFilms.add(lblPrice1);
		
		JLabel lblAge1 = new JLabel("Age: 15");
		lblAge1.setBounds(39, 75, 48, 15);
		panelFilms.add(lblAge1);
		
		JLabel lblSeatsRemaining2 = new JLabel("Seats Remaining");
		lblSeatsRemaining2.setBounds(27, 91, 89, 14);
		panelFilms.add(lblSeatsRemaining2);
		
		JLabel lblPrice6 = new JLabel("Price: \u00A33");
		lblPrice6.setBounds(48, 157, 61, 15);
		panelFilms.add(lblPrice6);
		
		JLabel lblAge6 = new JLabel("Age: 12A");
		lblAge6.setBounds(48, 177, 61, 15);
		panelFilms.add(lblAge6);
		
		JLabel lblSeatsRemaining1 = new JLabel("Seats Remaining");
		lblSeatsRemaining1.setBounds(32, 198, 88, 14);
		panelFilms.add(lblSeatsRemaining1);
		
		JLabel lblSeatsRemaining7 = new JLabel("Seats Remaining");
		lblSeatsRemaining7.setBounds(165, 198, 91, 14);
		panelFilms.add(lblSeatsRemaining7);
		
		JLabel lblAge7 = new JLabel("Age: 12A");
		lblAge7.setBounds(174, 177, 70, 15);
		panelFilms.add(lblAge7);
		
		JLabel lblPrice7 = new JLabel("Price: \u00A32");
		lblPrice7.setBounds(175, 157, 69, 15);
		panelFilms.add(lblPrice7);
		
		JLabel lblSeatsRemaining3 = new JLabel("Seats Remaining");
		lblSeatsRemaining3.setBounds(161, 91, 95, 14);
		panelFilms.add(lblSeatsRemaining3);
		
		JLabel lblPrice2 = new JLabel("Price: \u00A37");
		lblPrice2.setBounds(174, 58, 70, 15);
		panelFilms.add(lblPrice2);
		
		JLabel lblAge2 = new JLabel("Age: 18");
		lblAge2.setBounds(175, 75, 48, 15);
		panelFilms.add(lblAge2);
		
		JLabel lblPrice3 = new JLabel("Price: \u00A37");
		lblPrice3.setBounds(303, 58, 70, 15);
		panelFilms.add(lblPrice3);
		
		JLabel lblSeatsRemaining4 = new JLabel("Seats Remaining");
		lblSeatsRemaining4.setBounds(284, 91, 89, 14);
		panelFilms.add(lblSeatsRemaining4);
		
		JLabel lblAge3 = new JLabel("Age: PG");
		lblAge3.setBounds(303, 75, 48, 15);
		panelFilms.add(lblAge3);
		
		JLabel lblPrice8 = new JLabel("Price: \u00A35");
		lblPrice8.setBounds(303, 157, 60, 15);
		panelFilms.add(lblPrice8);
		
		JLabel lblAge8 = new JLabel("Age: U");
		lblAge8.setBounds(303, 177, 48, 15);
		panelFilms.add(lblAge8);
		
		JLabel lblSeatsRemaining8 = new JLabel("Seats Remaining");
		lblSeatsRemaining8.setBounds(284, 198, 89, 14);
		panelFilms.add(lblSeatsRemaining8);
		
		JLabel lblSeatsRemaining9 = new JLabel("Seats Remaining");
		lblSeatsRemaining9.setBounds(413, 198, 95, 14);
		panelFilms.add(lblSeatsRemaining9);
		
		JLabel lblAge9 = new JLabel("Age: 12A");
		lblAge9.setBounds(429, 177, 70, 15);
		panelFilms.add(lblAge9);
		
		JLabel lblPrice9 = new JLabel("Price: \u00A35");
		lblPrice9.setBounds(429, 157, 60, 15);
		panelFilms.add(lblPrice9);
		
		JLabel lblSeatsRemaining5 = new JLabel("Seats Remaining");
		lblSeatsRemaining5.setBounds(416, 91, 104, 14);
		panelFilms.add(lblSeatsRemaining5);
		
		JLabel lblAge4 = new JLabel("Age: 12A");
		lblAge4.setBounds(429, 75, 60, 15);
		panelFilms.add(lblAge4);
		
		JLabel lblPrice4 = new JLabel("Price: \u00A37");
		lblPrice4.setBounds(429, 58, 70, 15);
		panelFilms.add(lblPrice4);
		
		JLabel lblPrice5 = new JLabel("Price: \u00A33");
		lblPrice5.setBounds(568, 58, 60, 15);
		panelFilms.add(lblPrice5);
		
		JLabel lblAge5 = new JLabel("Age: 15");
		lblAge5.setBounds(568, 75, 48, 15);
		panelFilms.add(lblAge5);
		
		JLabel lblSeatsRemaining6 = new JLabel("Seats Remaining");
		lblSeatsRemaining6.setBounds(551, 91, 94, 14);
		panelFilms.add(lblSeatsRemaining6);
		
		JLabel lblAge10 = new JLabel("Age: PG");
		lblAge10.setBounds(558, 177, 48, 15);
		panelFilms.add(lblAge10);
		
		JLabel lblPrice10 = new JLabel("Price: \u00A34");
		lblPrice10.setBounds(558, 157, 58, 15);
		panelFilms.add(lblPrice10);
		
		JLabel lblSeatsRemaining10 = new JLabel("Seats Remaining");
		lblSeatsRemaining10.setBounds(545, 198, 91, 14);
		panelFilms.add(lblSeatsRemaining10);
		
		lblFilms = new JLabel("Films");
		lblFilms.setBounds(303, 11, 60, 14);
		panelFilms.add(lblFilms);
		lblFilms.setFont(new Font("Calibri", Font.PLAIN, 16));
		
		JPanel panelSnacks = new JPanel();
		panelSnacks.setBounds(64, 271, 585, 182);
		panelMain.add(panelSnacks);
		panelSnacks.setLayout(null);
		
		JLabel lblSnacks = new JLabel("Snacks");
		lblSnacks.setBounds(254, 0, 60, 14);
		panelSnacks.add(lblSnacks);
		lblSnacks.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		btnMediumCoke = new JButton("Medium Coke");
		btnMediumCoke.setBounds(25, 22, 121, 46);
		panelSnacks.add(btnMediumCoke);
		
		JLabel lblSnackPrice1 = new JLabel("Price: \u00A32");
		lblSnackPrice1.setBounds(56, 79, 61, 15);
		panelSnacks.add(lblSnackPrice1);
		
		btnLargeCoke = new JButton("Large Coke");
		btnLargeCoke.setBounds(25, 103, 121, 46);
		panelSnacks.add(btnLargeCoke);
		
		JLabel lblSnackPrice5 = new JLabel("Price: \u00A33");
		lblSnackPrice5.setBounds(56, 160, 61, 15);
		panelSnacks.add(lblSnackPrice5);
		
		JLabel lblSnackPrice6 = new JLabel("Price: \u00A33");
		lblSnackPrice6.setBounds(190, 160, 61, 15);
		panelSnacks.add(lblSnackPrice6);
		
		btnLargeFanta = new JButton("Large Fanta");
		btnLargeFanta.setBounds(156, 103, 121, 46);
		panelSnacks.add(btnLargeFanta);
		
		JLabel lblSnackPrice2 = new JLabel("Price: \u00A32");
		lblSnackPrice2.setBounds(190, 79, 61, 15);
		panelSnacks.add(lblSnackPrice2);
		
		btnMediumFanta = new JButton("Medium Fanta");
		btnMediumFanta.setBounds(156, 22, 121, 46);
		panelSnacks.add(btnMediumFanta);
		
		btnMediumPopcorn = new JButton("Medium Popcorn");
		btnMediumPopcorn.setBounds(289, 22, 121, 46);
		panelSnacks.add(btnMediumPopcorn);
		
		JLabel lblSnackPrice3 = new JLabel("Price: \u00A32");
		lblSnackPrice3.setBounds(322, 79, 61, 15);
		panelSnacks.add(lblSnackPrice3);
		
		btnLargePopcorn = new JButton("Large Popcorn");
		btnLargePopcorn.setBounds(289, 103, 121, 46);
		panelSnacks.add(btnLargePopcorn);
		
		JLabel lblSnackPrice7 = new JLabel("Price: \u00A33");
		lblSnackPrice7.setBounds(322, 160, 61, 15);
		panelSnacks.add(lblSnackPrice7);
		
		JLabel lblSnackPrice8 = new JLabel("Price: \u00A32");
		lblSnackPrice8.setBounds(455, 160, 61, 15);
		panelSnacks.add(lblSnackPrice8);
		
		btnNachos = new JButton("Nachos");
		btnNachos.setBounds(420, 103, 121, 46);
		panelSnacks.add(btnNachos);
		
		JLabel lblSnackPrice4 = new JLabel("Price: \u00A33");
		lblSnackPrice4.setBounds(455, 79, 61, 15);
		panelSnacks.add(lblSnackPrice4);
		
		btnHotDog = new JButton("Hot Dog");
		btnHotDog.setBounds(420, 22, 121, 46);
		panelSnacks.add(btnHotDog);
		
		JPanel panelTotalCost = new JPanel();
		panelTotalCost.setBounds(693, 353, 228, 47);
		contentPane.add(panelTotalCost);
		panelTotalCost.setLayout(null);
		
		//this button here is the button that appears with the receipt and when pressed resets the system to allow it to make its next sale. 
		JButton btnCompletedPayment = new JButton("Completed Payment");
		btnCompletedPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//this clears the text from the receipt when it is closed.
				textReceipt.setText(null);
				//this sets the main panel visible again to continue with sales.
				panelMain.setVisible(true);
				panelTotalCost.setVisible(true);
				textReceipt.setVisible(false);
				totalList.setVisible(true);
				btnCompletedPayment.setVisible(false);
			}
		});
		
		
		
		JLabel lblTotalCost = new JLabel("Total Cost:");
		lblTotalCost.setBounds(27, 18, 70, 15);
		panelTotalCost.add(lblTotalCost);
		lblTotalCost.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTotalCost.setBackground(Color.WHITE);
		lblTotalCost.setForeground(Color.BLACK);
		
		totalCost = new JTextField();
		totalCost.setBounds(107, 16, 111, 20);
		panelTotalCost.add(totalCost);
		totalCost.setEditable(false);
		totalCost.setColumns(10);
		totalCost.setBackground(Color.WHITE);
		btnCompletedPayment.setBounds(760, 410, 157, 55);
		contentPane.add(btnCompletedPayment);
		
		//this button is for completing the order allowing and adds up everything and shows it on the final receipt.
		btnConfirmOrder = new JButton("Confirm Order");
		btnConfirmOrder.setBounds(760, 410, 121, 46);
		contentPane.add(btnConfirmOrder);
		btnConfirmOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textReceipt.setVisible(true);
				//this here sets the main panel to be invisible so that the receipt can be viewed.
				panelMain.setVisible(false);
				panelTotalCost.setVisible(false);
				totalList.setVisible(false);
				btnCompletedPayment.setVisible(true);
				String textFinalReceiptList = totalList.getText();
				String textFinalCost = totalCost.getText();
				//this section below is what will be printed out onto the receipt.
				textReceipt.appendText("=============================================" + "\n");
				textReceipt.appendText("Final Receipt For Customer Purchase" + "\n");
				textReceipt.appendText("=============================================" + "\n" + "\n");
				textReceipt.appendText(textFinalReceiptList + "\n" + "\n");
				textReceipt.appendText("=============================================" + "\n" + "\n");
				textReceipt.appendText("Total: " + textFinalCost + "\n" + "\n");
				textReceipt.appendText("=============================================");
				totalList.setText(null);
				totalCost.setText("");
				
			}
		});
		btnConfirmOrder.setForeground(Color.BLACK);
		btnConfirmOrder.setBackground(Color.WHITE);
		btnCompletedPayment.setVisible(false);
		
		//below we have all of the buttons for purchasing snacks.
		btnHotDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//this prints the snack name and price to the item list and is the same on all other snack buttons.
				totalList.append("Hot Dog £3" + "\n");
				//this adds the amount of the snack to the final cost and is the same on all other snack buttons. 
				finalCost = finalCost + 3;
				//this is turning the final cost into a string so it can be displayed on the total cost and is the same on all other snack buttons.
				String endTotal = String.valueOf(finalCost);
				totalCost.setText("£" + endTotal);
			}
		});
		btnNachos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalList.append("Nachos £2" + "\n");
				finalCost = finalCost + 2;
				String endTotal = String.valueOf(finalCost);
				totalCost.setText("£" + endTotal);
			}
		});
		btnLargePopcorn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalList.append("Large Popcorn £3" + "\n");
				finalCost = finalCost + 3;
				String endTotal = String.valueOf(finalCost);
				totalCost.setText("£" + endTotal);
			}
		});
		btnMediumPopcorn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalList.append("Medium Popcorn £2" + "\n");
				finalCost = finalCost + 2;
				String endTotal = String.valueOf(finalCost);
				totalCost.setText("£" + endTotal);
			}
		});
		btnMediumFanta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				totalList.append("MediumFanta £2" + "\n");
				finalCost = finalCost + 2;
				String endTotal = String.valueOf(finalCost);
				totalCost.setText("£" + endTotal);
					}
		});
		btnLargeFanta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalList.append("Large Fanta £3" + "\n");
				finalCost = finalCost + 3;
				String endTotal = String.valueOf(finalCost);
				totalCost.setText("£" + endTotal);
			}
		});
		btnLargeCoke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalList.append("Large Coke £3" + "\n");
				finalCost = finalCost + 3;
				String endTotal = String.valueOf(finalCost);
				totalCost.setText("£" + endTotal);
			}
		});
		btnMediumCoke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalList.append("Medium Coke £2" + "\n");
				finalCost = finalCost + 2;
				String endTotal = String.valueOf(finalCost);
				totalCost.setText("£" + endTotal);
			}
		});
		
		
			
	}
}
