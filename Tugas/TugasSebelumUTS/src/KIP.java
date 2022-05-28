
public class KIP {
    private String kodeProv;
    private String kodeKab;
    private String kodeKec;
    private String kodeKJU;
    private String noUrut;

    public KIP() {
    }

    public KIP(String kodeProv, String kodeKab, String kodeKec, String kodeKJU, String noUrut) {
        this.kodeProv = kodeProv;
        this.kodeKab = kodeKab;
        this.kodeKec = kodeKec;
        this.kodeKJU = kodeKJU;
        this.noUrut = noUrut;
    }

    public String getKodeProv() {
        return kodeProv;
    }

    public void setKodeProv(String kodeProv) {
        this.kodeProv = kodeProv;
    }

    public String getKodeKab() {
        return kodeKab;
    }

    public void setKodeKab(String kodeKab) {
        this.kodeKab = kodeKab;
    }

    public String getKodeKec() {
        return kodeKec;
    }

    public void setKodeKec(String kodeKec) {
        this.kodeKec = kodeKec;
    }

    public String getKodeKJU() {
        return kodeKJU;
    }

    public void setKodeKJU(String kodeKJU) {
        this.kodeKJU = kodeKJU;
    }

    public String getNoUrut() {
        return noUrut;
    }

    public void setNoUrut(String noUrut) {
        this.noUrut = noUrut;
    }


}