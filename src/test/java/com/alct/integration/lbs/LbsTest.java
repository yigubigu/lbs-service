package com.alct.integration.lbs;

import com.alct.integration.lbs.model.LbsResponse;
import com.alct.integration.lbs.parser.LbsResponseParser;
import com.jiuqi.location.LocationWSService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

public class LbsTest {

    private static final String USER = "HNALCTXX";
    private static final String PASSWD = "abc123";

    @Test
    public void testGetLocation() {
        LocationWSService service = new LocationWSService();
        String xmlString = service.getLocationWSServiceHttpPort().location(USER, PASSWD, "17521030508");

        LbsResponse response = LbsResponseParser.deserialize(xmlString);

        System.out.println(response.toString());
    }

}
