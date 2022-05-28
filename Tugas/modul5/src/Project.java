import java.sql.Date;

public class Project {
    private String name;
    private Date startingDate;
    private Date endDate;
    private int duration;
    
    Project(String name, Date startingDate, Date endDate, int duration) {
        this.name = name;
        this.startingDate = startingDate;
        this.endDate = endDate;
        this.duration = duration;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Project{" + "name=" + name + ", startingDate=" + startingDate + ", endDate=" + endDate + ", duration=" + duration + '}';
    }
}