package com.manavta.myngoapp.ngo.Fragment;

public class PlasmaDonorNGO {

    String strPlasmaDonor;
    int imgPlasmaDonor;
    public PlasmaDonorNGO(String strPlasmaDonor, int imgPlasmaDonor) {
        this.strPlasmaDonor = strPlasmaDonor;
        this.imgPlasmaDonor = imgPlasmaDonor;
    }



    public String getStrPlasmaDonor() {
        return strPlasmaDonor;
    }

    public int getImgPlasmaDonor() {
        return imgPlasmaDonor;
    }

    public void setStrPlasmaDonor(String strPlasmaDonor) {
        this.strPlasmaDonor = strPlasmaDonor;
    }

    public void setImgPlasmaDonor(int imgPlasmaDonor) {
        this.imgPlasmaDonor = imgPlasmaDonor;
    }
}
