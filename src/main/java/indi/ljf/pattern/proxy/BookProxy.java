package indi.ljf.pattern.proxy;

/**
 * @author ：ljf
 * @date ：2020/7/14 17:41
 * @description：书中的代理模式示例
 * @modified By：
 * @version: $ 1.0
 */
public class BookProxy {
    public static void main (String[] args) throws java.lang.Exception
    {
        GeometryCalculatorBean circle = GeometryCalculatorBeanFactory.REMOTE_PROXY.makeGeometryCalculator();
        System.out.printf("Circle diameter %f\n", circle.calculateCircleCircumference(new Circle()));
    }
}

class Circle {

}
interface GeometryCalculatorBean {
    public double calculateCircleCircumference(Circle circle);
}

class GeometryBean implements GeometryCalculatorBean {

    public double calculateCircleCircumference(Circle circle) {
        return 0.1f;
    }
}

class GeometryBeanProxy implements GeometryCalculatorBean {
    private GeometryCalculatorBean bean;

    public GeometryBeanProxy() throws Exception {
        bean = doJNDILookup("remote://localhost:4447", "user", "password");
    }

    private GeometryCalculatorBean doJNDILookup(
            final String urlProvider, final String securityPrincipal, final String securityCredentials)
            throws Exception {
        System.out.println("Do JNDI lookup for bean");
        Thread.sleep(123);//simulate JNDI load for the remote location
        return GeometryCalculatorBeanFactory.LOCAL.makeGeometryCalculator();
    }

    public double calculateCircleCircumference(Circle circle) {
        return bean.calculateCircleCircumference(circle);
    }
}

enum GeometryCalculatorBeanFactory {
    LOCAL {
        public GeometryCalculatorBean makeGeometryCalculator() {
            return new GeometryBean();
        }
    },
    REMOTE_PROXY {
        public GeometryCalculatorBean makeGeometryCalculator() {
            try {
                return new GeometryBeanProxy();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return null;
        }
    };

    public abstract GeometryCalculatorBean makeGeometryCalculator();
}
