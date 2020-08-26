package indi.ljf.pattern.factory.simpleFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：ljf
 * @date ：2020/8/26 10:14
 * @description：简单工厂构建主方法
 * @modified By：
 * @version: $ 1.0
 */
public class RuleConfigParserFactory {
    private static final String JSON_EXTENSION = "json";
    private static final String XML_EXTENSION = "xml";
    private static final String YAML_EXTENSION = "yaml";

    private static final Map<String, RuleConfigParser> cachedParsers = new HashMap<>();

    //简单工厂+单例模式实现
    static {
        cachedParsers.put(JSON_EXTENSION,new JsonRuleConfigParser());
        cachedParsers.put(XML_EXTENSION,new XmlRuleConfigParser());
        cachedParsers.put(YAML_EXTENSION,new YamlRuleConfigParser());
    }

    public static RuleConfigParser createParser(String configFormat){
        if(configFormat == null || configFormat.isEmpty()){
            return null;
        }

        RuleConfigParser parser = cachedParsers.get(configFormat);
        return parser;
    }

//    public static RuleConfigParser createParser(String configFormat) {
//        RuleConfigParser parser = null;
//        if (JSON_EXTENSION.equalsIgnoreCase(configFormat)){
//            parser = new JsonRuleConfigParser();
//        } else if(XML_EXTENSION.equalsIgnoreCase(configFormat)){
//            parser = new XmlRuleConfigParser();
//        }else if(YAML_EXTENSION.equalsIgnoreCase(configFormat)){
//            parser = new YamlRuleConfigParser();
//        }
//        return parser;
//    }



    
}
