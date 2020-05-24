package Diary;

import util.jpa.GenericJpaDao;
import javax.persistence.Persistence;
import java.util.List;

/**
 * DAO class for the {@link MarkDao} entity.
 */
public class MarkDao extends GenericJpaDao<KMDiary> {

    private static MarkDao instance;

    private MarkDao() {
        super(KMDiary.class);
    }

    public static MarkDao getInstance() {
        if (instance == null) {
            instance = new MarkDao();
            instance.setEntityManager(Persistence.createEntityManagerFactory("KM").createEntityManager());
        }
        return instance;
    }

    /**
     * Returns a list of every marks of a student with the id
     *
     * @param sId the student id
     * @return every marks with the id on the Diary
     */
    public List<KMDiary> searchSID(int sId){
        return entityManager.createQuery("SELECT r FROM KMDiary r WHERE r.studentID= :sId",KMDiary.class).setParameter("sId",sId).getResultList();
    }

    /**
     * Returns the sum of the student's marks
     *
     * @param sId the student id
     * @return sum of the student's marks
     */
    public int countMark(int sId) {
        return Math.toIntExact(entityManager.createQuery("SELECT SUM(Mark) FROM KMDiary r WHERE r.studentID= :sId", Long.class).setParameter("sId", sId).getSingleResult());
    }

}
