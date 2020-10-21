package learn.hodgepodge;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class HodgepodgeController {

    private static int sheepCount = 0;

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

    @PutMapping ("/sheep")
    public void countingSheep() {
        sheepCount++;
    }

    @GetMapping ("/sheep")
    public int howManySheep() {
        return sheepCount;
    }

    @PutMapping ("/sheep/{amount}")
    public void incSheepByAmount(@PathVariable int amount) {
        sheepCount += amount;
    }

}
