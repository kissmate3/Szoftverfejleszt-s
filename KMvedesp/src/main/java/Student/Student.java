package Student;
import lombok.*;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

public class Student {

    @Column (unique = true)
    private String name;

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int StudentId;

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return StudentId;
    }
}
