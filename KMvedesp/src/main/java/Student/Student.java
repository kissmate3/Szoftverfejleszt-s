package Student;
import lombok.*;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

/**
 * The class that represents the Student
 */
public class Student {

    /**
     * The name of the student.
     */
    @Column (unique = true)
    private String name;

    /**
     * The student id
     */
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int StudentId;

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return StudentId;
    }
}
