package Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "LIFTS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Lifts {

    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lift_seq")
    //@SequenceGenerator(name = "lift_seq", sequenceName = "LIFT_SEQ", allocationSize = 1)
    private int liftId;

    @Column(name = "MUSCLE")
    private String muscle;

    @Column(name = "EXERCISE")
    private String exercise;

    @Column(name = "NUM_SETS")
    private int numSets;

    @OneToMany(mappedBy = "lift", cascade = CascadeType.ALL)
    private List<Sets> sets;
}
