package com.javaex.problem03;

public class SmartPhone extends MusicPhone {

    public void execute(String str){
        if (str.equals("음악")) {
            playMusic();
        } else if (str.equals("앱")) {
            runApp();
        } else {
            super.execute(str);
        }
        //코드작성

    }
    public void playMusic(){
        System.out.println("다운로드해서 음악재생");
    }
    //메소드작성
    public void runApp() {
        System.out.println("앱실행");
    }
    //메소드작성
}
