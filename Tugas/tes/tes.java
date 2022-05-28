class one {
    public static void print(int i) {
        System.out.println(i);
    }
}

class two extends one {
    public static void print(byte e) {
        System.out.println("e");
    }
}

class tes {
    public static void main(String[] args) {
        one one = new two();
        one.print(10);
        
    }
}