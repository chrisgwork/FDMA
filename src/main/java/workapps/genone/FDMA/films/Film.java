package workapps.genone.FDMA.films;


import java.util.Date;

public class Film {
    private Integer filmId;
    private String filmName;
    private String filmCode;
    private String releaseDate;

    public Film() {

    }

    public Film(Integer filmId, String filmName, String filmCode, String releaseDate) {
        this.filmId = filmId;
        this.filmName = filmName;
        this.filmCode = filmCode;
        this.releaseDate = releaseDate;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmCode() {
        return filmCode;
    }

    public void setFilmCode(String filmCode) {
        this.filmCode = filmCode;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

}
