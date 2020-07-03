package nestedClass;

public class OutterStaticClass {
	static class StaticClass{
		String Nested = "hi";
		static String staticNested = "Hello";
		
		void methoSC() {
			System.out.println("StaticClass.methodSC()");
		}
		
		static void methoStaticSC() {
			System.out.println("StaticClass.methodSC()");
		}
		
	}
}
