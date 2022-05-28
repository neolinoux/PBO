import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        University university = new University("Politeknik Statistika STIS");
        ArrayList<Faculty> faculties = new ArrayList<Faculty>();
        ArrayList<Institute> institutesKS = new ArrayList<Institute>();
        ArrayList<Institute> institutesST = new ArrayList<Institute>();
        ArrayList<Institute> institutesD3 = new ArrayList<Institute>();

        institutesST.add(new Institute("Statistika Kependudukan"));
        institutesST.add(new Institute("Statistika Ekonomi"));
        institutesKS.add(new Institute("Sistem Informasi"));
        institutesKS.add(new Institute("Data Science"));
        institutesD3.add(new Institute("D3 Statistika"));


        Dean deanKS = new Dean(1234567, "Yunarso Anang", "yunarsoanang@email.com");
        Dean deanST = new Dean(7654321, "I Made Arcana", "imadearcana@email.com");
        Dean deanD3 = new Dean(9876543, "Agung Priyo Utomo", "agungpriyoutomo@email.com");

        faculties.add(new Faculty("Komputasi Statistik", university, deanKS, institutesKS));
        faculties.add(new Faculty("D4 Statistika", university, deanST, institutesST));
        faculties.add(new Faculty("D3 Statistika", university, deanD3, institutesD3));

        institutesKS.get(0).setAddress(new Address("DKI Jakarta", "Jakarta Selatan", "Otto Iskandar", "Bidara Cina", "Kelapa Gading", "10250"));
        institutesKS.get(1).setAddress(new Address("DKI Jakarta", "Jakarta Selatan", "Otto Iskandar", "Bidara Cina", "Kelapa Gading", "10250"));
        institutesST.get(0).setAddress(new Address("DKI Jakarta", "Jakarta Selatan", "Otto Iskandar", "Bidara Cina", "Kelapa Gading", "10250"));
        institutesST.get(1).setAddress(new Address("DKI Jakarta", "Jakarta Selatan", "Otto Iskandar", "Bidara Cina", "Kelapa Gading", "10250"));


        university.setFaculties(faculties);
        faculties.get(0).setInstitutes(institutesKS);
        faculties.get(1).setInstitutes(institutesST);
        faculties.get(2).setInstitutes(institutesD3);

        System.out.println(university);
        //System.out.println(university.faculties);
        System.out.println(faculties.get(0));
        System.out.println(faculties.get(1));
        System.out.println(faculties.get(2));
    }
}
