package Student;

public class StudentMain {

    public static void main(String[] args) {
        StudentDao studentDao = StudentDao.getInstance();
        Student student = Student.builder().name("Máté").build();
        studentDao.persist(student);
    }
}
