/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package Diary;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

/**
 * The class that represents the Diary
 */

public class KMDiary{

    /**
     * The class that represents the Diary
     */
    @Column(nullable = false)
    private int studentID;

    /**
     * The Mark
     */
    @Column(nullable = false)
    private int Mark;

    /**
     * The mark id
     */
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    /**
     * The timestamp when the mark was saved.
     */
    @Column
    @Temporal(TemporalType.DATE)
    private Date created;

    /**
     * Mark description
     */
    @Column
    private String comment;
}
