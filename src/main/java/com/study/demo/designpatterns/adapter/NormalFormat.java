package com.study.demo.designpatterns.adapter;

public class NormalFormat {
    public void playMp3(String fileName) {
        System.out.println("播放mp3:"+ fileName);
    }

    public void playWma(String fileName) {
        System.out.println("播放wma:"+ fileName);
    }
}
