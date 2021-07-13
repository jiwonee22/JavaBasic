package java08_abstract.interfaceEx;

interface InterA {
	public abstract void getA();
}

interface InterB {
	public abstract void getB();
}

interface InterC extends InterA, InterB { //인터페이스끼리 상속할 땐 extends 이용
	public abstract void getC();
}


class Children implements InterC {
//class Children implements InterA, InterB, InterC {
	
	@Override
	public void getA() {	
	}
	
	@Override
	public void getB() {
	}
	
	@Override
	public void getC() {
	}
}