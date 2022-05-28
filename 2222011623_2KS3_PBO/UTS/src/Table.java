public class Table implements Menu {
    String format;
    int shareTo;
    Table(String format, int shareTo) {
        this.format = format;
        this.shareTo = shareTo;
    }

    @Override
    public void share() {
        try {
            if (shareTo == 1) {
                if (format.equals("pdf")) {
                    System.out.println("PDF table dibagikan ke email");
                } else if (format.equals("csv")) {
                    System.out.println("CSV table dibagikan ke email");
                } else if (format.equals("gambar")) {
                    System.out.println("Gambar table dibagikan ke email");
                } else {
                    throw new Exception();
                }
            }
            else if(shareTo == 2) {
                if (format.equals("pdf")) {
                    System.out.println("PDF table dibagikan ke chat");
                } else if (format.equals("csv")) {
                    System.out.println("CSV table dibagikan ke chat");
                } else if (format.equals("gambar")) {
                    System.out.println("Gambar table dibagikan ke chat");
                } else {
                    throw new Exception();
                }
            }
            else if(shareTo == 3) {
                if (format.equals("pdf")) {
                    System.out.println("PDF table dibagikan ke media sosial");
                } else if (format.equals("csv")) {
                    System.out.println("CSV table dibagikan ke media sosial");
                } else if (format.equals("gambar")) {
                    System.out.println("Gambar table dibagikan ke media sosial");
                } else {
                    throw new Exception();
                }
            }
            else {
                throw new Exception();
            }
        }
        catch (Exception e) {
            System.out.println("Tujuan share tidak dikenali");
        }
    }

    @Override
    public void generateSharedContent() {
        try{
            if (format.equals("pdf")) {
                System.out.println("Generate tabel ke file pdf");
                format = "pdf";
            }
            if (format.equals("csv")) {
                System.out.println("Generate tabel ke file csv");
                format = "csv";
            }
            if (format.equals("gambar")) {
                System.out.println("Generate tabel ke file gambar");
                format = "gambar";
            }
        }
        catch (Exception e) {
            System.out.println("Tipe tabel tidak dikenali");
        }
    }

    @Override
    public void display() {
        System.out.println("Menampilkan daftar tabel");
    }

    @Override
    public void selectContent() {
        System.out.println("Memilih satu tabel");
    }
}
