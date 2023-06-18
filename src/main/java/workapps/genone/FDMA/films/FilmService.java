package workapps.genone.FDMA.films;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FilmService {

    private List<Film> films = new ArrayList<>(Arrays.asList(
            new Film(1, "Goodfellas", "GOODFELLAS1990", "1990"),
            new Film(2, "Fight Club", "FIGHT_CLUB1999", "1999"),
            new Film(3, "The Big Lebowski", "BIGLEBOWSK1998", "1998")
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
    public void updateSingleFilm(Integer filmId, Film film) {
        for (int i = 0; i < films.size(); i++) {
            Film f = films.get(i);
            if (f.getFilmId().equals(filmId)) {
                films.set(i, film);
                return;
            }
        }
    }

    public void deleteSingleFilm(Integer filmId) {
        films.removeIf(film -> film.getFilmId().equals(filmId));
    }

}
