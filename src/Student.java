public class Student {
    private String jmeno;
    private String prijmeni;
    private int vek;

    @Override
    public String toString() {
        return jmeno + " " + prijmeni + ", vek " + vek + ". Student " + zletily(vek);
    }

    public String zletily(int vek){
        if(vek>=18){
            return "je zletily";
        }
        else
            return "neni zletily";
    }

    public Student(){

    }

    public Student(String jmeno, String prijmeni, int vek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
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

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        if(vek < 0){
            this.vek = Math.abs(vek);
        }
        else
            this.vek = vek;
    }
}
