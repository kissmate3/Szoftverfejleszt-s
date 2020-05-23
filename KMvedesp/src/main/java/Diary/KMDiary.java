package Diary;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

public class KMDiary{
    
    @Column(nullable = false)
    private int studentID;

    @Column(nullable = false)
    private int Mark;

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column
    @Temporal(TemporalType.DATE)
    private Date created;

    @Column
    private String comment;
}
