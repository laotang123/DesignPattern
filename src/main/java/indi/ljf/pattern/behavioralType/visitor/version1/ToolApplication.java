package indi.ljf.pattern.behavioralType.visitor.version1;


import java.util.ArrayList;
import java.util.List;

/**
 * @author ：ljf
 * @date ：2020/11/6 14:13
 * @description：文件转换工具应用， 实现功能：给定文件目录将具体的文件格式转为txt
 * @modified By：
 * @version: $ 1.0
 */
public class ToolApplication {

    public static void main(String[] args) {
        args = new String[]{"./tmp"};
        Extractor extractor = new Extractor();
        //重载是静态绑定，多态是动态绑定
        List<ResourceFile> resourceFiles = listAllResourceFiles(args[0]);
        for (ResourceFile resourceFile : resourceFiles) {
            resourceFile.accept(extractor);
        }

    }


    /**
     * 遍历资源文件路径下的文件，根据类型构建相应的处理类
     *
     * @param resourceDirectory
     * @return
     */
    public static List<ResourceFile> listAllResourceFiles(String resourceDirectory) {
        List<ResourceFile> resourceFiles = new ArrayList<>();
        resourceFiles.add(new PPTFile("a.ppt"));
        resourceFiles.add(new WordFile("b.word"));
        resourceFiles.add(new PPTFile("a.ppt"));

        return resourceFiles;
    }
}
