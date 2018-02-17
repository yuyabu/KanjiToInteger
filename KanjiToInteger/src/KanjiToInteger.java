import java.util.HashMap;
import java.util.Map;

import javax.management.ImmutableDescriptor;

public class KanjiToInteger {
	private Map<String,String> kanJiNumMap = Map.of(
		    "一","1",
		    "二","2",
		    "三","3",
		    "四","4",
		    "五","5",
		    "六","6",
		    "七","7",
		    "八","8",
		    "九","9",
		    "零","0");

	Integer toInteger(String s) {
		if(s.matches("[0-9]+")) {
			return strToInt(s);
			
		}else if(s.matches("(一|二|三|四|五|六|七|八|九|零)+")){
			StringBuilder b = new StringBuilder(s);
			for (Map.Entry<String, String> m : kanJiNumMap.entrySet()) {
				int i;
				while ((i = b.indexOf(m.getKey())) > -1) {
					b.replace(i, i + m.getKey().length(), m.getValue());
				}
			}
			return strToInt(b.toString());
		}
		return null;
	}
	/**
	 * 
	 * @param Kanji
	 * @return
	 */
	private Integer strToInt(String Kanji) {
		return Integer.valueOf(Kanji);
	}
	

}
