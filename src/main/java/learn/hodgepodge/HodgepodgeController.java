package learn.hodgepodge;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class HodgepodgeController {

    @GetMapping ("/name")
    public String getName(){
        return "Brian Sanner";
    }

    @GetMapping ("/current/time")
    public LocalDateTime getCurrentTime(){
        return LocalDateTime.now();
    }

    @GetMapping ("/greet/{name}")
    public String greet(@PathVariable String name){
        return "Hello " + name + "!";
    }

}
