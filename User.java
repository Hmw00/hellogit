public class User{
    public static void main(String[] args) {
        // 第一行测试代码，程序员3解决了这个冲突
        Animal white = new Animal("小白", 5, "白色");
        System.out.println(white);
        Animal yellow = new Animal("小黄", 3, "黄色");
        System.out.println(yellow);
        // 第二行测试代码
    }
}

class Animal{
    private Stirng name;
    private Integer age;
    private String color;

    public Animal(Stirng name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Stirng getName() {
        return name;
    }

    public void setName(Stirng name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
