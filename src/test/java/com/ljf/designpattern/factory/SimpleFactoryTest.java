package com.ljf.designpattern.factory;

import indi.ljf.pattern.exceptions.InvalidRuleConfigException;
import indi.ljf.pattern.createType.factory.simpleFactory.RuleConfig;
import indi.ljf.pattern.createType.factory.simpleFactory.RuleConfigSource;
import org.junit.Test;

/**
 * @author ：ljf
 * @date ：2020/8/26 10:34
 * @description：简单工厂单元测试
 * @modified By：
 * @version: $ 1.0
 */
public class SimpleFactoryTest {
    @Test
    public void testRuleConfigResource() {
        RuleConfigSource ruleConfigSource = new RuleConfigSource();
        RuleConfigSource ruleConfigSource1 = new RuleConfigSource();
        try {
            RuleConfig ruleConfig = ruleConfigSource.load("tmp.json");
            RuleConfig ruleConfig1 = ruleConfigSource1.load("tmp.json");
            System.out.println(ruleConfigSource.getParser() == ruleConfigSource1.getParser());
            System.out.println(ruleConfig);
        } catch (InvalidRuleConfigException e) {
            e.printStackTrace();
        }
    }
}
