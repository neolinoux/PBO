/*
Kelompok 05
1. Akhir Mubarok	            222011698
2. Avelia Deavy Putri Primadani	222011655
3. I Made Satria Ambara Putra	222011635
4. Mohammad Fikri Syams	        222011546
5. Randi Qodri .P	            222011549
*/
package KelLimaDPP;
import java.util.ArrayList;
import java.util.List;

public abstract class Form {
    public static List<String>errorMessages = new ArrayList<String>();
    public void addErrorMessage(String errorMessage){
        errorMessages.add(errorMessage);
    }
    
    public List<String> getErrorMessage(){
        return errorMessages;
    }
    public abstract void reset();
    public abstract boolean validate();
    public abstract void save();
}