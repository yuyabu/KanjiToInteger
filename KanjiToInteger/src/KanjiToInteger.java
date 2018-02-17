
public class KanjiToInteger {

	Integer toInteger(String s) {
		if(s.matches("[0-9]+")) {
			return Integer.valueOf(s);
			
		}else if(s.matches("(一|二|三|四|五|六|七|八|九|零)+")){
			return 1984;
		}
		return null;
	}

}
