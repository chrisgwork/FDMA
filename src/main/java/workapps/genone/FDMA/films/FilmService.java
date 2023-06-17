package workapps.genone.FDMA.films;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FilmService {

    private List<Film> films = new ArrayList<>(Arrays.asList(
            new Film(1, "Goodfellas", "GOODFELLAS1990", "1990")
        ));

    public List<Film> getAllFilms() {
        return films;
    }

    public Film getSingleFilm(Integer filmId) {
        return films.stream().filter(film -> film.getFilmId().equals(filmId)).findFirst().get();
    }

    public void createSingleFilm(Film film) {
        films.add(film);
    }
}
