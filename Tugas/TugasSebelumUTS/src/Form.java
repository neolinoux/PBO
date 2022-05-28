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
