package aula2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaixaOpcoes extends JFrame {

	int numeroTotal_arroz, numeroQuantidade_arroz, resultado_arroz;
	int numeroTotal_carne, numeroQuantidade_carne, resultado_carne;
	int numeroTotal_feijao, numeroQuantidade_feijao, resultado_feijao;
	int numeroTotal_fruta, numeroQuantidade_fruta, resultado_fruta;

	private JLabel lbValor, lbQuantidade, lbTotal;
	private JButton btCancelar, btCalcular, btLimpar;
	private JCheckBox ckCarne, ckArroz, ckFeijao, ckFruta;

	private JTextField txtValor_arroz, txtQuantidade_arroz, txtTotal_arroz;
	private JTextField txtValor_Carne, txtQuantidade_Carne, txtTotal_Carne;
	private JTextField txtValor_Feijao, txtQuantidade_Feijao, txtTotal_Feijao;
	private JTextField txtValor_Fruta, txtQuantidade_Fruta, txtTotal_Fruta;

	private  CaixaOpcoes frame;
	
	

	public  CaixaOpcoes () {

		componentes();
		eventos();

	}

	private void componentes() {

//		Tela

		setTitle("Lista de Compras");
		setBounds(0, 0, 450, 650);
		setLayout(null);
		
//		Nomes

		
		lbValor = new JLabel("Valor");
		lbValor.setBounds(150, 260, 90, 25);
		lbValor.setForeground(Color.red);
		lbValor.setFont(new Font("Arial Black" , Font.BOLD, 12));
		add(lbValor);

		lbQuantidade = new JLabel("Quantidade");
		lbQuantidade.setBounds(210, 260, 90, 25);
		lbQuantidade.setForeground(Color.red);
		lbQuantidade.setFont(new Font("Arial Black" , Font.BOLD, 12));
		add(lbQuantidade);
		
		lbTotal = new JLabel("Total");
		lbTotal.setBounds(310, 260, 90, 25);
		lbTotal.setForeground(Color.red);
		lbTotal.setFont(new Font("Arial Black" , Font.BOLD, 12));
		add(lbTotal);

//  	Botões

		btCalcular = new JButton("Calcular");
		btCalcular.setBounds(150, 550, 90, 25);
		add(btCalcular);

		btCancelar = new JButton("Cancelar");
		btCancelar.setBounds(50, 550, 90, 25);
		add(btCancelar);

		btLimpar = new JButton("Limpar");
		btLimpar.setBounds(250, 550, 90, 25);
		add(btLimpar);

//		Marcacao

		ckArroz = new JCheckBox("Arroz");
		ckArroz.setBounds(40, 300, 90, 25);
		ckArroz.setForeground(Color.red);
		ckArroz.setFont(new Font("Arial Black" , Font.BOLD, 12));
		add(ckArroz);

		ckCarne = new JCheckBox("Carne");
		ckCarne.setBounds(40, 360, 90, 25);
		ckCarne.setForeground(Color.red);
		ckCarne.setFont(new Font("Arial Black" , Font.BOLD, 12));
		add(ckCarne);

		ckFeijao = new JCheckBox("Feijão");
		ckFeijao.setBounds(40, 420, 90, 25);
		ckFeijao.setForeground(Color.red);
		ckFeijao.setFont(new Font("Arial Black" , Font.BOLD, 12));
		add(ckFeijao);

		ckFruta = new JCheckBox("Fruta");
		ckFruta.setBounds(40, 480, 90, 25);
		ckFruta.setForeground(Color.red);
		ckFruta.setFont(new Font("Arial Black" , Font.BOLD, 12));
		add(ckFruta);

//	  	Resposta (USUARIO - ARROZ)

		txtValor_arroz = new JTextField(3);
		txtValor_arroz.setBounds(140, 300, 50, 25);
		add(txtValor_arroz);

		txtQuantidade_arroz = new JTextField(3);
		txtQuantidade_arroz.setBounds(217, 300, 50, 25);
		add(txtQuantidade_arroz);

		txtTotal_arroz = new JTextField(4);
		txtTotal_arroz.setBounds(300, 300, 50, 25);
		add(txtTotal_arroz);

//	  	Resposta (USUARIO - CARNE)

		txtValor_Carne = new JTextField(3);
		txtValor_Carne.setBounds(140, 360, 50, 25);
		add(txtValor_Carne);

		txtQuantidade_Carne = new JTextField(3);
		txtQuantidade_Carne.setBounds(217, 360, 50, 25);
		add(txtQuantidade_Carne);

		txtTotal_Carne = new JTextField(4);
		txtTotal_Carne.setBounds(300, 360, 50, 25);
		add(txtTotal_Carne);

//	  	Resposta (USUARIO - FEIJAO )

		txtValor_Feijao = new JTextField(3);
		txtValor_Feijao.setBounds(140, 420, 50, 25);
		add(txtValor_Feijao);

		txtQuantidade_Feijao = new JTextField(3);
		txtQuantidade_Feijao.setBounds(217, 420, 50, 25);
		add(txtQuantidade_Feijao);

		txtTotal_Feijao = new JTextField(4);
		txtTotal_Feijao.setBounds(300, 420, 50, 25);
		add(txtTotal_Feijao);

//	  	Resposta (USUARIO - FRUTA)

		txtValor_Fruta = new JTextField(3);
		txtValor_Fruta.setBounds(140, 480, 50, 25);
		add(txtValor_Fruta);

		txtQuantidade_Fruta = new JTextField(3);
		txtQuantidade_Fruta.setBounds(217, 480, 50, 25);
		add(txtQuantidade_Fruta);

		txtTotal_Fruta = new JTextField(4);
		txtTotal_Fruta.setBounds(300, 480, 50, 25);
		add(txtTotal_Fruta);

	}

	private void eventos() {

		btLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {

//				Limpa os campos selecionados

				ckArroz.setSelected(false);
				ckCarne.setSelected(false);
				ckFeijao.setSelected(false);
				ckFruta.setSelected(false);

//				limpa os campos do Arroz

				txtValor_arroz.setText("");
				txtQuantidade_arroz.setText("");
				txtTotal_arroz.setText("");

//				limpa os campos do Carne

				txtValor_Carne.setText("");
				txtQuantidade_Carne.setText("");
				txtTotal_Carne.setText("");

//				limpa os campos do Feijão

				txtValor_Feijao.setText("");
				txtQuantidade_Feijao.setText("");
				txtTotal_Feijao.setText("");

//				limpa os campos da Fruta

				txtValor_Fruta.setText("");
				txtQuantidade_Fruta.setText("");
				txtTotal_Fruta.setText("");

			}
		});

		btCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		});

		btCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Calcular();
			}

		});

	}

	void Calcular() {

//		ARROZ

		numeroTotal_arroz = Integer.parseInt(txtValor_arroz.getText());
		numeroQuantidade_arroz = Integer.parseInt(txtQuantidade_arroz.getText());
		resultado_arroz = numeroTotal_arroz * numeroQuantidade_arroz;
		txtTotal_arroz.setText(String.valueOf(resultado_arroz));

//		CARNE

		numeroTotal_carne = Integer.parseInt(txtValor_Carne.getText());
		numeroQuantidade_carne = Integer.parseInt(txtQuantidade_Carne.getText());
		resultado_carne = numeroTotal_carne * numeroQuantidade_carne;
		txtTotal_Carne.setText(String.valueOf(resultado_carne));

//		FEIJAO

		numeroTotal_feijao = Integer.parseInt(txtValor_Feijao.getText());
		numeroQuantidade_feijao = Integer.parseInt(txtQuantidade_Feijao.getText());
		resultado_feijao = numeroTotal_feijao * numeroQuantidade_feijao;
		txtTotal_Feijao.setText(String.valueOf(resultado_feijao));

//	 	FRUTA

		numeroTotal_fruta = Integer.parseInt(txtValor_Fruta.getText());
		numeroQuantidade_fruta = Integer.parseInt(txtQuantidade_Fruta.getText());
		resultado_fruta = numeroTotal_fruta * numeroQuantidade_fruta;
		txtTotal_Fruta.setText(String.valueOf(resultado_fruta));

	}

	public void run() {

		 CaixaOpcoes  tela = new  CaixaOpcoes ();
                    tela.setVisible(true);

	}

}