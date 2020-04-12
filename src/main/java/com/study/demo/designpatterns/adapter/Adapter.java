package com.study.demo.designpatterns.adapter;

public class Adapter implements BaseAdapter {
    private NormalFormat normalFormat;
    private static final String FORMAT_MP3 = "mp3";
    private static final String FORMAT_WMA = "wma";

    public Adapter() {
        normalFormat = new NormalFormat();
    }

    @Override
    public void play(String fileType, String filename) {
        if (FORMAT_MP3.equals(fileType)){
            normalFormat.playMp3(filename);
        } else if (FORMAT_WMA.equals(fileType)) {
            normalFormat.playWma(filename);
        }

    }
}
