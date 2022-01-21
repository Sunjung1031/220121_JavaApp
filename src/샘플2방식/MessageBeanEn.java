package 샘플2방식;

//			 클래스 이름 implements 인터페이스 이름 
public class MessageBeanEn implements MessageBean{

	@Override // "약속개념이 있다"
	public void sayHello(String name) {
		System.out.println("Hello," + name + "!");
	}

}
