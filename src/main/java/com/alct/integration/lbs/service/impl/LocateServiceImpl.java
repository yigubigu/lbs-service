package com.alct.integration.lbs.service.impl;

import com.alct.integration.lbs.model.LbsResponse;
import com.alct.integration.lbs.parser.LbsResponseParser;
import com.alct.integration.lbs.service.LocateSerice;
import com.jiuqi.location.LocationWSService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LocateServiceImpl implements LocateSerice {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private static final String USER = "HNALCTXX";
    private static final String PASSWD = "abc123";

    @Override
    public LbsResponse locate(String mobile) {
        LocationWSService service = new LocationWSService();
        String xmlString = service.getLocationWSServiceHttpPort().location(USER, PASSWD, mobile);
        logger.debug("response " + xmlString);
        return LbsResponseParser.deserialize(xmlString);
    }
}
