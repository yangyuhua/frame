package net.yyh.test;

import net.yyh.frame.service.SampleService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/4/5.
 */
public class SampleTest extends BaseTest {

    @Autowired
    SampleService sampleService;

    @Test
    public void sample(){
//        sampleService.findSampleByfId(1L);
    }
}
