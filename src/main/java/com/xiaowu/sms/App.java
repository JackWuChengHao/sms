package com.xiaowu.sms;

import com.aliyuncs.exceptions.ClientException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
			utils.sendSms("17625037230","测试","2018-03-04 19:00:00");
		} catch (ClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
