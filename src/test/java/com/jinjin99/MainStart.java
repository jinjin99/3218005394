package com.jinjin99;

import com.jinjin99.util.FileUtil;
import com.jinjin99.util.TokenizerUtil;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @ClassNamemain
 * @Description
 * @Date2020/9/22 11:39
 * @Version V1.0
 **/

public class MainStart {
    @Test
    public void Test1(){
        String path = "C:\\Users\\超级可爱的小仙女\\Desktop\\test\\orig_0.8_add.txt";
        String path2 = "C:\\Users\\超级可爱的小仙女\\Desktop\\test\\orig_0.8_add.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        System.out.println("内容相似度:");
        System.out.println(aDouble);

        FileUtil.writeFile("C:\\Users\\超级可爱的小仙女\\Desktop\\test\\res.txt",String.valueOf(aDouble));
    }

    @Test
    public void Test2(){
        String path = "C:\\Users\\超级可爱的小仙女\\Desktop\\test\\orig.txt.txt";
        String path2 = "C:\\Users\\超级可爱的小仙女\\Desktop\\test\\orig_0.8_add.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);

        System.out.println("内容相似度:");
        System.out.println(aDouble);
        FileUtil.writeFile("C:\\Users\\超级可爱的小仙女\\Desktop\\test\\res.txt",String.valueOf(aDouble));
    }

    @Test
    public void Test3(){
        String path = "C:\\Users\\超级可爱的小仙女\\Desktop\\test\\orig.txt";
        String path2 = "C:\\Users\\超级可爱的小仙女\\Desktop\\test\\orig_0.8_del.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);

        System.out.println("内容相似度:");
        System.out.println(aDouble);
        FileUtil.writeFile("C:\\Users\\超级可爱的小仙女\\Desktop\\test\\res.txt",String.valueOf(aDouble));
    }

    @Test
    public void Test4(){
        String path = "C:\\Users\\超级可爱的小仙女\\Desktop\\test\\orig.txt";
        String path2 = "C:\\Users\\超级可爱的小仙女\\Desktop\\test\\orig_0.8_dis_1.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);

        System.out.println("内容相似度:");
        System.out.println(aDouble);
        FileUtil.writeFile("C:\\Users\\超级可爱的小仙女\\Desktop\\test\\res.txt",String.valueOf(aDouble));
    }

    @Test
    public void Test5(){
        String path = "C:\\Users\\超级可爱的小仙女\\Desktop\\test\\orig.txt";
        String path2 = "C:\\Users\\超级可爱的小仙女\\Desktop\\test\\orig_0.8_dis_10.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);

        System.out.println("内容相似度:");
        System.out.println(aDouble);
        FileUtil.writeFile("C:\\Users\\超级可爱的小仙女\\Desktop\\test\\res.txt",String.valueOf(aDouble));
    }

    @Test
    public void Test6(){
        String path = "C:\\Users\\超级可爱的小仙女\\Desktop\\test\\orig.txt";
        String path2 = "C:\\Users\\超级可爱的小仙女\\Desktop\\test\\orig_0.8_dis_15.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);

        System.out.println("内容相似度:");
        System.out.println(aDouble);
        FileUtil.writeFile("C:\\Users\\超级可爱的小仙女\\Desktop\\test\\res.txt",String.valueOf(aDouble));
    }

    @Test
    public void Test7(){
        String path = "C:\\Users\\超级可爱的小仙女\\Desktop\\test\\orig.txt";
        String path2 = "C:\\Users\\超级可爱的小仙女\\Desktop\\test\\orig_0.8_dis_15.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);

        System.out.println("内容相似度:");
        System.out.println(aDouble);
        FileUtil.writeFile("C:\\Users\\超级可爱的小仙女\\Desktop\\test\\res.txt",String.valueOf(aDouble));
    }

   
}
