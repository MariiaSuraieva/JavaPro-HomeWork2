package hillel.suraieva.employee;

public class Employee {
    private String pib;
    private String position;
    private String mail;
    private String phone;
    private int age;

    public Employee(String pib, String position, String mail, String phone, int age) {
        this.pib = pib;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.age = age;
    }

    public String getPib() {
        return pib;
    }

    public String getPosition() {
        return position;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }
}
