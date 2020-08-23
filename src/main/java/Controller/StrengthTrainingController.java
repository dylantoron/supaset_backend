package Controller;

import Entity.Lifts;
import Service.StrengthTrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200/strength-training", maxAge = 3600)
@RequestMapping("/strength-training")
public class StrengthTrainingController {

    @Autowired
    private StrengthTrainingService strengthTrainingService;
    
    @PostMapping("/create")
    public void saveLift(@RequestBody Lifts lift){
        strengthTrainingService.saveLift(lift);
    }
}
