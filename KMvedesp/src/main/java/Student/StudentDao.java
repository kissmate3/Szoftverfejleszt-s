package Student;

import util.jpa.GenericJpaDao;

import javax.persistence.Persistence;

public class StudentDao extends GenericJpaDao<Student> {

    private static StudentDao instance;

    private StudentDao() {
        super(Student.class);
    }

    public static StudentDao getInstance() {
        if (instance == null) {
            instance = new StudentDao();
            instance.setEntityManager(Persistence.createEntityManagerFactory("KM").createEntityManager());
        }
        return instance;
    }
}
