package indi.ljf.pattern.builder;

import org.apache.commons.lang3.StringUtils;

/**
 * @author ：ljf
 * @date ：2020/8/27 9:34
 * @description：构建者模式 1.解决构造器参数过多问题
 * 2.解决类属性验证问题，多个属性之间相互依赖
 * 3.解决创建后的对象不可变问题，也就是没有set方法
 * @modified By：
 * @version: $ 1.0
 */
public class ResourcePoolConfig {
    private String name;
    private int maxTotal;
    private int minIdle;
    private int maxIdle;

    /**
     * 私有构造器，只能通过构建者模式创建对象
     */
    private ResourcePoolConfig(Builder builder) {
        this.maxTotal = builder.maxTotal;
        this.maxIdle = builder.maxIdle;
        this.minIdle = builder.minIdle;
    }

    public String getName() {
        return name;
    }

    public int getMaxTotal() {
        return maxTotal;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public static class Builder {
        private static final int DEFAULT_MAX_TOTAL = 8;
        private static final int DEFAULT_MAX_IDLE = 8;
        private static final int DEFAULT_MIN_IDLE = 0;

        private String name;
        private int maxTotal = DEFAULT_MAX_TOTAL;
        private int minIdle = DEFAULT_MIN_IDLE;
        private int maxIdle = DEFAULT_MAX_IDLE;

        public ResourcePoolConfig build() {
            // 校验逻辑放到这里来做，包括必填项校验、依赖关系校验、约束条件校验等
            if (StringUtils.isBlank(name)) {
                throw new IllegalArgumentException("name must not isEmpty");
            }
            if (maxIdle > maxTotal) {
                throw new IllegalArgumentException("maxIdle should less than maxTotal");
            }
            if (minIdle > maxTotal || minIdle > maxIdle) {
                throw new IllegalArgumentException("minIdle should less than maxTotal and maxIdle");
            }

            return new ResourcePoolConfig(this);
        }

        public Builder setName(String name) {
            if (StringUtils.isBlank(name)) {
                throw new IllegalArgumentException("name not supported empty");
            }
            this.name = name;
            return this;
        }

        public Builder setMaxTotal(int maxTotal) {
            if (maxTotal <= 0) {
                throw new IllegalArgumentException("maxTotal not supported negative");
            }
            this.maxTotal = maxTotal;
            return this;
        }

        public Builder setMaxIdle(int maxIdle) {
            if (maxIdle < 0) {
                throw new IllegalArgumentException("maxIdle not supported negative");
            }
            this.maxIdle = maxIdle;
            return this;
        }

        public Builder setMinIdle(int minIdle) {
            if (minIdle < 0) {
                throw new IllegalArgumentException("minIdle not supported negative");
            }
            this.minIdle = minIdle;
            return this;
        }
    }

    public static void main(String[] args) {
        ResourcePoolConfig resourcePoolConfig = new Builder()
                .setName("dbConnectionPool")
                .setMaxIdle(8)
                .setMaxTotal(8)
                .setMinIdle(0)
                .build();

        System.out.println(resourcePoolConfig);
    }
}
