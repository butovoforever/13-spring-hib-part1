import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "group")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "group")
    private List<Student> students;

    @Column(name = "graduation_year")
    private int graduationYear;

    // Add getters, setters, and constructors as needed
}
