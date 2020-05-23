package Diary;

import util.jpa.GenericJpaDao;
import javax.persistence.Persistence;
import java.util.List;

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

    public List<KMDiary> searchSID(int sId){
        return entityManager.createQuery("SELECT r FROM KMDiary r WHERE r.studentID= :sId",KMDiary.class).setParameter("sId",sId).getResultList();
    }

}
