public class Film {
    private String numeFilm;
    private String genFilm;
    private String durataFilm;

    private Integer bileteFilm;
    public Film(){
        this.numeFilm="Nedefinit";
        this.genFilm="Nedefinit";
        this.durataFilm="Nedefinit";
        this.bileteFilm=-1;
    }

    public Film(String numeFilm , String genFilm , String durataFilm,int bileteFilm){
        this.numeFilm = numeFilm;
        this.genFilm = genFilm;
        this.durataFilm = durataFilm;
        this.bileteFilm = bileteFilm;
    }
    public String getNumeFilm(){
        return numeFilm;
    }
    public Integer getBileteFilm(){
        return bileteFilm;
    }

    public void setBileteFilm(Integer bilete){
        this.bileteFilm-=bilete;
    }
    public String toString(){
        String msg = "Filmul este : "+numeFilm+" genul filmului: "+genFilm+" , dureaza "+durataFilm+" si sunt "+bileteFilm+" bilete";
        return msg;
    }
}
