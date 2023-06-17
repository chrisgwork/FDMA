package workapps.genone.FDMA.films;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @RequestMapping(method= RequestMethod.GET, value = "/films")
    public List<Film> getAllFilms() {
        return filmService.getAllFilms();
    }

    @RequestMapping(method= RequestMethod.GET, value = "/films/{filmId}")
    public Film getSingleFilm(@PathVariable Integer filmId) {
        return filmService.getSingleFilm(filmId);
    }

    @RequestMapping(method= RequestMethod.POST, value = "/films")
    public void createSingleFilm(@RequestBody Film film) {
        filmService.createSingleFilm(film);
    }

}
