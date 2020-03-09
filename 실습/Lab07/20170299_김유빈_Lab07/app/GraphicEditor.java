/*Shape 클래스는 base 패키지에, Circle 클래스는 derived 패키지에, GraphicEditor 클래스는 app 패키지에 분리 작성 
Circle 클래스는 Shape 클래스를 상속받는다.
public GraphicEditor 클래스에서 main함수를 실행한다. 여기서 '업캐스팅' 하여 draw()를 실행한다.
결과적으로 동적할당되어 Circle 클래스의 draw()함수가 실행되어야 함
 */
package app;

import base.Shape; //외부 패키지의 클래스에 대한 새로운 객체를 생성할 때 import 이용
import derived.Circle;

public class GraphicEditor {
	public static void main(String[] args) {
		Shape shape = new Circle();
		shape.draw();
	}
}
