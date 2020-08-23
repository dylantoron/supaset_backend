package Service;

import Entity.Lifts;
import Entity.Sets;
import DAO.LiftsRepository;
import DAO.SetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StrengthTrainingService {

    private LiftsRepository liftsRepository;

    public StrengthTrainingService(LiftsRepository liftsRepository){
        this.liftsRepository = liftsRepository;
    }

    public void saveLift(Lifts lift){
        liftsRepository.save(lift);
    }



}
