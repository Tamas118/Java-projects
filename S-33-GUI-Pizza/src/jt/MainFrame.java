package jt;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class MainFrame extends JFrame {

	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new MainFrame();

	}

	public MainFrame() {
		setSize(500, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Fontos, mert ezzel zárodik be a program
		setLocationRelativeTo(null);
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		setTitle("guiApp");
		getContentPane().setLayout(new MigLayout("", "[][grow][][][grow][][grow][][][grow]", "[][][][][][][][][][][][][][]"));
		
		JLabel lblPizzaTomas = new JLabel("Pizza Tomas");
		getContentPane().add(lblPizzaTomas, "cell 5 1,alignx left");
		
		JLabel lblLogo = new JLabel(new ImageIcon("./kepek/pizza.png"));
		getContentPane().add(lblLogo, "cell 1 4 9 1,alignx center");
		
		JLabel lblMeret = new JLabel(new ImageIcon("./kepek/meret.png"));
		getContentPane().add(lblMeret, "cell 0 7");
		
		JLabel lblNewLabel = new JLabel("Méret");
		getContentPane().add(lblNewLabel, "cell 1 7");
		
		JLabel lblTeszta = new JLabel(new ImageIcon("./kepek/teszta.png"));
		getContentPane().add(lblTeszta, "cell 2 7");
		
		JLabel lblTszta = new JLabel("Tészta");
		getContentPane().add(lblTszta, "cell 4 7");
		
		JLabel lblAlap = new JLabel("Alap");
		getContentPane().add(lblAlap, "cell 6 7");
		
		JLabel lblFelttek = new JLabel("Feltétek");
		getContentPane().add(lblFelttek, "cell 9 7");
		
		JRadioButton rdbtnCm = new JRadioButton("28 cm");
		getContentPane().add(rdbtnCm, "cell 1 9");
		
		JRadioButton rdbtnVkony = new JRadioButton("Vékony");
		getContentPane().add(rdbtnVkony, "cell 4 9");
		
		JRadioButton rdbtnParadicsomos = new JRadioButton("Paradicsomos");
		getContentPane().add(rdbtnParadicsomos, "cell 6 9");
		
		JCheckBox chckbxKukorica = new JCheckBox("Kukorica");
		getContentPane().add(chckbxKukorica, "cell 8 9");
		
		JCheckBox chckbxJackFruit = new JCheckBox("Jack fruit");
		getContentPane().add(chckbxJackFruit, "cell 9 9");
		
		JRadioButton rdbtnCm_1 = new JRadioButton("33 cm");
		getContentPane().add(rdbtnCm_1, "cell 1 11");
		
		JRadioButton rdbtnVastag = new JRadioButton("Vastag");
		getContentPane().add(rdbtnVastag, "cell 4 11");
		
		JRadioButton rdbtnBbq = new JRadioButton("BBQ");
		getContentPane().add(rdbtnBbq, "cell 6 11");
		
		JCheckBox chckbxGomba = new JCheckBox("Gomba");
		getContentPane().add(chckbxGomba, "cell 8 11");
		
		JRadioButton rdbtnVegan = new JRadioButton("Vegan");
		getContentPane().add(rdbtnVegan, "cell 6 13");
		
		JCheckBox chckbxArticska = new JCheckBox("Articsóka");
		getContentPane().add(chckbxArticska, "cell 8 13");
		
		
		
		setVisible(true); // ez alá nem írok
	}
}
