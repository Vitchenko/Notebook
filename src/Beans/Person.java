package Beans;

/**
 * Created by viv on 18.05.2016.
 */




public class Person {

    private int personid;
    private String fname;
    private String lname;
    private String adress;
    private String email;
    private int pole;
    private String phone;

    public Person() {
    }


    public Person(int personid, String fname, String lname, String adress, String email, int pole, String phone) {
        this.setPersonid(personid);
        this.setFname(fname);
        this.setLname(lname);
        this.setAdress(adress);
        this.setEmail(email);
        this.setPole(pole);
        this.setPhone(phone);
    }


    public int getPersonid() {
        return personid;
    }

    public void setPersonid(int personid) {
        this.personid = personid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPole() {
        return pole;
    }

    public void setPole(int pole) {
        this.pole = pole;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {

        StringBuilder stb = new StringBuilder(10);

        stb.append(this.getPersonid()+" ");
        stb.append(this.getFname()+" ");
        stb.append(this.getLname()+" ");
        stb.append(this.getAdress()+" ");
        stb.append(this.getEmail()+" ");
        stb.append(this.getPole()+" ");

        return stb.toString(); // результирующая строка


    }
}