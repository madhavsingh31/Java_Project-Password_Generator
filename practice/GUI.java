package practice;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

@SuppressWarnings("serial")
public class GUI extends JPanel implements ActionListener {

    private static final String UPPERCASE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE_CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMERIC_CHARACTERS = "1234567890";
    private static final String SPECIAL_CHARACTERS = "~!@#$%^&*()_|";

    /**
     *  Launches GUI.
     *  Creates and configures JFrame, adds panel (represented by this class).
     */
    public void createAndShowGUI() {
        initComponents();
        JFrame frame = new JFrame("Password Generator");
        //frame.setMinimumSize(new Dimension(FRAME_MIN_WIDTH, FRAME_MIN_HEIGHT));
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        btnGenerate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        passwordField = new javax.swing.JTextArea();
        useAlphanumeric = new javax.swing.JCheckBox();
        useSpecialChars = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        useLowerAlphabet = new javax.swing.JCheckBox();
        jSlider1 = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        numberOfCharacters = new javax.swing.JLabel();
        useUpperAlphabet = new javax.swing.JCheckBox();

        btnGenerate.setMnemonic('\r');
        btnGenerate.setText("generate password");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        jButton2.setText("copy to clipboard");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyToClipboard(evt);
            }
        });

        passwordField.setColumns(20);
        passwordField.setRows(5);
        jScrollPane1.setViewportView(passwordField);

        useAlphanumeric.setSelected(true);
        useAlphanumeric.setText("1-9");

        useSpecialChars.setSelected(true);
        useSpecialChars.setText("special chars (~!@#$&*)");

        jLabel1.setText(" Select the check box  ");

        useLowerAlphabet.setSelected(true);
        useLowerAlphabet.setText("a-z");

        jSlider1.setMajorTickSpacing(3);
        jSlider1.setMaximum(30);
        jSlider1.setMinimum(5);
        jSlider1.setMinorTickSpacing(1);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(8);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStateChanged(evt);
            }
        });

        jLabel2.setText(" No. of Characters.. ");

        numberOfCharacters.setText("8");

        useUpperAlphabet.setSelected(true);
        useUpperAlphabet.setText("A-Z");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(useSpecialChars)
                            .addComponent(useAlphanumeric))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(useLowerAlphabet)
                                    .addComponent(numberOfCharacters, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(useUpperAlphabet)
                                .addGap(117, 117, 121))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel2)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(useAlphanumeric)
                    .addComponent(useUpperAlphabet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(useSpecialChars)
                    .addComponent(useLowerAlphabet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numberOfCharacters)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>                        

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String charactersToBeUsed = "";
        
        if (useUpperAlphabet.isSelected()) {
        charactersToBeUsed += UPPERCASE_CHARACTERS; // always
        }
        
        if (useLowerAlphabet.isSelected()) {
            charactersToBeUsed += LOWERCASE_CHARACTERS;
        }
        if (useAlphanumeric.isSelected()) {
            charactersToBeUsed += NUMERIC_CHARACTERS;
        }
        if (useSpecialChars.isSelected()) {
            charactersToBeUsed += SPECIAL_CHARACTERS;
        }
        PasswordGenerator pg = new PasswordGenerator(charactersToBeUsed);
        int numberOfChars = Integer.parseInt(numberOfCharacters.getText());

        String pw = pg.generate(numberOfChars);

        passwordField.setEditable(false);
        passwordField.setText(pw);
    }                                           

    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {                                    
        JSlider source = (JSlider) evt.getSource();
        if (!source.getValueIsAdjusting()) {
            numberOfCharacters.setText(Integer.toString(source.getValue()));
        }
    }                                   

    private void copyToClipboard(java.awt.event.ActionEvent evt) {                                 
        String myString = passwordField.getText();
        StringSelection stringSelection = new StringSelection (myString);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard ();
        clpbrd.setContents (stringSelection, null);
    }                                


    // Variables declaration - do not modify                     
    private javax.swing.JButton btnGenerate;
    public javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.ButtonGroup buttonGroup2;
    public javax.swing.ButtonGroup buttonGroup3;
    public javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JSlider jSlider1;
    private javax.swing.JLabel numberOfCharacters;
    public static javax.swing.JTextArea passwordField;
    public static javax.swing.JCheckBox useAlphanumeric;
    public static javax.swing.JCheckBox useLowerAlphabet;
    public static javax.swing.JCheckBox useSpecialChars;
    public static javax.swing.JCheckBox useUpperAlphabet;
    // End of variables declaration                   


    
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}