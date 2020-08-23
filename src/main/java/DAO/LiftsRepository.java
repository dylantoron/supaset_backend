package DAO;

import Entity.Lifts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiftsRepository extends CrudRepository<Lifts, Integer> {
}
