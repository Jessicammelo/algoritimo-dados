import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import core.HTMLParser;
import core.ReadFile;
import core.TagCounter;
import model.TagSumarization;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Trabalho01 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Trabalho01 frame = new Trabalho01();
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
	public Trabalho01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Arquivo:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(56, 8, 275, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(10, 36, 414, 90);
		contentPane.add(editorPane);

		table = new JTable();
		DefaultTableModel model = new DefaultTableModel();
		table.setModel(model);
		model.addColumn("Tag");
		model.addColumn("Tag2");
		table.setBounds(10, 137, 414, 113);
		contentPane.add(table);

		JButton btnNewButton = new JButton("Analisar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.getDataVector().removeAllElements();
				try {
					HTMLParser parser = new HTMLParser();
					TagCounter counter = new TagCounter();
					counter.counter(parser.getHTMLTags(ReadFile.readFile(textField.getText())), null);
					for (TagSumarization sumarization : counter.sumarization) {
						model.addRow(new Object[] { sumarization.getTagName(), sumarization.getTagCounter() });
					}
					editorPane.setText("O arquivo está bem formatado");
				} catch (Exception ex) {
					editorPane.setText(ex.getMessage());
				}
			}
		});
		btnNewButton.setBounds(335, 7, 89, 23);
		contentPane.add(btnNewButton);
	}
}
