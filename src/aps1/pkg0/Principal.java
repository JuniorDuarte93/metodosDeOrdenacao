package aps1.pkg0;

import com.sun.javafx.scene.layout.region.Margins;
import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    //Variável utilidada para guardar o tempo de execução.
    private String temp = "";

    //Variável utilizada para guardar o endereço do arquivo.
    private String endFile;

    //Variável utilizada para pegar o arquivo.
    private File file;

    //Variável utilizada para armazenar a quantidade de números do arquivo (.txt).
    private int tam;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnOrdenar = new javax.swing.JButton();
        btnExcluirdaTabela = new javax.swing.JButton();
        lblTamVetor = new javax.swing.JLabel();
        lblTipoOrdenacao = new javax.swing.JLabel();
        txtTamVetor = new javax.swing.JTextField();
        cbEscolhaMetodo = new javax.swing.JComboBox<>();
        lblTempoExec = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btnInserirTabela = new javax.swing.JButton();
        btnArquivo = new javax.swing.JButton();
        lblArquivo = new javax.swing.JLabel();
        rbRandom = new javax.swing.JRadioButton();
        rbArquivo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbEscolhaDificuldade = new javax.swing.JComboBox<>();
        lbldificuldade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estrutura de Dados - Métodos de Ordenação");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOrdenar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnOrdenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/resultset_next.png"))); // NOI18N
        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 123, 30));

        btnExcluirdaTabela.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExcluirdaTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/table_delete.png"))); // NOI18N
        btnExcluirdaTabela.setText("Excluir teste selecionado");
        btnExcluirdaTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirdaTabelaActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluirdaTabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, 30));

        lblTamVetor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTamVetor.setText("Tamanho:");
        getContentPane().add(lblTamVetor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 20));

        lblTipoOrdenacao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTipoOrdenacao.setText("Ordenação por:");
        getContentPane().add(lblTipoOrdenacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 20));

        txtTamVetor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtTamVetor.setEnabled(false);
        getContentPane().add(txtTamVetor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 89, -1));

        cbEscolhaMetodo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbEscolhaMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha o método", "Quicksort", "Bubble Sort", "Merge Sort", "Select Sort", "Insertion Sort" }));
        getContentPane().add(cbEscolhaMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 165, 30));

        lblTempoExec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTempoExec.setForeground(java.awt.Color.red);
        lblTempoExec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/time.png"))); // NOI18N
        lblTempoExec.setText("Tempo de execução:");
        getContentPane().add(lblTempoExec, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, 30));

        tblTabela.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tamanho do vetor", "Tipo de ordenação", "Dificuldade", "Tempo"
            }
        ));
        jScrollPane2.setViewportView(tblTabela);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 660, 195));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 680, 10));

        btnInserirTabela.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnInserirTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/table_add.png"))); // NOI18N
        btnInserirTabela.setText("Inserir teste na tabela");
        btnInserirTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirTabelaActionPerformed(evt);
            }
        });
        getContentPane().add(btnInserirTabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 30));

        btnArquivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/folder_explore.png"))); // NOI18N
        btnArquivo.setEnabled(false);
        btnArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArquivoActionPerformed(evt);
            }
        });
        getContentPane().add(btnArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 55, 60, 30));

        lblArquivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblArquivo.setText(".txt");
        getContentPane().add(lblArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 250, 30));

        rbRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRandomActionPerformed(evt);
            }
        });
        getContentPane().add(rbRandom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, -1, 29));

        rbArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbArquivoActionPerformed(evt);
            }
        });
        getContentPane().add(rbArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 55, -1, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Gere números aleatórios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 21, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Escolha um arquivo (.txt)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        cbEscolhaDificuldade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbEscolhaDificuldade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha a dificuldade", "Aleatória", "Difícil (vetor de trás para frente)" }));
        getContentPane().add(cbEscolhaDificuldade, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 270, 30));

        lbldificuldade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbldificuldade.setText("Dificuldade:");
        getContentPane().add(lbldificuldade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        try {

            //Vetor que será utilizado para para ordernar os números.
            int[] vetor;

            //Verifica se os botões rádio não estão selecionados.
            if (!rbArquivo.isSelected() && !rbRandom.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecione uma forma de ordenação através de números aleatórios ou escolha um arquivo (.txt)");
            }

            //Verifica se o botão rádio para gerar números aleatórios está selecionado.
            if (rbRandom.isSelected()) {

                //Verifica se o usuário determinou o tamanho do vetor e escolheu o método de ordenação.
                if (txtTamVetor.getText().equals("") || cbEscolhaMetodo.getSelectedItem().toString().equals("Escolha o método")) {
                    JOptionPane.showMessageDialog(this, "Determine o tamanho do vetor e escolha o método de ordenação! ");
                } else {

                    //Determina que o tamanho do vetor será o informado pelo usuário.
                    vetor = new int[Integer.parseInt(txtTamVetor.getText())];

                    //Instancia o Random.
                    Random r = new Random();

                    //Gerando o vetor random desordenado.
                    for (int i = 0; i < vetor.length; i++) {
                        vetor[i] = r.nextInt(100000);
                    }

                    //Verifica se o usuário escolheu a dificuldade.
                    if (cbEscolhaDificuldade.getSelectedItem().toString().equals("Escolha a dificuldade")) {
                        JOptionPane.showMessageDialog(this, "Determine a dificuldade da ordenação! ");
                    } else {
                        escolhaDificuldade(vetor);
                    }
                }

            }

            //Verifica se o botão rádio para escolher um arquivo está selecionado.
            if (rbArquivo.isSelected()) {

                //Verifica se o usuário escolheu o arquivo e o método de ordenação.
                if (lblArquivo.getText().equals(".txt") || cbEscolhaMetodo.getSelectedItem().toString().equals("Escolha o método")) {
                    JOptionPane.showMessageDialog(this, "Escolha o arquivo (.txt) e o tipo de ordenação! ");
                } else {

                    //Instancia um ArrayList, para mais adiante ser inseridos as linhas do arquivo (.txt).
                    ArrayList lista = new ArrayList();

                    //Instancia o leitor do arquivo (.txt).
                    BufferedReader in = new BufferedReader(new FileReader(endFile));

                    //Variável que será utilizada para receber cada linha do arquivo (.txt).
                    String linha;

                    //Variável que será utilizada para contar a quantidade de linhas do aquivo.
                    int d = 0;

                    //Enquanto estiver dados para serem lidos no arquivo.
                    while (in.ready()) {

                        //Variável linha recebe o conteúdo da linha
                        linha = in.readLine();

                        //Se a linha estiver vazia encerra a estrutura de repetição (while).
                        if (linha.equals("")) {
                            break;
                        }

                        //Contando a quantidade de linhas do aquivo.
                        d++;

                        //Adicionando o conteúdo na linha no ArrayList
                        lista.add(linha);
                    }

                    //Encerra a leitura do arquivo.
                    in.close();

                    //Zera a variável tam, para evitar que ela fique com algum valor anterior.
                    tam = 0;

                    //Recebe a quantidade de linhas (números) que contém o arquivo (txt).
                    tam = d;

                    //Determina que o tamamho do vetor será de acordo com a quantidade de linhas do aquivo (txt).
                    vetor = new int[d];

                    //Passa tudo que estiver no ArrayList para o vetor.
                    for (int i = 0; i < lista.size(); i++) {
                        vetor[i] = Integer.parseInt(lista.get(i).toString());
                    }

                    ///Verifica se o usuário escolheu a dificuldade.
                    if (cbEscolhaDificuldade.getSelectedItem().toString().equals("Escolha a dificuldade")) {
                        JOptionPane.showMessageDialog(this, "Determine a dificuldade da ordenação! ");
                    } else {
                        escolhaDificuldade(vetor);
                    }

                }

            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Erro:" + erro.getMessage());
        }

    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnInserirTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirTabelaActionPerformed
        //Verifica se a ordenação foi feita, através da variável temp.
        if ("".equals(temp)) {
            JOptionPane.showMessageDialog(this, "Antes de inserir na tabela, por favor, faça a ordenação!");
        } else if (rbRandom.isSelected()) {
            insereTabela(txtTamVetor.getText(), cbEscolhaMetodo.getSelectedItem().toString(), cbEscolhaDificuldade.getSelectedItem().toString(), temp);
            txtTamVetor.setText("");
            lblTempoExec.setText("Tempo de execução:");
            temp = "";
            cbEscolhaMetodo.setSelectedIndex(0);
            cbEscolhaDificuldade.setSelectedIndex(0);
            rbRandom.setSelected(false);
            txtTamVetor.setEnabled(false);

        } else if (rbArquivo.isSelected()) {
            insereTabela(txtTamVetor.getText(), cbEscolhaMetodo.getSelectedItem().toString(), cbEscolhaDificuldade.getSelectedItem().toString(), temp);
            txtTamVetor.setText("");
            lblTempoExec.setText("Tempo de execução:");
            temp = "";
            cbEscolhaMetodo.setSelectedIndex(0);
            cbEscolhaDificuldade.setSelectedIndex(0);
            rbArquivo.setSelected(false);
            btnArquivo.setEnabled(false);
        }
    }//GEN-LAST:event_btnInserirTabelaActionPerformed

    private void btnExcluirdaTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirdaTabelaActionPerformed
        //Exclui a linha selecionada na tabela.
        ((DefaultTableModel) tblTabela.getModel()).removeRow(tblTabela.getSelectedRow());
    }//GEN-LAST:event_btnExcluirdaTabelaActionPerformed

    private void btnArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArquivoActionPerformed

        try {
            //Instanciando um seletor de aquivos.
            JFileChooser buscarArquivo = new JFileChooser();

            //Determinando o título do seletor de aquivos.
            buscarArquivo.setDialogTitle("Buscar Arquivos");

            //Determinando que só vai aparecer aquivos.
            buscarArquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);

            //Determinando as extensões que devem aparecer.
            FileNameExtensionFilter filter = new FileNameExtensionFilter("arquivo", "txt");

            //Atribuindo o filtro ao seletor de arquivos.
            buscarArquivo.setFileFilter(filter);

            //Apresentando o seletor de arquivos.
            int retorno = buscarArquivo.showOpenDialog(this);

            //Capturando o nome do aquivo selecionado.
            String arquivo = "" + buscarArquivo.getSelectedFile().getName();

            //Apresentando o nome do arquivo selectinado na label.
            lblArquivo.setText(arquivo);

            //Verificando se o aquivo foi escolhido.
            if (retorno == JFileChooser.APPROVE_OPTION) {

                //Capturando o arquivo selecionado
                file = buscarArquivo.getSelectedFile();

                //Capturando o endereço do aquivo.
                endFile = file.getPath();
            }

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(this, "Não foi possível carregar o arquivo!" + erro.getMessage());
        }

    }//GEN-LAST:event_btnArquivoActionPerformed

    private void rbRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRandomActionPerformed

        txtTamVetor.setEnabled(true);
        btnArquivo.setEnabled(false);
        rbArquivo.setSelected(false);
        txtTamVetor.requestFocus();
    }//GEN-LAST:event_rbRandomActionPerformed

    private void rbArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbArquivoActionPerformed
        txtTamVetor.setEnabled(false);
        txtTamVetor.setText("");
        rbRandom.setSelected(false);
        btnArquivo.setEnabled(true);
    }//GEN-LAST:event_rbArquivoActionPerformed

    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArquivo;
    private javax.swing.JButton btnExcluirdaTabela;
    private javax.swing.JButton btnInserirTabela;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbEscolhaDificuldade;
    private javax.swing.JComboBox<String> cbEscolhaMetodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblArquivo;
    private javax.swing.JLabel lblTamVetor;
    private javax.swing.JLabel lblTempoExec;
    private javax.swing.JLabel lblTipoOrdenacao;
    private javax.swing.JLabel lbldificuldade;
    private javax.swing.JRadioButton rbArquivo;
    private javax.swing.JRadioButton rbRandom;
    private javax.swing.JTable tblTabela;
    public static javax.swing.JTextField txtTamVetor;
    // End of variables declaration//GEN-END:variables

    public void quickSort(int v[], int esquerda, int direita) {
        int esq = esquerda;
        int dir = direita;
        int pivo = v[(esq + dir) / 2];
        int troca;
        while (esq <= dir) {
            while (v[esq] < pivo) {
                esq = esq + 1;
            }
            while (v[dir] > pivo) {
                dir = dir - 1;
            }
            if (esq <= dir) {
                troca = v[esq];
                v[esq] = v[dir];
                v[dir] = troca;
                esq = esq + 1;
                dir = dir - 1;
            }
        }
        if (dir > esquerda) {
            quickSort(v, esquerda, dir);
        }
        if (esq < direita) {
            quickSort(v, esq, direita);
        }
    }

    public void selecao(int v[], int tam) {
        int menor, posmenor;
        for (int i = 0; i < tam; i++) {
            menor = v[i];
            posmenor = i;
            for (int j = i + 1; j < tam; j++) {
                if (v[j] < menor) {
                    menor = v[j];
                    posmenor = j;
                }
            }
            v[posmenor] = v[i];
            v[i] = menor;
        }
    }

    public void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(array, low, middle);
            mergeSort(array, middle + 1, high);
            merge(array, low, middle, high);
        }
    }

    public void merge(int[] array, int low, int middle, int high) {
        int[] helper = new int[array.length];
        for (int i = low; i <= high; i++) {
            helper[i] = array[i];
        }

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        while (helperLeft <= middle && helperRight <= high) {
            if (helper[helperLeft] <= helper[helperRight]) {
                array[current] = helper[helperLeft];
                helperLeft++;

            } else {
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining; i++) {
            array[current + i] = helper[helperLeft + i];
        }
    }

    public void bolha(int v[], int tam) {
        int aux;
        boolean troca;
        int j = tam - 1;
        do {
            troca = false;
            for (int i = 0; i < j; i++) {
                if (v[i] > v[i + 1]) {
                    aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
                    troca = true;
                }
            }
            j--;
        } while (troca);
    }

    public void ins_direta(int v[], int tam) {
        int aux;
        for (int i = 1; i < tam; i++) {
            aux = v[i];
            int j = i - 1;
            while ((j >= 0) && (aux < v[j])) {
                v[j + 1] = v[j]; // deslocando
                j--;
            }
            v[j + 1] = aux; // inserindo
        }
    }

    public void insereTabela(String tam, String tipo, String dificuldade, String temp) {
        DefaultTableModel val = (DefaultTableModel) tblTabela.getModel();
        val.addRow(new String[]{tam, tipo, dificuldade, temp});
    }

    public void escolhaDificuldade(int[] vetor) {
        int[] vetorAux = new int[vetor.length];

        switch (cbEscolhaDificuldade.getSelectedItem().toString()) {

            case "Aleatória":
                //Imprimindo o vetor random desordenado no console.
                System.out.println("------------- VETOR RANDOM DESORDENADO ------------------");
                for (int i = 0; i < vetor.length; i++) {
                    System.out.println(vetor[i]);
                }

                //Chama o método para ser feito a ordenação do vetor conforme foi informado pelo usuário.
                escolhaTipoOrdenacao(vetor);
                break;

            case "Difícil (vetor de trás para frente)":

                //Imprimindo o vetor random original desordenado no console.
                System.out.println("------------- VETOR RANDOM (ORIGINAL) DESORDENADO ------------------");
                for (int i = 0; i < vetor.length; i++) {
                    System.out.println(vetor[i]);
                }

                //Faz a ordenação do vetor original para em seguida passar para o vetor auxiliar de trás para frente.
                quickSort(vetor, 0, vetor.length - 1);

                //Passa os valores do vetor random original para o vetor auxiliar de trás para frente e os imprimi no console.
                System.out.println("------------- VETOR RANDOM ORDENADO DE TRÁS PARA FRENTE ------------------");
                for (int i = vetor.length - 1; i >= 0; i--) {
                    vetorAux[i] = vetor[i];
                    System.out.println(vetorAux[i]);
                }

                //Chama o método para ser feito a ordenação do vetor conforme foi informado pelo usuário.
                //Passa o vetor auxiliar para o método (ordenado de trás para frente).
                escolhaTipoOrdenacao(vetorAux);
                break;
        }
    }

    public void escolhaTipoOrdenacao(int[] vetor) {

        //Variáveis para calcular o tempo de execução.
        long tempoInicial;
        long tempoFinal;
        long tempoExec;

        //Verificando o que está selecionado no comboBox (tipo de ordenação).
        switch (cbEscolhaMetodo.getSelectedItem().toString()) {

            case "Quicksort":

                System.out.println("------------- ORDENADO PELO MÉTODO QUICKSORT ----------------");

                //Capturando o tempo inicial da excução da ordenação.
                tempoInicial = System.currentTimeMillis();

                //Ordenando o vetor pelo método QuickSort.
                quickSort(vetor, 0, vetor.length - 1);

                //Capturando o tempo final da excução da ordenação.
                tempoFinal = System.currentTimeMillis();

                //imprimindo o vetor ordenado no console.
                for (int i = 0; i < vetor.length; i++) {
                    System.out.println(" " + vetor[i]);
                }

                //Calculando o tempo de execução da ordenação.
                tempoExec = (tempoInicial - tempoFinal);

                //Imprimindo o tempo de execução no console.
                System.out.println(String.format("Tempo de execução: %02d segundos e %02d milisegundos", ((tempoExec / 1000) * -1), ((tempoExec % 1000) * -1)));

                //Imprimindo o tempo de execução na label.
                lblTempoExec.setText(String.format("Tempo de execução: %02d segundos e %02d milisegundos", ((tempoExec / 1000) * -1), ((tempoExec % 1000) * -1)));

                //Formatando o tempo para ser inserido na tabela
                temp = (String.format("%02ds e %02dms", ((tempoExec / 1000) * -1), ((tempoExec % 1000) * -1)));

                break;

            case "Bubble Sort":

                System.out.println("------------- ORDENADO PELO MÉTODO BUBBLE SORT ----------------");

                //Capturando o tempo inicial da excução da ordenação.
                tempoInicial = System.currentTimeMillis();

                //Ordenando o vetor pelo método BubbleSort.
                bolha(vetor, vetor.length);

                //Capturando o tempo final da excução da ordenação.
                tempoFinal = System.currentTimeMillis();

                //imprimindo o vetor ordenado no console.
                for (int i = 0; i < vetor.length; i++) {
                    System.out.println(" " + vetor[i]);
                }

                //Calculando o tempo de execução da ordenação.
                tempoExec = (tempoInicial - tempoFinal);

                //Imprimindo o tempo de execução no console.
                System.out.println(String.format("Tempo de execução: %02d segundos e %02d milisegundos", ((tempoExec / 1000) * -1), ((tempoExec % 1000) * -1)));

                //Imprimindo o tempo de execução na label.
                lblTempoExec.setText(String.format("Tempo de execução: %02d segundos e %02d milisegundos", ((tempoExec / 1000) * -1), ((tempoExec % 1000) * -1)));

                //Formatando o tempo para ser inserido na tabela
                temp = (String.format("%02ds e %02dms", ((tempoExec / 1000) * -1), ((tempoExec % 1000) * -1)));

                break;

            case "Merge Sort":

                System.out.println("------------- ORDENADO PELO MÉTODO MERGE SORT----------------");

                //Capturando o tempo inicial da excução da ordenação.
                tempoInicial = System.currentTimeMillis();

                //Ordenando o vetor pelo método Merge Sort.
                mergeSort(vetor, 0, vetor.length - 1);

                //Capturando o tempo final da excução da ordenação.
                tempoFinal = System.currentTimeMillis();

                //imprimindo o vetor ordenado no console.
                for (int i = 0; i < vetor.length; i++) {
                    System.out.println(" " + vetor[i]);
                }

                //Calculando o tempo de execução da ordenação.
                tempoExec = (tempoInicial - tempoFinal);

                //Imprimindo o tempo de execução no console.
                System.out.println(String.format("Tempo de execução: %02d segundos e %02d milisegundos", ((tempoExec / 1000) * -1), ((tempoExec % 1000) * -1)));

                //Imprimindo o tempo de execução na label.
                lblTempoExec.setText(String.format("Tempo de execução: %02d segundos e %02d milisegundos", ((tempoExec / 1000) * -1), ((tempoExec % 1000) * -1)));

                //Formatando o tempo para ser inserido na tabela
                temp = (String.format("%02ds e %02dms", ((tempoExec / 1000) * -1), ((tempoExec % 1000) * -1)));

                break;

            case "Select Sort":

                System.out.println("------------- ORDENADO PELO MÉTODO SELECT SORT ----------------");

                //Capturando o tempo inicial da excução da ordenação.
                tempoInicial = System.currentTimeMillis();

                //Ordenando o vetor pelo método select sort.
                selecao(vetor, vetor.length);

                //Capturando o tempo final da excução da ordenação.
                tempoFinal = System.currentTimeMillis();

                //imprimindo o vetor ordenado no console.
                for (int i = 0; i < vetor.length; i++) {
                    System.out.println(" " + vetor[i]);
                }

                //Calculando o tempo de execução da ordenação.
                tempoExec = (tempoInicial - tempoFinal);

                //Imprimindo o tempo de execução no console.
                System.out.println(String.format("Tempo de execução: %02d segundos e %02d milisegundos", ((tempoExec / 1000) * -1), ((tempoExec % 1000) * -1)));

                //Imprimindo o tempo de execução na label.
                lblTempoExec.setText(String.format("Tempo de execução: %02d segundos e %02d milisegundos", ((tempoExec / 1000) * -1), ((tempoExec % 1000) * -1)));

                //Formatando o tempo para ser inserido na tabela
                temp = (String.format("%02ds e %02dms", ((tempoExec / 1000) * -1), ((tempoExec % 1000) * -1)));

                break;

            case "Insertion Sort":

                System.out.println("------------- ORDENADO PELO MÉTODO INSERTION SORT ----------------");

                //Capturando o tempo inicial da excução da ordenação.
                tempoInicial = System.currentTimeMillis();

                //Ordenando o vetor pelo método insertion sort.
                ins_direta(vetor, vetor.length);

                //Capturando o tempo final da excução da ordenação.
                tempoFinal = System.currentTimeMillis();

                //imprimindo o vetor ordenado no console.
                for (int i = 0; i < vetor.length; i++) {
                    System.out.println(" " + vetor[i]);
                }

                //Calculando o tempo de execução da ordenação.
                tempoExec = (tempoInicial - tempoFinal);

                //Imprimindo o tempo de execução no console.
                System.out.println(String.format("Tempo de execução: %02d segundos e %02d milisegundos", ((tempoExec / 1000) * -1), ((tempoExec % 1000) * -1)));

                //Imprimindo o tempo de execução na label.
                lblTempoExec.setText(String.format("Tempo de execução: %02d segundos e %02d milisegundos", ((tempoExec / 1000) * -1), ((tempoExec % 1000) * -1)));

                //Formatando o tempo para ser inserido na tabela
                temp = (String.format("%02ds e %02dms", ((tempoExec / 1000) * -1), ((tempoExec % 1000) * -1)));

                break;
        }

    }

}
