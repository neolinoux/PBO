public class Dean extends Employee {
    public Dean(int ssNO, String name, String email) {
        super.setSsNO(ssNO);
        super.setName(name);
        super.setEmail(email);
    }

    @Override
    public int attend() {
        return 0;
    }

    @Override
    public String position() {
        return "Dean";
    }
    
    @Override
    public String toString() {
        return "Dean{" + "ssNO=" + super.getSsNO() + ", name=" + super.getName() + ", email=" + super.getEmail() + '}';
    }
}
