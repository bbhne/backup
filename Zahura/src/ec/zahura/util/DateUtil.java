package ec.zahura.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	/**
	 * 現在時刻取得メソッド
	 *
	 * @return String
	 */
	public String getDate(){

		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

		return simpleDateFormat.format(date);

	}

}
