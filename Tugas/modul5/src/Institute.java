public class Institute {
    private String name;
    private Address address;

    public Institute() {
    }

    public Institute(String name) {
        this.name = name;
    }

    public Institute(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    
    @Override
    public String toString() {
        return "Institute{" + "name=" + name + ", address=" + address + '}';
    }
}
