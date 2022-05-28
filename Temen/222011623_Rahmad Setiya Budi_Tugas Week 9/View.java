
// import swing
import javax.swing.*;

//import awt
import java.awt.*;

public class View {
    JFrame frame = new JFrame("StudentForm");
    JPanel panel = new JPanel();
    JLabel labelNim = new JLabel(" NIM :  ");
    JLabel labelNama = new JLabel(" Nama : ");
    JLabel labelUmur = new JLabel(" Umur : ");
    JLabel labelAsal = new JLabel(" Asal : ");
    JComboBox comboBox = new JComboBox(
            new String[] { "Kalimantan Tengah", "Aceh", "DKI Jakarta", "Jawa Timur", "Bali", "Maluku", "Papua" });
    JButton buttonReset = new JButton("Reset");
    JButton buttonSimpan = new JButton("Simpan");
    JTextField textFieldNim = new JTextField(6);
    JTextField textFieldNama = new JTextField(24);
    JTextField textFieldUmur = new JTextField(2);

    public View() {
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        Container pane = frame.getContentPane();
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(labelNim, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        c.insets = new Insets(0, 150, 0, 75);
        pane.add(textFieldNim, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 0, 0);
        c.gridx = 0;
        c.gridy = 1;
        pane.add(labelNama, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 75, 0, 0);
        c.gridx = 1;
        c.gridy = 1;
        pane.add(textFieldNama, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 0, 0);
        c.gridx = 0;
        c.gridy = 2;
        pane.add(labelUmur, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 225, 0, 75);
        c.gridx = 1;
        c.gridy = 2;
        pane.add(textFieldUmur, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 3;
        c.insets = new Insets(0, 0, 0, 0);
        pane.add(labelAsal, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 3;
        c.insets = new Insets(0, 100, 0, 75);
        pane.add(comboBox, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 4;
        c.ipadx = 175;
        c.insets = new Insets(20, 5, 5, 0);
        pane.add(buttonReset, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 4;
        c.gridwidth = 1;
        c.insets = new Insets(20, 0, 5, 75);
        pane.add(buttonSimpan, c);

        frame.pack();
    }

    public JFrame getFrame() {
        return this.frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JPanel getPanel() {
        return this.panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getLabelNim() {
        return this.labelNim;
    }

    public void setLabelNim(JLabel labelNim) {
        this.labelNim = labelNim;
    }

    public JLabel getLabelNama() {
        return this.labelNama;
    }

    public void setLabelNama(JLabel labelNama) {
        this.labelNama = labelNama;
    }

    public JLabel getLabelUmur() {
        return this.labelUmur;
    }

    public void setLabelUmur(JLabel labelUmur) {
        this.labelUmur = labelUmur;
    }

    public JLabel getLabelAsal() {
        return this.labelAsal;
    }

    public void setLabelAsal(JLabel labelAsal) {
        this.labelAsal = labelAsal;
    }

    public JComboBox getComboBox() {
        return this.comboBox;
    }

    public void setComboBox(JComboBox comboBox) {
        this.comboBox = comboBox;
    }

    public JButton getButtonReset() {
        return this.buttonReset;
    }

    public void setButtonReset(JButton buttonReset) {
        this.buttonReset = buttonReset;
    }

    public JButton getButtonSimpan() {
        return this.buttonSimpan;
    }

    public void setButtonSimpan(JButton buttonSimpan) {
        this.buttonSimpan = buttonSimpan;
    }

    public JTextField getTextFieldNim() {
        return this.textFieldNim;
    }

    public void setTextFieldNim(JTextField textFieldNim) {
        this.textFieldNim = textFieldNim;
    }

    public JTextField getTextFieldNama() {
        return this.textFieldNama;
    }

    public void setTextFieldNama(JTextField textFieldNama) {
        this.textFieldNama = textFieldNama;
    }

    public JTextField getTextFieldUmur() {
        return this.textFieldUmur;
    }

    public void setTextFieldUmur(JTextField textFieldUmur) {
        this.textFieldUmur = textFieldUmur;
    }

    public View frame(JFrame frame) {
        setFrame(frame);
        return this;
    }

    public View panel(JPanel panel) {
        setPanel(panel);
        return this;
    }

    public View labelNim(JLabel labelNim) {
        setLabelNim(labelNim);
        return this;
    }

    public View labelNama(JLabel labelNama) {
        setLabelNama(labelNama);
        return this;
    }

    public View labelUmur(JLabel labelUmur) {
        setLabelUmur(labelUmur);
        return this;
    }

    public View labelAsal(JLabel labelAsal) {
        setLabelAsal(labelAsal);
        return this;
    }

    public View comboBox(JComboBox comboBox) {
        setComboBox(comboBox);
        return this;
    }

    public View buttonReset(JButton buttonReset) {
        setButtonReset(buttonReset);
        return this;
    }

    public View buttonSimpan(JButton buttonSimpan) {
        setButtonSimpan(buttonSimpan);
        return this;
    }

    public View textFieldNim(JTextField textFieldNim) {
        setTextFieldNim(textFieldNim);
        return this;
    }

    public View textFieldNama(JTextField textFieldNama) {
        setTextFieldNama(textFieldNama);
        return this;
    }

    public View textFieldUmur(JTextField textFieldUmur) {
        setTextFieldUmur(textFieldUmur);
        return this;
    }

}
