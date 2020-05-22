package Student;

import util.jpa.GenericJpaDao;

import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

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

    public List<Student> searchStudent(String name){
        return  entityManager.createQuery("SELECT r FROM Student r WHERE r.name = name", Student.class).getResultList();
    }

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
