package conexaobanco;

import DAO.FilmesDAO;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class GuiCadastroFilmes extends JFrame {
   JLabel label1,label2,label3,label4,label5;
   JButton btGravar, btAlterar,btExcluir,btNovo,btLocalizar,btCancelar,btSair;
   static JTextField tfCodigo, tfTitulo, tfGenero,tfProdutora,tfDataCompra;
   private FilmesDAO filmes;
   
    public static void main(String[] args) {
        JFrame janela = new GuiCadastroFilmes();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    public GuiCadastroFilmes(){
        componentes();
        eventos();
    }
    private void componentes(){
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setTitle("Cadastro de filmes");
        setBounds(200,100,610,120);
        label1 = new JLabel("Codigo");
        label2 = new JLabel("Titulo");
        label3 = new JLabel("Genero");
        label4 = new JLabel("Produtora");
        label5 = new JLabel("Data Compra");
        tfCodigo = new JTextField(10);
        tfTitulo = new JTextField(35);
        tfGenero = new JTextField(10);
        tfProdutora = new JTextField(15);
        tfDataCompra = new JTextField(8);
    }

    private void eventos() {
        
    }
}
