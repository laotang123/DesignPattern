package indi.ljf.pattern.behavioralType.visitor.version1;

/**
 * @author ：ljf
 * @date ：2020/11/6 14:05
 * @description：文件处理的抽象类
 * @modified By：
 * @version: $ 1.0
 */
public abstract class ResourceFile {
    private final String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    /**
     * 抽象方法，其他文件转为txt文件
     */
    public abstract void accept(Extractor extractor);

}
