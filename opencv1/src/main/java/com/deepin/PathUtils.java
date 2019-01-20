package com.deepin;

import java.io.File;

public class PathUtils {

    public static String getResourceDictionary() {
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
