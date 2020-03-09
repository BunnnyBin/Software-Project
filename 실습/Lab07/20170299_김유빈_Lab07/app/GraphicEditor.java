/*Shape Ŭ������ base ��Ű����, Circle Ŭ������ derived ��Ű����, GraphicEditor Ŭ������ app ��Ű���� �и� �ۼ� 
Circle Ŭ������ Shape Ŭ������ ��ӹ޴´�.
public GraphicEditor Ŭ�������� main�Լ��� �����Ѵ�. ���⼭ '��ĳ����' �Ͽ� draw()�� �����Ѵ�.
��������� �����Ҵ�Ǿ� Circle Ŭ������ draw()�Լ��� ����Ǿ�� ��
 */
package app;

import base.Shape; //�ܺ� ��Ű���� Ŭ������ ���� ���ο� ��ü�� ������ �� import �̿�
import derived.Circle;

public class GraphicEditor {
	public static void main(String[] args) {
		Shape shape = new Circle();
		shape.draw();
	}
}
