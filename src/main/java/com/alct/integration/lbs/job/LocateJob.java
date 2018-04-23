package com.alct.integration.lbs.job;

import ch.qos.logback.classic.Logger;
import com.alct.integration.lbs.dao.entity.PhoneLbsTraceEntity;
import com.alct.integration.lbs.dao.mapper.PhoneLbsTraceEntityMapper;
import com.alct.integration.lbs.model.LbsResponse;
import com.alct.integration.lbs.service.LocateSerice;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class LocateJob {

    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PhoneLbsTraceEntityMapper mapper;

    @Autowired
    private LocateSerice locateSerice;
    // fixedRate is base on micro second
    // 1000 * 60 = 1 minute
    // 1000 * 60 * 10 = 10 minutes
    @Scheduled(fixedRate = 1000 * 60 * 10 )
    public void locatePhone() {
        try {
            logger.debug("start job");
            LbsResponse obj = locateSerice.locate("15038355543 ");
            LbsResponse obj2 = locateSerice.locate("18837157240");
            this.mapper.insert(obj.toEntity());
            this.mapper.insert(obj2.toEntity());

        } catch (Exception ex) {
            logger.error("cannot sync phone trace", ex);

        }

    }
}
