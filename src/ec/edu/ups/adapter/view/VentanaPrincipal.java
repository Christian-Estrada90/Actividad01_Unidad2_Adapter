package ec.edu.ups.adapter.view;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import ec.edu.ups.adapter.controller.TemperaturaController;

/**
 *
 * @author Grupo 3
 */
public class VentanaPrincipal extends javax.swing.JFrame {
	
	DefaultTableModel tblModel = new DefaultTableModel();

	public VentanaPrincipal() {
		initComponents();
		tblModel.addColumn("Sensor");
		tblModel.addColumn("Temperatura Ingresada");
		tblModel.addColumn("Temperatura Celsius");
		tblInformacion.setModel(tblModel);
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		txtTemperatura = new javax.swing.JTextField();
		btnCrear = new javax.swing.JButton();
		jLabel11 = new javax.swing.JLabel();
		cmbTipo = new javax.swing.JComboBox<>();
		jLabel12 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		tblInformacion = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setLayout(new java.awt.GridLayout(1, 0));

		jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		jLabel1.setText("Temperatura");

		txtTemperatura.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		txtTemperatura.setName("txtTemperatura");

		btnCrear.setText("Registrar");
		btnCrear.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnCrearActionPerformed(evt);
			}
		});

		jLabel11.setFont(new java.awt.Font("Arial Narrow", 0, 14));
		jLabel11.setText("ACTIVOS FIJOS");

		cmbTipo.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit" }));
		cmbTipo.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				cmbTipoItemStateChanged(evt);
			}
		});
		cmbTipo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cmbTipoActionPerformed(evt);
			}
		});

		jLabel12.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		jLabel12.setText("Sensor");

		tblInformacion
				.setModel(new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(tblInformacion);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(24, 24, 24)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(
												layout.createSequentialGroup().addGap(33, 33, 33).addComponent(jLabel6))
										.addComponent(jLabel1).addComponent(jLabel12))
								.addGap(27, 27, 27)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup()
												.addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 119,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(0, 24, Short.MAX_VALUE))
										.addComponent(txtTemperatura))))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 910,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addContainerGap())
				.addGroup(layout.createSequentialGroup().addGap(49, 49, 49).addComponent(jLabel11).addGap(0, 0,
						Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addComponent(jLabel11)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel12))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(txtTemperatura,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18).addComponent(btnCrear).addGap(76, 76, 76).addComponent(jLabel6)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 131, Short.MAX_VALUE))
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
				.addContainerGap()));

		pack();
	}

	private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		if (txtTemperatura.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Ingrese una Temperatura");
			return;
		}

		var temperaturaControler = new TemperaturaController();
		temperaturaControler.registrarTemperatura(cmbTipo.getSelectedItem().toString(),
				Double.parseDouble(txtTemperatura.getText()));

		var datos = temperaturaControler.getArraytemperatura();
		tblModel.addRow(new Object[] { datos[0], datos[1], datos[2] });
		txtTemperatura.setText("");
		JOptionPane.showMessageDialog(null, "Temperatura Registrada Correctamente");
	}

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new VentanaPrincipal().setVisible(true);
			}
		});
	}

	private javax.swing.JButton btnCrear;
	private javax.swing.JComboBox<String> cmbTipo;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable tblInformacion;
	private javax.swing.JTextField txtTemperatura;
}
