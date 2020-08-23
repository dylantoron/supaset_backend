package Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "SETS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sets {

    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "set_seq")
    //@SequenceGenerator(name = "set_seq", sequenceName = "SET_SEQ", allocationSize = 1)
    private int setId;

    @Column(name = "EXERCISE")
    private String exercise;

    @Column(name = "NUM_REPS")
    private int numReps;

    @Column(name = "WEIGHT")
    private Double weight;

    @Column(name = "IS_BODYWEIGHT")
    private String isBodyweight;

    @Column(name = "LIFT_ORDER")
    private int liftOrder;

    @ManyToOne
    @JoinColumn(name = "LIFT_ID")
    private Lifts lift;


}
