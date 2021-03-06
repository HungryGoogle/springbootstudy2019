package com.deepin;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

// ref https://www.cnblogs.com/superbool/p/5331196.html
public class Demo2_ShowImage {

    public static void main(String[] args) {

        // -Djava.library.path=E:\code\code_ai\opencv\build\java\x64
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        System.out.println("\nRunning Demo2_ShowImage");

        String imagePath = PathUtils.getResourceDictionary() + "/pic/lena.jpg";
        System.out.println(imagePath);//user.dir指定了当前的路径
        Mat mat = Imgcodecs.imread(imagePath);

        ImageViewer imageViewer = new ImageViewer(mat, "第一幅图片");
        imageViewer.imshow();
    }
}