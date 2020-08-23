package DAO;

import Entity.Sets;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SetsRepository extends CrudRepository <Sets, Integer> {
}
