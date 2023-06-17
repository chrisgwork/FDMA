package workapps.genone.FDMA.directors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class DirectorsController {
    @RequestMapping("/directors")
    public String getDirectors() {

        return "Make return all directors";
    }
}

