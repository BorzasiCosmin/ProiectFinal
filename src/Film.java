public class Film {
    private String numeFilm;
    private String genFilm;
    private String durataFilm;

    public Film(String numeFilm , String genFilm , String durataFilm){
        this.numeFilm = numeFilm;
        this.genFilm = genFilm;
        this.durataFilm = durataFilm;
    }
    public String toString(){
        String msg = "Filmul este : "+numeFilm+" genul filmului: "+genFilm+" si dureaza"+durataFilm;
        return msg;
    }
}
