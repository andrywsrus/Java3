import java.util.ArrayList;
import java.util.Arrays;

public class LessonOne {
    public static void main(String[] args) {
        System.out.println("������� #1");
        Integer[] ourArray = {11, 22, 33, 44, 55};
        System.out.print("��� ����������� ������: ");
        System.out.println(Arrays.toString(ourArray));
        changeElementsArray(ourArray, 0, 4);
        System.out.print("������ ����� ������������ ���� ������� ���������: ");
        System.out.println(Arrays.toString(ourArray));

        System.out.println("");

        System.out.println("������� #2");
        ArrayList<Integer> listArray = new ArrayList();
        changeElementsToArrayList(listArray, ourArray);
        System.out.print("����������� ������ � ArrayList: ");
        System.out.println(listArray);

        System.out.println("");

        System.out.println("������� #3");

        Box boxOne = new Box(); // ������� 1
        boxOne.add(new Apple()); // ����� ���� �����
        boxOne.add(new Apple());
        System.out.print("��� 1 �������: " + boxOne.getWeight() + ". ");
        System.out.println("� ������� 1 �������� " + boxOne.getFruit().get(0).getClass().getSimpleName());

        Box boxTwo = new Box(); // ������� 2
        boxTwo.add(new Orange()); // ����� ���� ����������
        boxTwo.add(new Orange());
        System.out.print("��� 2 �������: " + boxTwo.getWeight() + ". ");
        System.out.println("� ������� 2 �������� " + boxTwo.getFruit().get(0).getClass().getSimpleName());

        System.out.println("��� ������� c " + boxOne.getFruit().get(0).getClass().getSimpleName() + " � c " +  boxTwo.getFruit().get(0).getClass().getSimpleName() + (boxOne.compare(boxTwo) ? " ����������" : " ������"));

        Box boxThree = new Box(); // ������� 3
        boxThree.add(new Apple());// ����� ��� ������
        boxThree.add(new Apple());
        boxThree.add(new Apple());
        System.out.print("��� 3 �������: " + boxThree.getWeight() + ". ");
        System.out.println("� ������� 3 �������� " + boxThree.getFruit().get(0).getClass().getSimpleName());

        boxOne.rotateFruit(boxThree); //����������
        System.out.println("���������� 1 ������� � 3 �������. ��� 3 �������: " + boxThree.getWeight());
        System.out.println("�����:");
        System.out.println("��� 1 �������: " + boxOne.getWeight());// ���������� 1 �������
        System.out.println("��� 2 �������: " + boxTwo.getWeight());// ���������� 1 �������
        System.out.println("��� 3 �������: " + boxThree.getWeight()); // ���������� 3 �������
        System.out.println("");
        System.out.println("-----------------------------------------------------------");
        System.out.println("���� ��������, � ���������� �������� ������, ������� ������");
        System.out.println("-----------------------------------------------------------");
        try {
            boxTwo.rotateFruit(boxThree);        // ���������� ������ ���� � ���������� �������� ������
        } catch (BoxException e) {
            System.out.println(e);
        }
    }

    public static <T> void changeElementsArray(T[] ourArray, int elementOne, int elementTwo) {
        T returnElementsArray = ourArray[elementOne];
        ourArray[elementOne] = ourArray[elementTwo];
        ourArray[elementTwo] = returnElementsArray;
    }
    public static <T> void changeElementsToArrayList(ArrayList<T> listArray, T[] transformArray) {
        for (T elementsArray : transformArray) {
            listArray.add(elementsArray);
        }
    }
}