public class Course {
    private int ID;
    private String name;
    private int durationPerWeek;

    public Course(int ID, String name, int durationPerWeek) {
        this.ID = ID;
        this.name = name;
        this.durationPerWeek = durationPerWeek;
    }

    public Course(String string, Faculty faculty) {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationPerWeek() {
        return durationPerWeek;
    }

    public void setDurationPerWeek(int durationPerWeek) {
        this.durationPerWeek = durationPerWeek;
    }

    @Override
    public String toString() {
        return "Course{" + "ID=" + ID + ", name=" + name + ", durationPerWeek=" + durationPerWeek + '}';
    }
}
