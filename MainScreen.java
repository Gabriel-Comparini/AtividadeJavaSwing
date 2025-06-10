import javax.swing.*;

import javax.swing.border.Border;

import java.awt.*;


public class MainScreen {
        public static void main(String[] args) {
        JFrame tela = new JFrame();
        tela.setTitle("Cadastro");
        tela.setSize(860, 450);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLayout(null);
        tela.setLocationRelativeTo(null);
        tela.getContentPane().setBackground(new Color(255, 255, 255));
        
        Border borda = BorderFactory.createLineBorder(new Color(200, 200, 200), 1);

        JLabel titulo = new JLabel("<html><font color='#FF7420'>Cadastro de Pessoa</font></html>");
        titulo.setBounds(30, 10, 330, 40);
        titulo.setFont(new Font("Segoe UI Light", Font.BOLD, 35));
        tela.add(titulo);

        JLabel lblTipo = new JLabel("Tipo");
        lblTipo.setBounds(20, 60, 150, 25);
        lblTipo.setLayout(null);
        lblTipo.setBorder(borda);
        lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTipo.setVerticalAlignment(SwingConstants.CENTER);
        tela.add(lblTipo);

        JComboBox<String> cbTipo = new JComboBox<>(new String[]{"Física", "Jurídica"});
        cbTipo.setBounds(175, 60, 120, 25);
        cbTipo.setBackground(new Color(255, 255, 255));
        tela.add(cbTipo);

        JLabel lblCpf = new JLabel("CPF / CNPJ ...");
        lblCpf.setBounds(300, 60, 150, 25);
        lblCpf.setLayout(null);
        lblCpf.setBorder(borda);
        lblCpf.setHorizontalAlignment(SwingConstants.CENTER);
        lblCpf.setVerticalAlignment(SwingConstants.CENTER);
        tela.add(lblCpf);

        JTextField txtCpf = new JTextField();
        txtCpf.setBounds(455, 60, 170, 25);
        txtCpf.setBorder(borda);
        tela.add(txtCpf);

        JLabel lblFornecedor = new JLabel("Fornecedor");
        lblFornecedor.setBounds(630, 60, 150, 25);
        lblFornecedor.setLayout(null);
        lblFornecedor.setBorder(borda);
        lblFornecedor.setHorizontalAlignment(SwingConstants.CENTER);
        lblFornecedor.setVerticalAlignment(SwingConstants.CENTER);
        tela.add(lblFornecedor);

        JCheckBox chkFornecedor = new JCheckBox();
        chkFornecedor.setBounds(795, 60, 25, 25);
        chkFornecedor.setLayout(null);
        chkFornecedor.setBackground(new Color(255,255,255));
        chkFornecedor.setBorder(borda);
        tela.add(chkFornecedor);

        JLabel lblNome = new JLabel("Nome");
        lblNome.setBounds(20, 90, 150, 25);
        lblNome.setLayout(null);
        lblNome.setBorder(borda);
        lblNome.setHorizontalAlignment(SwingConstants.CENTER);
        lblNome.setVerticalAlignment(SwingConstants.CENTER);
        tela.add(lblNome);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(175, 90, 650, 26);
        txtNome.setBorder(borda);
        tela.add(txtNome);

        JLabel lblRg = new JLabel("RG / Inscrição Estadual");
        lblRg.setBounds(20, 120, 150, 25);
        lblRg.setLayout(null);
        lblRg.setBorder(borda);
        lblRg.setHorizontalAlignment(SwingConstants.CENTER);
        lblRg.setVerticalAlignment(SwingConstants.CENTER);
        tela.add(lblRg);

        JTextField txtRg = new JTextField();
        txtRg.setBounds(175, 120, 95, 26);
        txtRg.setBorder(borda);
        tela.add(txtRg);

        JLabel lblOrgao = new JLabel("Orgão Expedidor");
        lblOrgao.setBounds(275, 120, 150, 25);
        lblOrgao.setLayout(null);
        lblOrgao.setBorder(borda);
        lblOrgao.setHorizontalAlignment(SwingConstants.CENTER);
        lblOrgao.setVerticalAlignment(SwingConstants.CENTER);
        tela.add(lblOrgao);

        JTextField txtOrgao = new JTextField();
        txtOrgao.setBounds(430, 120, 152, 26);
        txtOrgao.setBorder(borda);
        tela.add(txtOrgao);

        JLabel lblEmail = new JLabel("Email");
        lblEmail.setBounds(20, 150, 150, 25);
        lblEmail.setLayout(null);
        lblEmail.setBorder(borda);
        lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
        lblEmail.setVerticalAlignment(SwingConstants.CENTER);
        tela.add(lblEmail);

        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(175, 150, 250, 26);
        txtEmail.setBorder(borda);
        tela.add(txtEmail);

        JLabel lblCep = new JLabel("CEP");
        lblCep.setBounds(430, 150, 150, 25);
        lblCep.setLayout(null);
        lblCep.setBorder(borda);
        lblCep.setHorizontalAlignment(SwingConstants.CENTER);
        lblCep.setVerticalAlignment(SwingConstants.CENTER);
        tela.add(lblCep);

        JTextField txtCep = new JTextField();
        txtCep.setBounds(585, 150, 240, 26);
        txtCep.setBorder(borda);
        tela.add(txtCep);

        JLabel lblPais = new JLabel("País");
        lblPais.setBounds(20, 180, 150, 25);
        lblPais.setLayout(null);
        lblPais.setBorder(borda);
        lblPais.setHorizontalAlignment(SwingConstants.CENTER);
        lblPais.setVerticalAlignment(SwingConstants.CENTER);
        tela.add(lblPais);

        JTextField txtPais = new JTextField("BRASIL");
        txtPais.setBounds(175, 180, 250, 25);
        txtPais.setBackground(new Color(240, 240, 240));
        txtPais.setBorder(borda);
        tela.add(txtPais);

        JLabel lblUf = new JLabel("UF ...");
        lblUf.setBounds(430, 180, 150, 25);
        lblUf.setLayout(null);
        lblUf.setBorder(borda);
        lblUf.setHorizontalAlignment(SwingConstants.CENTER);
        lblUf.setVerticalAlignment(SwingConstants.CENTER);
        tela.add(lblUf);

        JTextField txtUf = new JTextField();
        txtUf.setBounds(585, 180, 50, 25);
        txtUf.setBorder(borda);
        tela.add(txtUf);

        JTextField txtCampoExtra = new JTextField();
        txtCampoExtra.setBounds(640, 180, 185, 25);
        txtCampoExtra.setBackground(new Color(240, 240, 240));
        txtCampoExtra.setBorder(borda);
        tela.add(txtCampoExtra);

        JLabel lblMunicipio = new JLabel("Município ...");
        lblMunicipio.setBounds(20, 210, 150, 25);
        lblMunicipio.setLayout(null);
        lblMunicipio.setBorder(borda);
        lblMunicipio.setHorizontalAlignment(SwingConstants.CENTER);
        lblMunicipio.setVerticalAlignment(SwingConstants.CENTER);
        tela.add(lblMunicipio);

        JTextField txtMunicipio = new JTextField();
        txtMunicipio.setBounds(175, 210, 650, 25);
        txtMunicipio.setBackground(new Color(240, 240, 240));
        txtMunicipio.setBorder(borda);
        tela.add(txtMunicipio);

        JLabel lblLogradouro = new JLabel("Logradouro");
        lblLogradouro.setBounds(20, 240, 150, 25);
        lblLogradouro.setLayout(null);
        lblLogradouro.setBorder(borda);
        lblLogradouro.setHorizontalAlignment(SwingConstants.CENTER);
        lblLogradouro.setVerticalAlignment(SwingConstants.CENTER);
        tela.add(lblLogradouro);

        JTextField txtLogradouro = new JTextField();
        txtLogradouro.setBounds(175, 240, 650, 26);
        txtLogradouro.setBorder(borda);
        tela.add(txtLogradouro);

        JLabel lblNumero = new JLabel("Número");
        lblNumero.setBounds(20, 270, 150, 25);
        lblNumero.setLayout(null);
        lblNumero.setBorder(borda);
        lblNumero.setHorizontalAlignment(SwingConstants.CENTER);
        lblNumero.setVerticalAlignment(SwingConstants.CENTER);
        tela.add(lblNumero);

        JTextField txtNumero = new JTextField();
        txtNumero.setBounds(175, 270, 110, 25);
        txtNumero.setBorder(borda);
        tela.add(txtNumero);

        JLabel lblComplemento = new JLabel("Complemento");
        lblComplemento.setBounds(290, 270, 150, 25);
        lblComplemento.setLayout(null);
        lblComplemento.setBorder(borda);
        lblComplemento.setHorizontalAlignment(SwingConstants.CENTER);
        lblComplemento.setVerticalAlignment(SwingConstants.CENTER);
        tela.add(lblComplemento);

        JTextField txtComplemento = new JTextField();
        txtComplemento.setBounds(445, 270, 380, 26);
        txtComplemento.setBorder(borda);
        tela.add(txtComplemento);

        JLabel lblBairro = new JLabel("Bairro");
        lblBairro.setBounds(20, 300, 150, 25);
        lblBairro.setLayout(null);
        lblBairro.setBorder(borda);
        lblBairro.setHorizontalAlignment(SwingConstants.CENTER);
        lblBairro.setVerticalAlignment(SwingConstants.CENTER);
        tela.add(lblBairro);

        JTextField txtBairro = new JTextField();
        txtBairro.setBounds(175, 300, 110, 26);
        txtBairro.setBorder(borda);
        tela.add(txtBairro);

        JLabel lblTelefone = new JLabel("Telefone");
        lblTelefone.setBounds(290, 300, 150, 25);
        lblTelefone.setLayout(null);
        lblTelefone.setBorder(borda);
        lblTelefone.setHorizontalAlignment(SwingConstants.CENTER);
        lblTelefone.setVerticalAlignment(SwingConstants.CENTER);
        tela.add(lblTelefone);

        JTextField txtTelefone = new JTextField();
        txtTelefone.setBounds(445, 300, 90, 26);
        txtTelefone.setBorder(borda);
        tela.add(txtTelefone);

        JLabel lblSituacao = new JLabel("Situação");
        lblSituacao.setBounds(540, 300, 150, 25);
        lblSituacao.setLayout(null);
        lblSituacao.setBorder(borda);
        lblSituacao.setHorizontalAlignment(SwingConstants.CENTER);
        lblSituacao.setVerticalAlignment(SwingConstants.CENTER);
        tela.add(lblSituacao);

        JRadioButton rbAtivo = new JRadioButton("Ativo");
        rbAtivo.setBounds(695, 300, 60, 25);
        rbAtivo.setSelected(true);
        rbAtivo.setBackground(new Color(255,255,255));

        JRadioButton rbInativo = new JRadioButton("Inativo");
        rbInativo.setBounds(760, 300, 80, 25);
        rbInativo.setBackground(new Color(255,255,255));

        ButtonGroup situacaoGroup = new ButtonGroup();
        situacaoGroup.add(rbAtivo);
        situacaoGroup.add(rbInativo);
        tela.add(rbAtivo);
        tela.add(rbInativo);

        JButton btnConfirmar = new JButton("<html><font color='#FFFFFF'>Confirmar</font></html>");
        btnConfirmar.setBounds(20, 340, 100, 30);
        btnConfirmar.setLayout(null);
        btnConfirmar.setBackground(new Color(255,116,32));
        btnConfirmar.setBorder(borda);
        btnConfirmar.addActionListener(e -> confirmFunc(tela));
        tela.add(btnConfirmar);

        JButton btnExcluir = new JButton("<html><font color='#FFFFFF'>Excluir</font></html>");
        btnExcluir.setBounds(130, 340, 100, 30);
        btnExcluir.setLayout(null);
        btnExcluir.setBackground(new Color(255,116,32));
        btnExcluir.setBorder(borda);
        btnExcluir.addActionListener(e -> deleteFunc(tela));
        tela.add(btnExcluir);    

        JButton btnLimpar = new JButton("Limpar");
        btnLimpar.setBounds(240, 340, 100, 30);
        btnLimpar.setLayout(null);
        btnLimpar.setBackground(new Color(240, 240, 240));
        btnLimpar.setBorder(borda);
        btnLimpar.addActionListener(e -> clearFunc(tela));
        tela.add(btnLimpar);

        tela.setVisible(true);
    }

