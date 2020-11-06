package indi.ljf.pattern.behavioralType.visitor.version2;


import java.util.ArrayList;
import java.util.List;

/**
 * @author ：ljf
 * @date ：2020/11/6 14:13
 * @description：面向接口编程，隐藏了实现的过程，
 * 增加代码的复用性。
 * @modified By：
 * @version: $ 1.0
 */
public class ToolApplication {

    public static void main(String[] args) {
        args = new String[]{"./tmp"};
        Extractor extractor = new Extractor();
        //重载是静态绑定，多态是动态绑定；静态绑定使用对象内方法解决，this代表当前对象
        List<ResourceFile> resourceFiles = listAllResourceFiles(args[0]);
        for (ResourceFile resourceFile : resourceFiles) {
            resourceFile.accept(extractor);
        }

        Compressor compressor = new Compressor();
        for (ResourceFile resourceFile : resourceFiles) {
            resourceFile.accept(compressor);
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
