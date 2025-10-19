class Student implements Cloneable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();  
    }
}   

public class Cloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student(1, "John Doe");
        Student s2 = (Student) s1.clone(); // Cloning the object
        Student s3 = (Student) s2.clone(); // Cloning the object
        Student s4 = new Student(2, "Alex");
        Student s5 = (Student) s4.clone();
        System.out.println(s2.id + " " + s2.name);
        System.out.println(s3.id + " " + s3.name);
        System.out.println(s4.id + " " + s4.name);
        System.out.println(s5.id + " " + s5.name);
    }
}
