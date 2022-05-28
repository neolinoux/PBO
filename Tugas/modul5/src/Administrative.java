public class Administrative extends Employee {
    protected int totalDayAttendsPerWeek;

    public Administrative(int ssNO, String name, String email) {
        super.setSsNO(ssNO);
        super.setName(name);
        super.setEmail(email);
    }

    @Override
    public int attend() {
        // persentase mingguan
        // jumlah hari masuk kerja/ 5 hari kerja * 100%
		return (totalDayAttendsPerWeek/5)*100;
    }   
    
    @Override   
    public String position() {
        return "Administrative";
    }
    
    @Override
    public String toString() {
        return "Administrative{" + "ssNO=" + super.getSsNO() + ", name=" + super.getName() + ", email=" + super.getEmail() + '}';
    }
}
