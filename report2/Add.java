//1. default ��Ű���� �ϳ� ���Ͽ��� Calc, �ٸ� �ϳ��� ���Ͽ��� Add, Sub, Mul, Div Ŭ������ ����
class OtherCalc{ //Add, Sub, Mul, Div Ŭ�������� ����� �޼ҵ�� �ʵ带 �����ϴ� �θ� Ŭ����
	int a, b; //�ΰ��� �ǿ�����
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
class Add extends OtherCalc{ //OtherCalcŬ������ �ڽ� Ŭ���� Add
	int calculate() { //���� ����
		return a + b;
	}
}

class Sub extends OtherCalc{
	int calculate() { //���� ����
		return a - b;
	}
}

class Mul extends OtherCalc{
	int calculate() { //���� ����
		return a * b;
	}
}
class Div extends OtherCalc{
	int calculate() { //������ ����
		return a / b;
	}
}
