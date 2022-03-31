package XML;

public class books {
    private  String sn;
    private  String name;
    private  Double peric;

    public books() {
    }

    public books(String sn, String name, Double peric) {
        this.sn = sn;
        this.name = name;
        this.peric = peric;
    }

    @Override
    public String toString() {
        return "books{" +
                "sn='" + sn + '\'' +
                ", name='" + name + '\'' +
                ", peric=" + peric +
                '}';
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPeric() {
        return peric;
    }

    public void setPeric(Double peric) {
        this.peric = peric;
    }
}
