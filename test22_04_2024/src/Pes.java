public class Pes {
private String jmeno;
private String narozeni;
private String evCislo;
private Barva barva;
private Chovatel chovatel;

    public Pes(String jmeno, String narozeni, String evCislo, Barva barva, Chovatel chovatel) throws Exception {
        this.jmeno = jmeno;
        if(narozeni.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/\\d{4}$")){
            this.narozeni = narozeni;
        }else {
            throw new Exception("nevhodny formát");
        }
        if (evCislo.matches("[C][M][K][U]\\/[A-Z]{4}\\/[0-9]{4}\\/[0-9]{4}")) {
            this.evCislo = evCislo;
        }else{
            throw new Exception("nevhodné evidencní čislo");
            }
        this.barva = barva;
        this.chovatel = chovatel;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getNarozeni() {
        return narozeni;
    }

    public void setNarozeni(String narozeni) throws Exception {
        if(narozeni.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/\\d{4}$")){
            this.narozeni = narozeni;
            }else{
        throw new Exception("nevhodny formát");
        }

    }

    public String getEvCislo() {
        return evCislo;
    }

    public void setEvCislo(String evCislo) throws Exception{
        if (evCislo.matches("[C][M][K][U]\\/[A-Z]{4}\\/[0-9]{4}\\/[0-9]{4}")) {
            this.evCislo = evCislo;
        }else{
            throw new Exception("nevhodné evidencní čislo");
        }
        this.barva = barva;
        this.chovatel = chovatel;
    }

    public Barva getBarva() {
        return barva;
    }

    public void setBarva(Barva barva) {
        this.barva = barva;
    }

    public Chovatel getChovatel() {
        return chovatel;
    }

    public void setChovatel(Chovatel chovatel) {
        this.chovatel = chovatel;
    }

    @Override
    public String toString() {
        return "Pes{" +
                "jmeno='" + jmeno + '\'' +
                ", narozeni='" + narozeni + '\'' +
                ", evCislo=" + evCislo +
                ", barva=" + barva +
                ", chovatel=" + chovatel +
                '}';
    }
    public int getRok(){
        String[] components = narozeni.split("/");
        return Integer.parseInt(components[2]);
    }

    public int getMesic(){
        String[] components = narozeni.split("/");
        return Integer.parseInt(components[1]);
    }

    public int getDen(){
        String[] components = narozeni.split("/");
        return Integer.parseInt(components[0]);
    }
}
