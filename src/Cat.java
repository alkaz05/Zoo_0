public class Cat {
    String name;
    int age;
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void hello(String name, int age){
        System.out.println("Hello i'm " + name + " и мне " + age);
    }
}
