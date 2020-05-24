package Student;

import util.jpa.GenericJpaDao;

import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * DAO class for the {@link StudentDao} entity.
 */
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

    /**
     * Finds the studen by name in the adatbase
     * @param name the users name
     * @return The student or null if he is not in the adatbase
     */
    public Student searchID(String name){
        TypedQuery<Student> query=entityManager.createQuery("SELECT r FROM Student r WHERE r.name=:name",Student.class).setParameter("name",name);
        List queryID=query.getResultList();

        if(queryID.isEmpty()){
            return null;
        }else{
            return query.getSingleResult();
        }
    }

}
