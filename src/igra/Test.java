package igra;

public class Test {
    public static void main(String[] args) {
        SchoolBoy boy = new SchoolBoy("Ivan", 13);
        SchoolBoy girl = new SchoolBoy("Irochka", 14);

        Student student1 = new Student("Vasiliy", 19);
        Student student2 = new Student("Vikochka", 21);

        Employee employee1 = new Employee("Gena", 43);
        Employee employee2 = new Employee("Kirill", 35);

        Team<SchoolBoy> schoolTeam = new Team("Dragoons");
        Team<Student> studentTeam = new Team("GoAhead");
        Team<Employee> employeeTeam = new Team("HardWorkers");

        schoolTeam.addNewParticipant(boy);
        schoolTeam.addNewParticipant(girl);

        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team<SchoolBoy> schoolTeam2 = new Team("Cats");
        SchoolBoy boy2 = new SchoolBoy("Kolya", 12);
        SchoolBoy girl2 = new SchoolBoy("Igor", 10);
        schoolTeam2.addNewParticipant(boy2);
        schoolTeam2.addNewParticipant(girl2);

        schoolTeam.playWith(schoolTeam2);
    }
}
