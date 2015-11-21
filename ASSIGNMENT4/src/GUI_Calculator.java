/*Shivam patel 300814125
 * github account https://github.com/HATELA/
 */


import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneLayout;

import java.awt.event.ActionListener;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;


import java.util.ArrayList;


@SuppressWarnings("serial")
public class GUI_Calculator extends JFrame implements ActionListener {

	private JPanel contentPanel;
	private JScrollPane calculatorPane;

	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField txtCreditHours;
	private JLabel lblNewLabel_1;
	private JTextField txtGpa;
	private JLabel lblNumberOfCourses;
	private JComboBox<String> comboBox;
	
	private JLabel lblGPA;
	
	
	private JButton btnCal; 

	
	private String[] numOfCoursesText = {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21"};
	private String[] creditHourText = {"1", "2" , "3", "4"};
	private String[] gradeText = {"A+ 90-100", "A 80-89", "B+ 75-79", "B 70-74", "C+ 65-69", "C 60-64", "D+ 55-59", "D 50-54", "F 0-49"};

	
	private ArrayList<JTextField> courseTextField = new ArrayList<>();
	private ArrayList<JComboBox<String>> hourComboBox = new ArrayList<>();
	private ArrayList<JComboBox<String>> gradeComboBox = new ArrayList<>();


	
	public GUI_Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 100, 800, 400);
		setResizable(false);
		
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPanel);
		contentPanel.setLayout(new BorderLayout(5, 5));

		panel = new JPanel();
		contentPanel.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(1, 2, 0, 0));
        panel.setBackground(Color.MAGENTA);
		lblNewLabel = new JLabel("Credit hours earned:");
		panel.add(lblNewLabel);

		txtCreditHours = new JTextField();
		panel.add(txtCreditHours);
		txtCreditHours.setColumns(5);

		lblNewLabel_1 = new JLabel("Current GPA:");
		panel.add(lblNewLabel_1);

		txtGpa = new JTextField();
		panel.add(txtGpa);
		txtGpa.setColumns(10);

		lblNumberOfCourses = new JLabel("Number Of Courses:");
		panel.add(lblNumberOfCourses);

		comboBox = new JComboBox(numOfCoursesText);
		comboBox.setSelectedIndex(0);
		comboBox.addActionListener(this);
		panel.add(comboBox);
		
		//Panel for result Label and button
		JPanel southPane = new JPanel();
		southPane.setLayout(new GridLayout());
		
		
		lblGPA = new JLabel("0.00");
		btnCal = new JButton("Calcuate GPA");
		btnCal.addActionListener(this);
		btnCal.setBackground(Color.PINK );
		
		
		
		southPane.add(lblGPA);
		southPane.add(btnCal);
		
		contentPanel.add(southPane,BorderLayout.SOUTH);
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == comboBox)
		{
			if(calculatorPane != null)
			{
				this.getContentPane().remove(calculatorPane);
			}

			
			int numOfCourses = comboBox.getSelectedIndex();
			
			//List of components initialization
			courseTextField = new ArrayList<>();
			hourComboBox = new ArrayList<>();
			gradeComboBox = new ArrayList<>();

			//Components of a  gridbag layout
			JPanel calcComponentPanel = new JPanel();
			calcComponentPanel.setLayout(new GridBagLayout());
			GridBagConstraints gbc = new GridBagConstraints();
			calcComponentPanel.setBackground(Color.GRAY);

			// panel  containing components.
			calculatorPane = new JScrollPane();
			calculatorPane.setLayout(new ScrollPaneLayout());
			calculatorPane.setViewportView(calcComponentPanel);

			//Adding Column 
			JLabel lblNr = new JLabel("Nr");
			JLabel lblCourseCode = new JLabel("Course Code ");
			JLabel lblCreditHour = new JLabel("Credit Hours ");
			JLabel lblGrade = new JLabel("Grade ");
			calculatorPane.setBackground(Color.PINK);
			gbc.gridy = 0;
			gbc.weightx = 15;
			gbc.fill = GridBagConstraints.BOTH;
			gbc.insets = new Insets(15,15,15,15);

			
			gbc.gridx = 0;
			calcComponentPanel.add(lblNr, gbc);
			gbc.gridx = 1;
			calcComponentPanel.add(lblCourseCode, gbc);
			gbc.gridx = 2;
			calcComponentPanel.add(lblCreditHour, gbc);
			gbc.gridx = 3;
			calcComponentPanel.add(lblGrade, gbc);

			
			
			for(int col = 0; col < 4; col++)
			{
				gbc.gridx = col;
				
				switch(col)
				{
				case 0:
					
					for(int row = 1; row <= numOfCourses; row++)
					{
						gbc.gridy = row;
						calcComponentPanel.add(new JLabel(Integer.toString(row)), gbc);
					}
					break;
				case 1:
					//Loop for adding course code 
					for(int row = 1; row <= numOfCourses; row++)
					{
						gbc.gridy = row;
						courseTextField.add(new JTextField());
						calcComponentPanel.add(courseTextField.get(courseTextField.size()-1),gbc);
					}
					break;
				case 2:
					//Loop for adding credit Hours 
					for(int row = 1; row <= numOfCourses; row++)
					{	
						gbc.gridy = row;
						hourComboBox.add(new JComboBox<String>(creditHourText));
						calcComponentPanel.add(hourComboBox.get(hourComboBox.size()-1),gbc);
						
					}
					break;
				case 3:
					//Loop for adding JComboBoxes
					for(int row = 1; row <= numOfCourses; row++)
					{
						gbc.gridy = row;
						gradeComboBox.add(new JComboBox<String>(gradeText));
						calcComponentPanel.add(gradeComboBox.get(gradeComboBox.size()-1),gbc);
					}
					break;
				}			
			}
				
			
			JPanel fillPane = new JPanel();
			
			gbc.gridy += 1;
			gbc.weighty = 1;
			calcComponentPanel.add(fillPane, gbc);
			 fillPane.setBackground(Color.darkGray);
	       

			contentPanel.add(calculatorPane);
			revalidate();
			repaint();
			
			

		}
		else if(e.getSource() == btnCal)
		{
			
			ArrayList<String> lstCreditHourSelected = new ArrayList<String>();
			ArrayList<String> lstGradeSelected = new ArrayList<String>();
			
			for(int i = 0; i < hourComboBox.size(); i++)
			{
				lstCreditHourSelected.add(hourComboBox.get(i).getSelectedItem().toString());
				lstGradeSelected.add(gradeComboBox.get(i).getSelectedItem().toString().substring(0, 2).trim());
			}
			double currentGPA = GPA.Calculate(Double.parseDouble(txtGpa.getText()),
					Integer.parseInt(txtCreditHours.getText()), lstCreditHourSelected, lstGradeSelected);	
			
					
			
			lblGPA.setText("GPA : " + String.format("%.1f", currentGPA));
		}
	}
}
