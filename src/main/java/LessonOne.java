import java.util.ArrayList;
import java.util.Arrays;

public class LessonOne {
    public static void main(String[] args) {
        System.out.println("Задание #1");
        Integer[] ourArray = {11, 22, 33, 44, 55};
        System.out.print("Наш изначальный массив: ");
        System.out.println(Arrays.toString(ourArray));
        changeElementsArray(ourArray, 0, 4);
        System.out.print("Массив после перестановки двух крайних элементов: ");
        System.out.println(Arrays.toString(ourArray));

        System.out.println("");

        System.out.println("Задание #2");
        ArrayList<Integer> listArray = new ArrayList();
        changeElementsToArrayList(listArray, ourArray);
        System.out.print("Преобразуем массив в ArrayList: ");
        System.out.println(listArray);

        System.out.println("");

        System.out.println("Задание #3");

        Box boxOne = new Box(); // коробка 1
        boxOne.add(new Apple()); // кладём пару яблок
        boxOne.add(new Apple());
        System.out.print("Вес 1 коробки: " + boxOne.getWeight() + ". ");
        System.out.println("В коробке 1 хранятся " + boxOne.getFruit().get(0).getClass().getSimpleName());

        Box boxTwo = new Box(); // коробка 2
        boxTwo.add(new Orange()); // кладём пару апельсинов
        boxTwo.add(new Orange());
        System.out.print("Вес 2 коробки: " + boxTwo.getWeight() + ". ");
        System.out.println("В коробке 2 хранятся " + boxTwo.getFruit().get(0).getClass().getSimpleName());

        System.out.println("Вес коробок c " + boxOne.getFruit().get(0).getClass().getSimpleName() + " и c " +  boxTwo.getFruit().get(0).getClass().getSimpleName() + (boxOne.compare(boxTwo) ? " одинаковый" : " разный"));

        Box boxThree = new Box(); // коробка 3
        boxThree.add(new Apple());// кладём три яблока
        boxThree.add(new Apple());
        boxThree.add(new Apple());
        System.out.print("Вес 3 коробки: " + boxThree.getWeight() + ". ");
        System.out.println("В коробке 3 хранятся " + boxThree.getFruit().get(0).getClass().getSimpleName());

        boxOne.rotateFruit(boxThree); //пересыпаем
        System.out.println("Пересыпаем 1 коробку в 3 коробку. Вес 3 коробки: " + boxThree.getWeight());
        System.out.println("Итого:");
        System.out.println("Вес 1 коробки: " + boxOne.getWeight());// взвешиваем 1 коробку
        System.out.println("Вес 2 коробки: " + boxTwo.getWeight());// взвешиваем 1 коробку
        System.out.println("Вес 3 коробки: " + boxThree.getWeight()); // взвешиваем 3 коробку
        System.out.println("");
        System.out.println("-----------------------------------------------------------");
        System.out.println("если например, к апельсинам добавить яблоки, покажем ошибку");
        System.out.println("-----------------------------------------------------------");
        try {
            boxTwo.rotateFruit(boxThree);        // показываем ошибку если к апельсинам добавить яблоки
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