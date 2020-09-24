package com.free;

import com.free.util.FileUtil;
import com.free.util.TokenizerUtil;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @ClassNamemain
 * @Description
 * @Author Free
 * @Date2020/9/22 11:39
 * @Version V1.0
 **/

public class MainStart {
    @Test
     public void sameTest(){
        String path = "D:\\Free\\课程\\软件工程\\数据源\\test\\orig_0.8_add.txt";
        String path2 = "D:\\Free\\课程\\软件工程\\数据源\\test\\orig_0.8_add.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\Free\\课程\\软件工程\\数据源\\test\\test\\res.txt",String.valueOf(aDouble));
        System.out.println(aDouble);
    }
    @Test
    public void addTest(){
        String path = "D:\\Free\\课程\\软件工程\\数据源\\test\\orig.txt";
        String path2 = "D:\\Free\\课程\\软件工程\\数据源\\test\\orig_0.8_add.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\Free\\课程\\软件工程\\数据源\\test\\test\\res.txt",String.valueOf(aDouble));
        System.out.println(aDouble);
    }
    @Test
    public void delTest(){
        String path = "D:\\Free\\课程\\软件工程\\数据源\\test\\orig.txt";
        String path2 = "D:\\Free\\课程\\软件工程\\数据源\\test\\orig_0.8_del.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\Free\\课程\\软件工程\\数据源\\test\\test\\res.txt",String.valueOf(aDouble));
        System.out.println(aDouble);
    }
    @Test
    public void disTest(){
        String path = "D:\\Free\\课程\\软件工程\\数据源\\test\\orig.txt";
        String path2 = "D:\\Free\\课程\\软件工程\\数据源\\test\\orig_0.8_dis_1.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\Free\\课程\\软件工程\\数据源\\test\\test\\res.txt",String.valueOf(aDouble));
        System.out.println(aDouble);
    }
    @Test
    public void dis10Test(){
        String path = "D:\\Free\\课程\\软件工程\\数据源\\test\\orig.txt";
        String path2 = "D:\\Free\\课程\\软件工程\\数据源\\test\\orig_0.8_dis_10.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\Free\\课程\\软件工程\\数据源\\test\\test\\res.txt",String.valueOf(aDouble));
        System.out.println(aDouble);
    }
    @Test
    public void dis15Test(){
        String path = "D:\\Free\\课程\\软件工程\\数据源\\test\\orig.txt";
        String path2 = "D:\\Free\\课程\\软件工程\\数据源\\test\\orig_0.8_dis_15.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\Free\\课程\\软件工程\\数据源\\test\\test\\res.txt",String.valueOf(aDouble));
        System.out.println(aDouble);
    }
    @Test
    public void Test(){
        String path = "D:\\Free\\课程\\软件工程\\数据源\\test\\orig.txt";
        String path2 = "D:\\Free\\课程\\软件工程\\数据源\\test\\orig_0.8_dis_15.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\Free\\课程\\软件工程\\数据源\\test\\test\\res.txt",String.valueOf(aDouble));
        System.out.println(aDouble);
    }

    @Test
    public void NullpointTest(){
        String path = "";
        String path2 = "";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\Free\\课程\\软件工程\\数据源\\test\\test\\res.txt",String.valueOf(aDouble));
        System.out.println(aDouble);
    }
    @Test
    public void DIYpointTest(){
        String path = "D:\\Free\\test\\1000.txt";
        String path2 = "D:\\Free\\test\\4.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\Free\\课程\\软件工程\\数据源\\test\\test\\res.txt",String.valueOf(aDouble));
        System.out.println(aDouble);
    }
}
