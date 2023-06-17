package workapps.genone.FDMA.films;


import java.sql.Date;

public class Film {
    private int filmId;
    private String filmName;
    private String releaseYear;
    private int filmDirectorMappingId;
    private int filmActorMappingId;
    private int filmOwnedStatusId;
    private int filmRatingId;
    private int filmGenreId;

    public Film() {
    }

    public Film(int filmId, String filmName, String releaseYear, int filmDirectorMappingId, int filmActorMappingId, int filmOwnedStatusId, int filmRatingId, int filmGenreId) {
        this.filmId = filmId;
        this.filmName = filmName;
        this.releaseYear = releaseYear;
        this.filmDirectorMappingId = filmDirectorMappingId;
        this.filmActorMappingId = filmActorMappingId;
        this.filmOwnedStatusId = filmOwnedStatusId;
        this.filmRatingId = filmRatingId;
        this.filmGenreId = filmGenreId;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getFilmDirectorMappingId() {
        return filmDirectorMappingId;
    }

    public void setFilmDirectorMappingId(int filmDirectorMappingId) {
        this.filmDirectorMappingId = filmDirectorMappingId;
    }

    public int getFilmActorMappingId() {
        return filmActorMappingId;
    }

    public void setFilmActorMappingId(int filmActorMappingId) {
        this.filmActorMappingId = filmActorMappingId;
    }

    public int getFilmOwnedStatusId() {
        return filmOwnedStatusId;
    }

    public void setFilmOwnedStatusId(int filmOwnedStatusId) {
        this.filmOwnedStatusId = filmOwnedStatusId;
    }

    public int getFilmRatingId() {
        return filmRatingId;
    }

    public void setFilmRatingId(int filmRatingId) {
        this.filmRatingId = filmRatingId;
    }

    public int getFilmGenreId() {
        return filmGenreId;
    }

    public void setFilmGenreId(int filmGenreId) {
        this.filmGenreId = filmGenreId;
    }

}
