package Diary;

import util.jpa.GenericJpaDao;
import javax.persistence.Persistence;

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


}
