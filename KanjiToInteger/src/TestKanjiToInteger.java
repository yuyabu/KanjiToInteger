import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestKanjiToInteger {
	static KanjiToInteger kti;
	@BeforeAll
	static void init() {
		kti = new KanjiToInteger();
	}
	@Test
	void test() {
		Integer expected = 123;
		Integer number =  kti.toInteger("123");
		assertEquals(expected,number);
	}

}
