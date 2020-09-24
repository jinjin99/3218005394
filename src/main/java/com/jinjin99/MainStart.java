package com.free;
import cn.hutool.core.io.file.FileReader;
import com.free.util.FileUtil;
import com.free.util.TokenizerUtil;

import java.util.List;
import java.util.Map;

/**
 * @ClassNamemain
 * @Description
 * @Author Free
 * @Date2020/9/20 11:40
 * @Version V1.0
 **/
public class MainStart {
    public static void main(String[] args) {
        String file1 = args[0];
        String file2 = args[1];
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(file1);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(file2);
        Double aDouble = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        System.out.println(aDouble);
        FileUtil.writeFile(args[2],String.valueOf(aDouble));
    }
}
