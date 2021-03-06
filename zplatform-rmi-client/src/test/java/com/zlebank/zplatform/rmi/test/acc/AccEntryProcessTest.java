/* 
 * AccEntryProcessTest.java  
 * 
 * version TODO
 *
 * 2016年8月17日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.test.acc;

import java.math.BigDecimal;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zlebank.zplatform.acc.bean.TradeInfo;
import com.zlebank.zplatform.acc.bean.enums.TradeType;
import com.zlebank.zplatform.acc.service.entry.EntryEvent;
import com.zlebank.zplatform.rmi.acc.IAccEntryService;
import com.zlebank.zplatform.rmi.test.BaseTest;

/**
 * 账务测试
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 下午4:15:23
 * @since 
 */
public class AccEntryProcessTest extends BaseTest{
    
    @Autowired
    private IAccEntryService accEntryService;
    @Test
    public void accEntryProcessTest() throws Exception{
        /*TradeInfo tradeInfo = new TradeInfo();
        String seqTxnNo = String.format("%1$ty%1$tm%1$td%1$tH%1$tM%1$tS",
                new Date()) + 1;
        tradeInfo.setSplit(false);
        BigDecimal fee = new BigDecimal(10);
        BigDecimal channelFee = new BigDecimal(0);
        BigDecimal amount = new BigDecimal(250);
        tradeInfo.setAmount(amount);
        tradeInfo.setPayMemberId("999999999999999");
        tradeInfo.setPayToMemberId("200000000000626");
        tradeInfo.setBusiCode(TradeType.RECHARGE.getCode());
        tradeInfo.setChannelId("35852693");
        tradeInfo.setTxnseqno(seqTxnNo);
        tradeInfo.setChannelFee(channelFee);

        tradeInfo.setCharge(fee);
        tradeInfo.setCoopInstCode("300000000000037");
        try {
            accEntryService
                    .accEntryProcess(tradeInfo, EntryEvent.TRADE_SUCCESS);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    	
    	TradeInfo entry = new TradeInfo();
        entry.setPayMemberId("200000000001399");
        entry.setPayordno("M2016082513487124");
        entry.setCoopInstCode("300000000000004");
        entry.setPayToMemberId("200000000001399");
       entry.setChannelId("95000001");
        entry.setTxnseqno("1608259900066723");
        entry.setBusiCode(TradeType.RECHARGE.getCode());
        entry.setAmount(new BigDecimal(1011));
        entry.setCommission(new BigDecimal(0));
        entry.setCharge(new BigDecimal(0));
        System.out.println("start");
        try {
        	accEntryService.accEntryProcess(entry,EntryEvent.TRADE_SUCCESS);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
