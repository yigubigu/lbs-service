package com.alct.integration.lbs;

import com.alct.integration.lbs.model.LbsResponse;
import com.alct.integration.lbs.parser.LbsResponseParser;
import org.junit.Test;

public class LbsResponseParseTest {

    @Test
    public void testParse() {
        String res = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><info><msid>18652225998</msid><result>0</result><latitude>39.818288976648994</latitude><longitude>116.37724871224427</longitude><altitude>0</altitude><radius>0.0</radius><posour>6</posour><localtime>2016-03-10 15:03:53</localtime><province>北京市</province><city></city><country>丰台区</country><roamcity></roamcity><textDesc>北京市丰台区南苑乡槐房钓鱼公园槐房路160号, 附近道路:马家堡路, 附近交叉口:槐房北路与槐房路交叉口</textDesc></info>";
        LbsResponse obj =  LbsResponseParser.deserialize(res);
        System.out.println(obj.toString());
    }
}
