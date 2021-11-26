package com.example.guide;

public class lieux {

    private String nomduresto ;
    private String adresseresto;
    private int restoImageId;

    public lieux( String nomduresto, String adresseresto, int restoImageId) {
        this.nomduresto =nomduresto;
        this.adresseresto= adresseresto ;
        this.restoImageId= restoImageId;

    }

    public String getAdresseresto() {
        return adresseresto;
    }

    public int getRestoImageId() {
        return restoImageId;
    }

    public String getNomduresto() {
        return nomduresto;
    }
}
