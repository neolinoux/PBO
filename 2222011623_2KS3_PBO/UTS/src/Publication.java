public class Publication implements Menu {
    String format;
    int shareTo;
    Publication(String format, int shareTo) {
        this.format = format;
        this.shareTo = shareTo;
    }

    @Override
    public void share() {
        try {
            if (shareTo == 1) {
                System.out.println("PDF publikasi dibagikan ke email");
            }
            else if (shareTo == 2) {
                System.out.println("PDF publikasi dibagikan ke chat");
            }
            else if (shareTo == 3) {
                System.out.println("PDF publikasi dibagikan ke media sosial");
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
        try {
            if (format.equals("pdf")) {
                System.out.println("Mendapatkan file pdf publikasi terpilih");
            }
            else {
                throw new Exception();
            }
        }
        catch (Exception e) {
            System.out.println("Tipe publikasi tidak dikenali");
        }
    }

    @Override
    public void display() {
        System.out.println("Menampilkan daftar publikasi");
    }

    @Override
    public void selectContent() {
        System.out.println("Satu publikasi dipilih");
    }
}
