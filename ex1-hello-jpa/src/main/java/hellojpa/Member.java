package hellojpa;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Member {
    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column(name = "USERNAME") // 데이터베이스 컬럼명은 name
    private String username;


    // 1. 다대일
    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;

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

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    // 단순한 값 넣기가 아닌, 로직이 있을 땐 set 메서드대신 다른 메서드 명 사용 권장
    public void changeTeam(Team team) {
        this.team = team;

        // 연관관계 편의 메서드
        // Member 자신(this)을 team 에 넣어준다
        team.getMembers().add(this);

    }
}