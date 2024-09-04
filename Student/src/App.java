public class App {
    public static void main(String[] args) {
        Student s1 = new Student("B2311000", "Ahmed", 'M', 'B');
        System.out.println(s1.seatNo + " " + s1.name + " " + s1.gender + " " + s1.section);
        update(s1);
        System.out.println("------------------------");
        System.out.println(s1.seatNo + " " + s1.name + " " + s1.gender + " " + s1.section);
    }

    static void update(Student s1) {
        s1.seatNo = "B23110006102";
        s1.name = "Huzaifa";
        s1.gender = 'M';
        s1.section = 'A';
    }
}
