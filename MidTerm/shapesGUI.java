import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.io.*;

public class shapesGUI extends JFrame implements ActionListener{

	private static Map<Integer, Shape> shapes = new HashMap<Integer, Shape>();
	private JFrame frmShapeTime;
	private ArrayList<Shape> shapesList = new ArrayList<Shape>();
	private static DefaultListModel<Shape> listModel = new DefaultListModel<Shape>();

	public void fillShapes() {
		
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					shapesGUI window = new shapesGUI();
					window.frmShapeTime.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		Object temp = e.getSource();
	}
	
	public void readIn() {
		try (FileInputStream is = new FileInputStream("C:/Users/dtucker21/Desktop/MidTerm/shapes1.csv")) {
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader rdr = new BufferedReader(ir);
			String line = rdr.readLine();
			while (line != null) {
				String[] parts = line.split(",");
				for (String p: parts) {
					if (p.length() > 0) {
						String temp = p.substring(1, p.length() - 1);
						temp.toLowerCase();
						if (temp.substring(1, p.length() - 1) == "circle")
							listModel.addElement(new Circle());
						else if (temp.substring(1, p.length() - 1) == "rectangle")
							listModel.addElement(new Rectangle());
						else if (temp.substring(1, p.length() - 1) == "square")
							listModel.addElement(new Square());
						else if (temp.substring(1, p.length() - 1) == "triangle")
							listModel.addElement(new Triangle());
						else
							System.out.println(temp);
					}
					else {
						String temp = p;
						temp.toLowerCase();
						System.out.print(temp + "\t");
					}

				}
				line = rdr.readLine();
			}
		}
		catch (Exception ex) { System.out.println("Error in opening file. Did you enter the path correctly?"); }
	}

	

	/**
	 * Create the application.
	 */
	public shapesGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmShapeTime = new JFrame();
		frmShapeTime.setTitle("Shape Time");
		frmShapeTime.setBounds(100, 100, 600, 400);
		frmShapeTime.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmShapeTime.getContentPane().setLayout(null);
		
		JLabel shapeLabel = new JLabel("Shape"); //picture of shape goes here
		shapeLabel.setBounds(220, 11, 152, 339);
		frmShapeTime.getContentPane().add(shapeLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 11, 200, 339);
		frmShapeTime.getContentPane().add(scrollPane);
		
		JLabel lblYourShapes = new JLabel("Your Shapes");
		scrollPane.setColumnHeaderView(lblYourShapes);
		
		JList<String> list = new JList<String>();
		list.setValueIsAdjusting(true);
		list.setModel(new DefaultListModel<String>() {	
			ArrayList<String> shapes = new ArrayList<String>();
			public int getSize() {
				return shapes.size();
			}
			public String getElementAt(int index) {
				return shapes.get(index);
			}
		});

		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(list);
		
		JTextArea propertiesArea = new JTextArea();
		propertiesArea.setWrapStyleWord(true);
		propertiesArea.setRows(20);
		propertiesArea.setText("Select a shape to get started");
		propertiesArea.setEditable(false);
		propertiesArea.setBounds(382, 11, 192, 339);
		frmShapeTime.getContentPane().add(propertiesArea);

		readIn();
	}
}
