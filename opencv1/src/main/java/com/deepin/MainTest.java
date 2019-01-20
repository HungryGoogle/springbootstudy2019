package com.deepin;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

import java.io.File;

public class MainTest {
        static {
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
            //注意程序运行的时候需要在VM option添加该行 指明opencv的dll文件所在路径
            //-Djava.library.path=$PROJECT_DIR$\opencv\x64
        }

        public static void main(String[] args){

            String imagePath = getResourceDictionary() + "/pic/lena.jpg";
            System.out.println(imagePath);//user.dir指定了当前的路径
            Mat mat2 = Imgcodecs.imread(imagePath);
            System.out.println(mat2);
    }

    private static void printCurrentFileDir() {
        System.out.println(System.getProperty("user.dir"));//user.dir指定了当前的路径

        File directory = new File("");//设定为当前文件夹
        try{
            System.out.println(directory.getCanonicalPath());//获取标准的路径
            System.out.println(directory.getAbsolutePath());//获取绝对路径
        }catch(Exception e){}
    }

    private static String getResourceDictionary() {
        // 下面位置在 D:\workspace\project1\out\test\classes
        File file = new File(MainTest.class.getResource("/").getPath());
        try{
            System.out.println(file.getCanonicalPath());//获取标准的路径
            System.out.println(file.getAbsolutePath());//获取绝对路径
            return file.getAbsolutePath();
        }catch(Exception e){}

        return "";
    }
}