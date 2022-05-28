package kellimadpp;
/**
 * Anggota Kelompok 5 2KS3:
 * Pandya Almastiana Alifka 222011620
 * Moch. Daffa' AlFaris     222011622
 * Rahmad Setiya Budi       222011623
 * Amanda Christina Saragih 222011650
 * Nur Aini Adilah          222011676
 */

import java.util.ArrayList;

public abstract class Form {
    ArrayList<String> errorMessage = new ArrayList<String>();

    public Boolean validate() {
        return errorMessage.isEmpty();
    }

    public Boolean save() {
        return null;

    }

    public void print() {

    }

    public void reset() {

    }

    public ArrayList<String> getErrorMessage() {
        return errorMessage;
    }
    
    public void addErrorMessage(String errorMessage) {
        this.errorMessage.add(errorMessage);
    }
}
