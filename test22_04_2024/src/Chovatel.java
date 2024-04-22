import java.util.concurrent.ExecutionException;

public class Chovatel {
    private String jmeno;
    private String prijmeni;
    private String adresa;

    public Chovatel(String jmeno, String prijmeni, String adresa) throws Exception{
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Chovatel{" +
                "jmeno='" + jmeno + '\'' +
                ", prijmeni='" + prijmeni + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) throws Exception {
       this.adresa=adresa;
    }
}
