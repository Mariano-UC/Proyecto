package com.ucreativa.rutinaGym.entities.ui;

import com.ucreativa.rutinaGym.entities.UpperBody;
import com.ucreativa.rutinaGym.entities.repositories.FileRepository;
import com.ucreativa.rutinaGym.entities.services.BitacoraService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FrontEnd extends JFrame {

    public FrontEnd(String titulo) {
        super(titulo);
    }

    public void build(){
        this.construccionPantalla();
        this.crearComponentes();
        super.setVisible(true);
    }

    private void construccionPantalla(){
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400, 200);
        super.setLayout(new GridLayout(5,5));

    }

    private void agregarComponente(Component componente){
        super.getContentPane().add(componente);
    }

    private void crearComponentes(){

        JLabel lblNombre = new JLabel("Nombre");
        JLabel lblCedula = new JLabel("Cedula");
        JLabel lblEdad = new JLabel("Edad");
        JLabel lblUpperBody = new JLabel("UpperBody");
        JLabel lblLowerBody = new JLabel("LowerBody");
        JLabel lblPecho = new JLabel("Pecho");
        JLabel lblHombros = new JLabel("Hombros");
        JLabel lblEspalda = new JLabel("Espalda");
        JLabel lblBrazos = new JLabel("Brazos");
        JLabel lblCore = new JLabel("Core");
        JLabel lblPiernas = new JLabel("Piernas");
        JLabel lblCardio = new JLabel("Cardio");

        JTextField txtNombre = new JTextField();
        JTextField txtCedula = new JTextField();
        JTextField txtEdad = new JTextField();

        JRadioButton txtUpperBody = new JRadioButton();
        JRadioButton txtLowerBody = new JRadioButton();
        JCheckBox txtPecho = new JCheckBox();
        JCheckBox txtHombros = new JCheckBox();
        JCheckBox txtEspalda = new JCheckBox();
        JCheckBox txtBrazos = new JCheckBox();
        JCheckBox txtCore = new JCheckBox();
        JCheckBox txtPiernas = new JCheckBox();
        JCheckBox txtCardio = new JCheckBox();

        ButtonGroup group = new ButtonGroup();
            group.add(txtUpperBody);
            group.add(txtLowerBody);
            txtUpperBody.setSelected(true);

            if(txtUpperBody.isSelected()){
                lblCore.setVisible(false);
                txtCore.setVisible(false);
                lblPiernas.setVisible(false);
                txtPiernas.setVisible(false);
                lblCardio.setVisible(false);
                txtCardio.setVisible(false);
            } else {
                lblCore.setVisible(true);
                txtCore.setVisible(true);
                lblPiernas.setVisible(true);
                txtPiernas.setVisible(true);
                lblCardio.setVisible(true);
                txtCardio.setVisible(true);
            }


        txtUpperBody.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblPecho.setVisible(txtUpperBody.isSelected());
                txtPecho.setVisible(txtUpperBody.isSelected());
                lblHombros.setVisible(txtUpperBody.isSelected());
                txtHombros.setVisible(txtUpperBody.isSelected());
                lblEspalda.setVisible(txtUpperBody.isSelected());
                txtEspalda.setVisible(txtUpperBody.isSelected());
                lblBrazos.setVisible(txtUpperBody.isSelected());
                txtBrazos.setVisible(txtUpperBody.isSelected());
                lblCore.setVisible(false);
                txtCore.setVisible(false);
                lblPiernas.setVisible(false);
                txtPiernas.setVisible(false);
                lblCardio.setVisible(false);
                txtCardio.setVisible(false);
            }
        });
        txtLowerBody.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblPecho.setVisible(false);
                txtPecho.setVisible(false);
                lblHombros.setVisible(false);
                txtHombros.setVisible(false);
                lblEspalda.setVisible(false);
                txtEspalda.setVisible(false);
                lblBrazos.setVisible(false);
                txtBrazos.setVisible(false);
                lblCore.setVisible(txtLowerBody.isSelected());
                txtCore.setVisible(txtLowerBody.isSelected());
                lblPiernas.setVisible(txtLowerBody.isSelected());
                txtPiernas.setVisible(txtLowerBody.isSelected());
                lblCardio.setVisible(txtLowerBody.isSelected());
                txtCardio.setVisible(txtLowerBody.isSelected());
            }
        });

        JButton salvar = new JButton("Save");
        salvar.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BitacoraService service = new BitacoraService(new FileRepository());
                try {
                    service.save(txtNombre.getText(),
                            txtCedula.getText(),
                            txtEdad.getText(),
                            txtUpperBody.isSelected(),
                            txtLowerBody.isSelected(),
                            txtPecho.isSelected(),
                            txtHombros.isSelected(),
                            txtEspalda.isSelected(),
                            txtBrazos.isSelected(),
                            txtCore.isSelected(),
                            txtPiernas.isSelected(),
                            txtCardio.isSelected());

                    txtNombre.setText("");
                    txtCedula.setText("");
                    txtEdad.setText("");
                    txtUpperBody.setText("");
                    txtLowerBody.setText("");
                    txtPecho.setText("");
                    txtHombros.setText("");
                    txtEspalda.setText("");
                    txtBrazos.setText("");
                    txtCore.setText("");
                    txtPiernas.setText("");
                    txtCardio.setText("");

                    String reporte = String.join("\n", service.get());
                    JOptionPane.showMessageDialog(((JButton)e.getSource()).getParent(), reporte);
                } catch (ErrorEnEdadException error) {
                    JOptionPane.showMessageDialog(((JButton)e.getSource()).getParent(), error.getMessage());
                }

            }
        });

        this.agregarComponente(lblNombre);
        this.agregarComponente(txtNombre);
        this.agregarComponente(lblCedula);
        this.agregarComponente(txtCedula);
        this.agregarComponente(lblEdad);
        this.agregarComponente(txtEdad);
        this.agregarComponente(lblUpperBody);
        this.agregarComponente(txtUpperBody);
        this.agregarComponente(lblLowerBody);
        this.agregarComponente(txtLowerBody);
        this.agregarComponente(lblPecho);
        this.agregarComponente(txtPecho);
        this.agregarComponente(lblHombros);
        this.agregarComponente(txtHombros);
        this.agregarComponente(lblEspalda);
        this.agregarComponente(txtEspalda);
        this.agregarComponente(lblBrazos);
        this.agregarComponente(txtBrazos);
        this.agregarComponente(lblCore);
        this.agregarComponente(txtCore);
        this.agregarComponente(lblPiernas);
        this.agregarComponente(txtPiernas);
        this.agregarComponente(lblCardio);
        this.agregarComponente(txtCardio);
        this.agregarComponente(salvar);
    }

}
