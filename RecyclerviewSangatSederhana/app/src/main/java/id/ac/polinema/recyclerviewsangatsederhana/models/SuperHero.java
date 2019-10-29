package id.ac.polinema.recyclerviewsangatsederhana.models;

public class SuperHero {
    public String heroName;
    public String gambar;

    public SuperHero(String gambar, String heroName) {
        this.gambar = gambar;
        this.heroName = heroName;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

}