import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ingreso extends JPanel {
	private JTextField txtCodClie;
	private JTextField txtNombreCli;
	private JTextField txtApelliCli;
	private JTextField txtDirecciCli;
	private JTextField txtTelCli;
	private JTextField txtDniCLi;
	private JTable table;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTable table_1;
	


	/**
	 * Create the panel.
	 */
	public Ingreso() {
		setBackground(new Color(0, 51, 102));
		setLayout(null);
				
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(228, -23, 881, 645);
		add(tabbedPane);
		
		
		 JPanel paneCliente = new JPanel();
		paneCliente.setBackground(new Color(255, 250, 240));
		tabbedPane.addTab("New tab", null, paneCliente, null);
		paneCliente.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Código Cliente");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(38, 94, 99, 19);
		paneCliente.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombres");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(38, 149, 99, 19);
		paneCliente.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellidos");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(38, 212, 99, 19);
		paneCliente.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Dirección");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(38, 278, 99, 19);
		paneCliente.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Teléfono");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(38, 332, 99, 19);
		paneCliente.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("DNI/RUC");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_4.setBounds(38, 387, 99, 19);
		paneCliente.add(lblNewLabel_1_4);
		
		txtCodClie = new JTextField();
		txtCodClie.setBounds(157, 95, 116, 20);
		paneCliente.add(txtCodClie);
		txtCodClie.setColumns(10);
		
		txtNombreCli = new JTextField();
		txtNombreCli.setColumns(10);
		txtNombreCli.setBounds(157, 150, 116, 20);
		paneCliente.add(txtNombreCli);
		
		txtApelliCli = new JTextField();
		txtApelliCli.setColumns(10);
		txtApelliCli.setBounds(157, 213, 116, 20);
		paneCliente.add(txtApelliCli);
		
		txtDirecciCli = new JTextField();
		txtDirecciCli.setColumns(10);
		txtDirecciCli.setBounds(157, 279, 116, 20);
		paneCliente.add(txtDirecciCli);
		
		txtTelCli = new JTextField();
		txtTelCli.setColumns(10);
		txtTelCli.setBounds(157, 333, 116, 20);
		paneCliente.add(txtTelCli);
		
		txtDniCLi = new JTextField();
		txtDniCLi.setColumns(10);
		txtDniCLi.setBounds(157, 388, 116, 20);
		paneCliente.add(txtDniCLi);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(309, 123, 533, 286);
		paneCliente.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(248, 248, 255));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Cod-Cliente", "Nombres", "Apellidos", "Direcci\u00F3n", "Tel\u00E9fono", "DNI"
			}
		));
		table.getColumnModel().getColumn(3).setPreferredWidth(150);
		scrollPane.setViewportView(table);
		
		JLabel lblBuscar = new JLabel("Buscar:");
		lblBuscar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBuscar.setBounds(582, 88, 52, 19);
		paneCliente.add(lblBuscar);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(644, 89, 116, 20);
		paneCliente.add(textField_6);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(Ingreso.class.getResource("/Img/639375 (3).png")));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(767, 88, 33, 22);
		paneCliente.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(Ingreso.class.getResource("/Img/3979303.png")));
		btnNewButton_3.setBounds(207, 440, 70, 51);
		paneCliente.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon(Ingreso.class.getResource("/Img/6861362.png")));
		btnNewButton_4.setBounds(123, 440, 70, 51);
		paneCliente.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon(Ingreso.class.getResource("/Img/5632370.png")));
		btnNewButton_5.setBounds(123, 501, 70, 51);
		paneCliente.add(btnNewButton_5);
		
		JButton btn = new JButton("");
		btn.setIcon(new ImageIcon(Ingreso.class.getResource("/Img/12388395.png")));
		btn.setBounds(38, 440, 70, 51);
		paneCliente.add(btn);
		
		JPanel panelProducto = new JPanel();
		panelProducto.setLayout(null);
		panelProducto.setBackground(new Color(255, 250, 240));
		tabbedPane.addTab("New tab", null, panelProducto, "");
		
		JLabel lblNewLabel_2 = new JLabel("Código Producto");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(38, 94, 109, 19);
		panelProducto.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_5 = new JLabel("Nombre");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_5.setBounds(38, 149, 99, 19);
		panelProducto.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Precio");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(38, 212, 99, 19);
		panelProducto.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Stock Actual");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2_1.setBounds(38, 278, 99, 19);
		panelProducto.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Stock Minimo");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_1.setBounds(38, 332, 99, 19);
		panelProducto.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Stock Máximo");
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_4_1.setBounds(38, 387, 99, 19);
		panelProducto.add(lblNewLabel_1_4_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(157, 95, 116, 20);
		panelProducto.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(157, 150, 116, 20);
		panelProducto.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(157, 213, 116, 20);
		panelProducto.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(157, 279, 116, 20);
		panelProducto.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(157, 333, 116, 20);
		panelProducto.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(157, 388, 116, 20);
		panelProducto.add(textField_13);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(309, 123, 533, 286);
		panelProducto.add(scrollPane_2);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Cod Producto", "Nombres", "Precio", "Stock Actual", "Stock M\u00EDnimo", "Stock M\u00E1ximo"
			}
		));
		scrollPane_2.setViewportView(table_1);
		
		JLabel lblBuscar_2 = new JLabel("Buscar:");
		lblBuscar_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBuscar_2.setBounds(582, 88, 52, 19);
		panelProducto.add(lblBuscar_2);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(644, 89, 116, 20);
		panelProducto.add(textField_14);
		
		JButton btnNewButton_2_2 = new JButton("");
		btnNewButton_2_2.setIcon(new ImageIcon(Ingreso.class.getResource("/Img/639375 (3).png")));
		btnNewButton_2_2.setBackground(Color.WHITE);
		btnNewButton_2_2.setBounds(767, 88, 33, 22);
		panelProducto.add(btnNewButton_2_2);
		
		JButton btnNewButton_3_1 = new JButton("");
		btnNewButton_3_1.setIcon(new ImageIcon(Ingreso.class.getResource("/Img/3979303.png")));
		btnNewButton_3_1.setBounds(207, 440, 70, 51);
		panelProducto.add(btnNewButton_3_1);
		
		JButton btnNewButton_4_1 = new JButton("");
		btnNewButton_4_1.setIcon(new ImageIcon(Ingreso.class.getResource("/Img/6861362.png")));
		btnNewButton_4_1.setBounds(123, 440, 70, 51);
		panelProducto.add(btnNewButton_4_1);
		
		JButton btnNewButton_5_1 = new JButton("");
		btnNewButton_5_1.setIcon(new ImageIcon(Ingreso.class.getResource("/Img/5632370.png")));
		btnNewButton_5_1.setBounds(123, 501, 70, 51);
		panelProducto.add(btnNewButton_5_1);
		
		JButton btn_2 = new JButton("");
		btn_2.setIcon(new ImageIcon(Ingreso.class.getResource("/Img/12388395.png")));
		btn_2.setBounds(38, 440, 70, 51);
		panelProducto.add(btn_2);

		
		JButton btnNewButton = new JButton("Producto");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton.setBounds(35, 293, 164, 41);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setIcon(new ImageIcon(Ingreso.class.getResource("/Img/Producto.png")));
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cliente");
		btnNewButton_1.setBounds(35, 228, 164, 41);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tabbedPane.setSelectedIndex(0);
				 
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setIcon(new ImageIcon(Ingreso.class.getResource("/Img/Cliente.png")));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		add(btnNewButton_1);
	}
	
}
