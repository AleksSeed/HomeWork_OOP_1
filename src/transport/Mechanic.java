package transport;

public class Mechanic {
    private String fio;
    private String company;

    public Mechanic(String fio, String company) {
        setFio(fio);
        setCompany(company);
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        if (fio == null){
            this.fio = "Default FIO";
        } else {
            this.fio = fio;
        }
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company == null) {
            this.company = "Default Company";
        } else {
            this.company = company;
        }
    }

  /*  public void servicing(){
        System.out.println("Механик " + getFio() + " из компании " + getCompany() + " проводит ТО");
    }

    public void repair(){
        System.out.println("Механик " + getFio() + " из компании " + getCompany() + " проводит ремонт");
    }*/

    @Override
    public String toString(){
        return "Механик: " + fio + " компания: " + company;
    }

    public void add(Mechanic mechanic) {
        System.out.println("Механик: " + fio + " из компании: " + company);
    }
}
