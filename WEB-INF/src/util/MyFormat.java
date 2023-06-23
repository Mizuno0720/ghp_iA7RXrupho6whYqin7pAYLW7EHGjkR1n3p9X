package util;

import java.text.DecimalFormat;

public class MyFormat {

	/**
	 * 引数で与えられた数字を「xxxx円」（xは任意の数字）のフォーマットに変換するメソッド
	 *
	 * @param price 変換対象の数字
	 * @return 与えられた引数を「xxxx円」に変換した文字列
	 */
	public String moneyFormat(int price) {
		DecimalFormat df = new DecimalFormat("####0" + "円");
		return df.format(price);
	}

}
