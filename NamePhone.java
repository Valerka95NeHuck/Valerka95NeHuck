package main;


public class NamePhone {
    private String name;
    private String phone;

    public NamePhone(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Имя: " + name +
                ",Телефон :" + phone
                ;
    }

    public String getName() {
        return name;
    }


    public String getPhone() {
        return phone;
    }



}
