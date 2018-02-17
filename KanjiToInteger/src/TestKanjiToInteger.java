import static org.junit.Assert.fail;
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
		@DisplayName("123の文字->数字変換")
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
		@DisplayName("一九八四を1984に変換")
		void 一九八四を1984に変換() {
			Integer expected = 1984;
			Integer number = kti.toInteger("一九八四");
			assertEquals(expected,number);
		}
		@Test
		@DisplayName("漢字と数字が混ざった時")
		void 漢字と数字が混ざった時(){
			Integer expected = 1984;
			Integer number = kti.toInteger("一9八四");
			assertEquals(expected,number);
		}
		@Nested
		@DisplayName("例外系のテスト")
		class 例外{
			@DisplayName("数値でない漢字が来た時の対応")
			@Test
			void 数値でない漢字が来た時の例外のテスト() {
				try{
					kti.toInteger("数値でない");
					fail();
				}catch(Exception e) {
				}
			}
			
		}
	}
	@Nested
	@DisplayName("そのほかのテスト")
	class その他のテスト{
	}
}
