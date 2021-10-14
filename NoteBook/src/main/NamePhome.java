import java.util.Scanner;

public class NamePhome {
    private String name;
    private String phome;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhome() {
        return phome;
    }

    public void setPhome(String phome) {
        this.phome = phome;
    }
    public void RemovePhone (String phome){
        this.phome = null;
    }
    public void RemoveName (String name){
        this.name = null;
    }
}
