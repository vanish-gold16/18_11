public class Zlomek {
    private float citatel;
    private float jmenovatel;

    public float prevodZlomku(){
        citatel = jmenovatel;
    }

    public Zlomek(float citatel, float jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }

    public float getCitatel() {
        return citatel;
    }

    public void setCitatel(float citatel) {
        this.citatel = citatel;
    }

    public float getJmenovatel() {
        return jmenovatel;
    }

    public void setJmenovatel(float jmenovatel) {
        this.jmenovatel = jmenovatel;
    }
}
