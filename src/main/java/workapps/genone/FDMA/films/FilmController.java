package workapps.genone.FDMA.films;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class FilmController {
    @RequestMapping("/films")
    public List<Film> getFilms() {

        return Arrays.asList(
                new Film(1, "Goodfellas", "2015-03-31", 1, 1, 1, 1, 1)
        );
    }
}
