import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.experimental.runners.Enclosed;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
class TestKanjiToInteger {
	static KanjiToInteger kti;
	@BeforeAll
	static void init() {
		kti = new KanjiToInteger();
	}
	@Nested
	@DisplayName("数値のみ")
	class 数値のみ{
		@Test
		void 文字型を数値型に変換() {
			Integer expected = 123;
			Integer number =  kti.toInteger("123");
			assertEquals(expected,number);
		}
		
	}
	@Nested
	@DisplayName("漢字が含まれる")
	class 漢字が含まれる{
		@Test
		void 漢字を数値型に変更() {
			Integer expected = 1984;
			Integer number = kti.toInteger("一九八四");
			assertEquals(expected,number);
			
		}
		/**
		 * 三角測量
		 */
		@Test
		void 漢字を数値型に変更2() {
			//三角測量
			Integer expected2 = 123;
			Integer number2 = kti.toInteger("一二三");
			assertEquals(expected2,number2);

		}
		
	}
	

}
