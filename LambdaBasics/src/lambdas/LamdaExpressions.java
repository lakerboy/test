package lambdas;

public class LamdaExpressions {

	@FunctionalInterface
	interface LambdaInterface{
		void someMethod(String s, Integer i);
	}
	
	@FunctionalInterface
	interface MyLambda{
		void foo();
	}
	
	@FunctionalInterface
	interface AddLambda{
		int foo(int a, int b);
	}
	
	public static void doSomething(LambdaInterface someLambda){
		someLambda.someMethod("Val", 1);
	}
	
	
	public static void main(String[] args) {
		
		LambdaInterface myLambda = (s, i) -> {
			System.out.println("Hello " + s);
			System.out.println("You are number " + 1); 
		};
			
		doSomething(myLambda);
		
		
		// 
		MyLambda expr1 = () -> System.out.println("Hello Lambda World");
		
		AddLambda expr2 = (int a, int b) -> a + b;
		
	}
}
