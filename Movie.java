public class Movie {

    private String id;
    private int rank;
    private String title;
    private String fullTitle;
    private int year;
    private String image;
    private String crew;
    private int imDbRating;
    private int imdDRatingCount;

    public Movie() {
        this.id=null;
        this.rank= -1;
        this.title=null;
        this.fullTitle=null;
        this.year = 0;
        this.image =null;
        this.crew=null;
        this.imDbRating =0;
        this.imdDRatingCount =-1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFullTitle() {
        return fullTitle;
    }

    public void setFullTitle(String fullTitle) {
        this.fullTitle = fullTitle;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public int getImDbRating() {
        return imDbRating;
    }

    public void setImDbRating(int imDbRating) {
        this.imDbRating = imDbRating;
    }

    public int getImdDRatingCount() {
        return imdDRatingCount;
    }

    public void setImdDRatingCount(int imdDRatingCount) {
        this.imdDRatingCount = imdDRatingCount;
    }
}
