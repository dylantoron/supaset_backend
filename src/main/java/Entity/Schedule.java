package Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "SCHEDULE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "schedule_seq")
    @SequenceGenerator(name = "schedule_seq", sequenceName = "SCHEDULE_SEQ", allocationSize = 1)
    private Long scheduleId;

    @Column(name = "MUSCLE")
    private String muscle;

    @Column(name = "EXERCISE")
    private String exercise;

    @Column(name = "NUM_SETS")
    private Long numSets;

    @OneToOne
    @JoinColumn(name = "LIFT_ID")
    private Lifts lift;

}
