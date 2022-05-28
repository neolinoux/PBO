import java.util.List;

import javax.swing.JOptionPane;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void saveModel() {
        String identitas[] = new String[4];

        identitas[0] = view.getTextFieldNim().getText();
        identitas[1] = view.getTextFieldNama().getText();
        identitas[2] = view.getTextFieldUmur().getText();
        identitas[3] = view.getComboBox().getSelectedItem().toString();

        if (identitas[0].length() == 6) {
            model.setNim(identitas[0]);
        } else if (identitas[0].length() == 0) {
            model.addErrorMessage("Nim tidak boleh kosong");
        } else {
            model.addErrorMessage("Nim  harus 6 digit");
        }

        if (identitas[1].length() > 0) {
            if (identitas[1].length() < 50) {
                model.setNama(identitas[1]);
            } else {
                model.addErrorMessage("Nama maksimal 50 digit");
            }
        } else {
            model.addErrorMessage("Nama tidak boleh kosong");
        }

        if (identitas[2].length() > 0) {
            try {
                int umur = Integer.parseInt(identitas[2]);
                model.setUmur(umur);
            } catch (NumberFormatException e) {
                model.addErrorMessage("Umur harus berupa angka");
            }
        } else {
            model.addErrorMessage("Umur tidak boleh kosong");
        }

        model.setAsal((view.getComboBox().getSelectedItem().toString()));

        List<String> errors = model.getErrorMessages();
        if (model.getErrorMessages().size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (String errorMessage : errors) {
                sb.append(errorMessage).append("\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString(), "Terjadi kesalahan input pada : ",
                    JOptionPane.ERROR_MESSAGE);
            sb = null;
            model.clearErrorMessages();
        } else {
            model.addMahasiswa(model.toString());
            List<String> daftarMahasiswa = model.getDaftarMahasiswa();
            StringBuilder sb = new StringBuilder();
            for (String mahasiswa : daftarMahasiswa) {
                sb.append(mahasiswa).append("\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString(),
                    "Daftar NIM dan Nama Mahasiswa yang telah berhasil disimpan :", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void run() {
        this.model.clearErrorMessages();
        view.getButtonSimpan().addActionListener(e -> saveModel());
        view.getButtonReset().addActionListener(e -> reset());
    }

    public void reset() {
        view.getTextFieldNim().setText(null);
        view.getTextFieldNama().setText(null);
        view.getTextFieldUmur().setText(null);
        view.getComboBox().setSelectedIndex(0);
    }

}
