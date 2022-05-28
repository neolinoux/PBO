import java.util.ArrayList;

public class Researcher extends Employee {
    protected int hours;
    ArrayList<Institute> institutes = new ArrayList<Institute>();
    ArrayList<Project> projects = new ArrayList<Project>();
    public String fieldStudy;

    public Researcher(int ssNO, String name, String email) {
        super.setSsNO(ssNO);
        super.setName(name);
        super.setEmail(email);
    }

    public ArrayList<Institute> getInstitutes() {
        return institutes;
    }

    public void setInstitutes(ArrayList<Institute> institutes) {
        this.institutes = institutes;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

    public void addInstitute(Institute institute) {
        institutes.add(institute);
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public String getFieldStudy() {
        return fieldStudy;
    }

    public void setFieldStudy(String fieldStudy) {
        this.fieldStudy = fieldStudy;
    }

    @Override
    public int attend() {
        // persentase mingguan
        // jam kerja/ (6 jam perhari * 5 hari perminggu) * 100%
        return (hours/6*5)*100;    
    }

    @Override
    public String position() {
        return "Researcher";
    }
    
    @Override
    public String toString() {
        return "Researcher{" + "ssNO=" + super.getSsNO() + ", name=" + super.getName() + ", email=" + super.getEmail() + '}';
    }
}
