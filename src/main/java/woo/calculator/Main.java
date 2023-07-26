package woo.calculator;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import woo.calculator.parser.CalParser;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Objects;

/**
 * Created by wujianchao on 2022/11/23.
 */
public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) throws IOException, URISyntaxException {
        File f = new File(Objects.requireNonNull(Main.class.getClassLoader().getResource("cal_expr.txt")).toURI());
        String content = Files.asCharSource(f, Charsets.UTF_8).read();
        CalParser parser= new CalParser();
        Integer ret = parser.parse(content);
        LOG.info(ret + "");
    }
}
