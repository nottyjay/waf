package info.yangguo.waf;

import info.yangguo.waf.util.PropertiesUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.UnknownHostException;
import java.util.Map;

public class Application {
    private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws UnknownHostException {
        Map<String, String> wafConf = PropertiesUtil.getProperty("waf.properties");
        WafBootStrap.instance(wafConf).start();
    }
}
