/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polypro.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PC
 */
public class DateHelper {

    //Tạo hằng không thay đổi
    static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy/MM/dd");

    /*
    Chuyển đổi chuỗi String nhập vào sang date
    param date là chuỗi String cần chuyển
    param pattern là định dạng thời gian ("MM/dd/yyyy")
    return về Date
     */
    public static Date toDate(String date, String... pattern) {
        try {
            if (pattern.length > 0) {
                DATE_FORMAT.applyPattern(pattern[0]);
            }
            if (date == null) {
                return DateHelper.now();
            }
            return DATE_FORMAT.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    /*
    Chuyển đổi từ date sang String
    param date là date cần chuyển đổi
    param pattern là ịnh dạng thời gian
    return về kết quả
     */
    public static String toString(Date date, String... pattern) {
        if (pattern.length > 0) {
            DATE_FORMAT.applyPattern(pattern[0]);
        }
        if (date == null) {
            date = DateHelper.now();
        }
        return DATE_FORMAT.format(date);
    }

    //Lấy thời gian hiện tại
    public static Date now() {
        return new Date();
    }

    /*
    Bổ sung ngày vào date
    param date là thời gian hiện có
    param days là ngày cần add vào
    return về kết quả
     */
    public static Date addDay(Date date, int days) {
        date.setTime(date.getTime() + days * 24 * 60 * 60 * 1000);
        return date;
    }

    /*
    Bổ sung ngày vào thời gian hiện tại
    param date là thời gian hiện tại
    param days là ngày cần add vào
    return kết quả
     */
    public static Date add(int days) {
        Date now = DateHelper.now();
        now.setTime(now.getTime() + days * 24 * 60 * 60 * 1000);
        return now;
    }
}