    public static void confirmFunc(JFrame y) {
        for (Component x : y.getContentPane().getComponents()) {
            if (x instanceof JTextField) {
                JTextField z = (JTextField) x;

                //z.getText() == "" não funciona :(
                if (z.getText().isBlank()) {
                    JOptionPane.showMessageDialog(y, "O cadastro não foi realizado, ainda faltam informações.");
                    return;
                }
            }
        }   

        JLabel lblSenha = new JLabel("Digite a senha para prosseguir (1234): ");
        JPasswordField jpfSenha = new JPasswordField();
        JOptionPane.showConfirmDialog(null, new Object[]{lblSenha, jpfSenha}, "Verificação", JOptionPane.OK_CANCEL_OPTION);
        if (new String(jpfSenha.getPassword()).equals("1234")){
            JOptionPane.showMessageDialog(y, "O cadastro foi realizado com sucesso!");
            clearFunc(y);
        }
    }
    
    public static void deleteFunc(JFrame y) {
        JLabel lblApagarusuario = new JLabel("Digite o nome do usuario para ser apagado: ");
        JTextField txtApagarusuario = new JTextField();
        JOptionPane.showConfirmDialog(null, new Object[]{lblApagarusuario, txtApagarusuario}, "Verificação", JOptionPane.OK_CANCEL_OPTION);
        if(!txtApagarusuario.getText().isBlank()) {
            JOptionPane.showMessageDialog(y, "O Usuario foi removido do formulário");
            clearFunc(y);
        }
    }
    
    public static void clearFunc(JFrame y) {
        for (Component x : y.getContentPane().getComponents()) {
            if (x instanceof JTextField) {
                JTextField z = (JTextField) x;
                z.setText("");
            }
        }
        
    }
}
