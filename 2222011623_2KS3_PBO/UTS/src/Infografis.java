public class Infografis implements Menu {
    String format;
    int shareTo;
    Infografis(String format, int shareTo) {
        this.format = format;
        this.shareTo = shareTo;
    }

    @Override
    public void share() {
        try {
            if (shareTo == 1) {
                if (format.equals("pdf")) {
                    System.out.println("PDF infografis dibagikan ke email");
                } else if (format.equals("gambar")) {
                    System.out.println("Gambar infografis dibagikan ke email");
                } else {
                    throw new Exception();
                }
            }
            else if (shareTo == 2) {
                if (format.equals("pdf")) {
                    System.out.println("PDF infografis dibagikan ke chat");
                } else if (format.equals("gambar")) {
                    System.out.println("Gambar infografis dibagikan ke chat");
                }else{
                    throw new Exception();
                }
            }
            else if (shareTo == 3) {
                if (format.equals("pdf")) {
                    System.out.println("PDF infografis dibagikan ke media sosial");
                } else if (format.equals("gambar")) {
                    System.out.println("Gambar infografis dibagikan ke media sosial");
                }
                else {
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
                System.out.println("Generate infografis ke file pdf");
                format = "pdf";
            }
            else if (format.equals("gambar")) {
                System.out.println("Generate infografis ke file gambar");
                format = "gambar";
            }
            else {
                throw new Exception();
            }
        }
        catch (Exception e) {
            System.out.println("Tipe infografis tidak dikenali");
        }
    }

    @Override
    public void display() {
        System.out.println("Menampilkan daftar infografis");
    }

    @Override
    public void selectContent() {
        System.out.println("Memilih satu infografis");
    }
}
