package com.alct.integration.lbs.controlller;

import com.jiuqi.location.LocationWSService;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/lbs")
public class LbsController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private static final String USER = "HNALCTXX";
    private static final String PASSWD = "abc123";

    @RequestMapping(value="/{mobile}", method = RequestMethod.GET)
    @ResponseBody()
    public void hash(@PathVariable String mobile) {
        LocationWSService service = new LocationWSService();
        String xmlString = service.getLocationWSServiceHttpPort().location(USER, PASSWD, mobile);

    }
}

