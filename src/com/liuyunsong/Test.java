package com.liuyunsong;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String xmlPath="com/liuyunsong/bean.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        Song song= (Song) applicationContext.getBean("Song");
        System.out.println("歌曲名:"+song.getSongname()+"\n"+"cc"+
                        "歌手:"+song.getSinger().getName()+"("+song.getSinger().getSex()+")"+"\n"+
                "风格:"+song.getStyle().getName()
                );
        /*UserController userController= (UserController) applicationContext.getBean("userController");
        userController.save();*/

    }
}
