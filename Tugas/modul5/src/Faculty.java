import java.util.ArrayList;

public class Faculty {
    private String name;
    private University university;
    private Dean dean;
    public ArrayList<Institute> institutes = new ArrayList<Institute>();
    
    public Faculty() {
    }

    public Faculty(String name, ArrayList<Institute> institutes) {
        this.name = name;
        this.institutes = institutes;
    }

    public Faculty(String name, University university, ArrayList<Institute> institutes) {
        this.name = name;
        this.university = university;
        this.institutes = institutes;
    }

    public Faculty(String name, University university, Dean dean, ArrayList<Institute> institutes) {
        this.name = name;
        this.university = university;
        this.dean = dean;
        this.institutes = institutes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public Dean getDean() {
        return dean;
    }

    public void setDean(Dean dean) {
        this.dean = dean;
    }

    public ArrayList<Institute> getInstitutes() {
        return institutes;
    }

    public void setInstitutes(ArrayList<Institute> institutes) {
        this.institutes = institutes;
    }

    public void addInstitute(Institute institute) {
        this.institutes.add(institute);
    }

    public void removeInstitute(Institute institute) {
        this.institutes.remove(institute);
    }
    
    @Override
    public String toString() {
        return "Faculty{" + "name=" + name + ", university=" + university + ", dean=" + dean + '}' + "\n" + "Institutes:" + "\n" + institutes;
    }
}
