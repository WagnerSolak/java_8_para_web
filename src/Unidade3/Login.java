package Unidade3;

public class Login<T,V> {

	T obj1;
	T obj2;
	
	
	
	
	public Login(T obj1, T obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public T getObj1() {
		return obj1;
	}
	public void setObj1(T obj1) {
		this.obj1 = obj1;
	}
	public T getObj2() {
		return obj2;
	}
	public void setObj2(T obj2) {
		this.obj2 = obj2;
	}
	
	public void showType(){
		System.out.println(obj1.getClass().getName());
		System.out.println(obj2.getClass().getName());
	}
}