package ����2���;

//			 Ŭ���� �̸� implements �������̽� �̸� 
public class MessageBeanEn implements MessageBean{

	@Override // "��Ӱ����� �ִ�"
	public void sayHello(String name) {
		System.out.println("Hello," + name + "!");
	}

}
