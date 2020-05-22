package Diary;

public class DiaryMain {

    public static void main(String[] args) {
        MarkDao markDao = MarkDao.getInstance();
        KMDiary kmDiary = KMDiary.builder().name("Máté").build();
        markDao.persist(kmDiary);
    }
}