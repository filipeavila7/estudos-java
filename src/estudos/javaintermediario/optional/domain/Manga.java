package src.estudos.javaintermediario.optional.domain;

public class Manga {
    private Integer id;
    private String title;
    private int charpter;

    public Manga(Integer id, String title, int charpter) {
        this.id = id;
        this.title = title;
        this.charpter = charpter;
        
    }

    
    

    @Override
    public String toString() {
        return "Manga [id=" + id + ", title=" + title + ", charpter=" + charpter + "]";
    }




    public Integer getId() {
        return id;
    }

    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public int getCharpter() {
        return charpter;
    }

    public void setCharpter(int charpter) {
        this.charpter = charpter;
    }

    

    
}
