package hellojpa;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@SequenceGenerator(name = "member_seq-generator", sequenceName = "member_seq")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "member_seq-generator")
    private Long id;

    @Column(name = "name", nullable = false) // 데이터베이스 컬럼명은 name
    private String username;

    public Member(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}