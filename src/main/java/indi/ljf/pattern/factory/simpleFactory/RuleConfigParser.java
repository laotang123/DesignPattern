package indi.ljf.pattern.factory.simpleFactory;

/**
 * @author ：ljf
 * @date ：2020/8/26 9:47
 * @description：简单工厂中的抽象类
 * @modified By：
 * @version: $ 1.0
 */
public abstract class RuleConfigParser {

    /**
     * 按照文本格式解析文本，由子类实现
     * @param configText
     * @return
     */
    public abstract RuleConfig parser(String configText);
}

class JsonRuleConfigParser extends RuleConfigParser{

    @Override
    public RuleConfig parser(String configText) {
        return new JsonRuleConfig();
    }
}

class XmlRuleConfigParser extends RuleConfigParser{

    @Override
    public RuleConfig parser(String configText) {
        return new XmlRuleConfig();
    }
}

class YamlRuleConfigParser extends RuleConfigParser{

    @Override
    public RuleConfig parser(String configText) {
        return new YamlRuleConfig();
    }
}
