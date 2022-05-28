public abstract class Employee implements Attendance {
    private int ssNO;
    private String name;
    private String email;


    public int getSsNO() {
        return ssNO;
    }

    public void setSsNO(int ssNO) {
        this.ssNO = ssNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
        
    public void setEmail(String email) {
        this.email = email;
    }


    public abstract int attend();
    

    public abstract String position();

    @Override
    public String toString() {
        return "Employee{" + "email=" + email + ", name=" + name + ", ssNO=" + ssNO + '}';
    }
}
