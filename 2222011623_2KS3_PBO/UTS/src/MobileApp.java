import java.util.Scanner;

public class MobileApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan konten yang ingin dibagikan (publication/table/infografis): ");
        String contentType = in.nextLine();
        //System.out.println(contentType);
        System.out.print("Bagikan ke: \n1. Email\n2. Chat\n3. Media Sosial\nPilihan (1/2/3): ");
        int shareTo = in.nextInt();
        
        if (contentType.equals("publication")) {
            System.out.println("Format publikasi(pdf): ");
            String format = in.nextLine();
            format = in.nextLine();
            Publication content = new Publication(format, shareTo);
            content.display();
            content.selectContent();
            content.generateSharedContent();
            content.share();
        }
        if (contentType.equals("table")) {
            System.out.println("Format tabel(pdf/csv/gambar): ");
            String format = in.nextLine();
            format = in.nextLine();
            Table content = new Table(format, shareTo);
            content.display();
            content.selectContent();
            content.generateSharedContent();
            content.share();
        }
        if (contentType.equals("infografis")) {
            System.out.println("Format infografis(pdf/gambar): ");
            String format = in.nextLine();
            format = in.nextLine();
            Infografis content = new Infografis(format, shareTo);
            content.display();
            content.selectContent();
            content.generateSharedContent();
            content.share();
        }
    }
}