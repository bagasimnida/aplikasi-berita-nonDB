package com.beritaku.rizkianto;

import java.util.Date;

public class Berita {
    private int idBerita;
    private String judulBerita;
    private Date tglBerita;
    private String gambar;
    private String caption;
    private String penulis;
    private String isiBerita;
    private String linkBerita;

    public Berita(int idBerita, String judulBerita, Date tglBerita, String gambar, String caption, String penulis, String isiBerita, String linkBerita) {
        this.idBerita = idBerita;
        this.judulBerita = judulBerita;
        this.tglBerita = tglBerita;
        this.gambar = gambar;
        this.caption = caption;
        this.penulis = penulis;
        this.isiBerita = isiBerita;
        this.linkBerita = linkBerita;
    }

    public int getIdBerita() {
        return idBerita;
    }

    public String getJudulBerita() {
        return judulBerita;
    }

    public Date getTglBerita() {
        return tglBerita;
    }

    public String getGambar() {
        return gambar;
    }

    public String getCaption() {
        return caption;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getIsiBerita() {
        return isiBerita;
    }

    public String getLinkBerita() {
        return linkBerita;
    }
}
