package nomor6;

public class Customer {
    private String name,memberType;
    private boolean member = false;

    Customer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Customer[name=" + name + ",memberType=" + memberType + "] \nIs Member? " + member;
    }
}
