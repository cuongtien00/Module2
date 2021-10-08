package BaiThucHanh1;

public class People {
    private String name;
    private String age;
    private int numberOfCMND;

    public People() {
    }

    public People(String name, String age, int numberOfCMND) {
        this.name = name;
        this.age = age;
        this.numberOfCMND = numberOfCMND;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getNumberOfCMND() {
        return numberOfCMND;
    }

    public void setNumberOfCMND(int numberOfCMND) {
        this.numberOfCMND = numberOfCMND;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", numberOfCMND=" + numberOfCMND +
                '}';
    }
}
