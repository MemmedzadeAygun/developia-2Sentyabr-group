package test;

public class Test<T> {
	T object;

	public Test(T _obj) {
		this.object = _obj;
	}

	public T getObject() {
		return object;
	}

	@Override
	public String toString() {
		return "Test [object=" + object + "]";
	}

}
