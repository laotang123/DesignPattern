package indi.ljf.pattern.factory.simpleFactory;

import indi.ljf.pattern.exceptions.InvalidRuleConfigException;

import java.util.Arrays;

/**
 * @author ：ljf
 * @date ：2020/8/26 10:24
 * @description：规则配置源
 * @modified By：
 * @version: $ 1.0
 */
public class RuleConfigSource {
    private RuleConfigParser parser;

    public RuleConfig load(String ruleConfigFilePath) throws InvalidRuleConfigException {
        String fileExtension = getFileExtension(ruleConfigFilePath);

        parser = RuleConfigParserFactory.createParser(fileExtension);

        if (parser == null) {
            throw new InvalidRuleConfigException("Rule config file format is not supported: " + ruleConfigFilePath);
        }

        String configText = "";
        RuleConfig ruleConfig = parser.parser(configText);
        return ruleConfig;
    }

    private String getFileExtension(String filePath) {
        String[] splits = filePath.split("\\.");

        return splits[splits.length - 1];
    }

    public RuleConfigParser getParser(){
        return parser;
    }
}
