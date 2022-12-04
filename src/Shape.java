/*Ты делаешь графический редактор.

        Продумай иерархию классов. Здесь должны быть как минимум:

        базовый класс для фигуры Shape. Этот класс должен иметь метод для вывода имени фигуры.
        классы-наследники - Circle, Quad, Triangle, Rhombus, Trapezoid и т.д. - не меньше 5 вариантов;
        должен быть класс, который принимает фигуру, и выводит ее название. Класс должен работать именно с базовым
        классом Shape.
        Обрати внимание на использование интерфейсов, абстрактных классов, модификаторов доступа.

        Нет единого правильного способа решения этой задачи. Попытайся спроектировать гибкую архитектуру,
        задавая себе вопросы вида "А что будет, если этот класс нужно будет менять? Что еще поменяется, " +
        "если здесь нужно будет расширить?".
*/
public class Shape implements Circle, Quad, Triangle, Rhombus, Trapezoid {

    @Override
    public void doCircle() {
        System.out.println("doing Circle");
    }

    @Override
    public void doQuad() {
        System.out.println("doing Quad");
    }

    @Override
    public void doRhombus() {
        System.out.println("doing Triangle");
    }

    @Override
    public void doTrapezoid() {
        System.out.println("doing Rhombus");
    }

    @Override
    public void doTriangle() {
        System.out.println("doing Trapezoid");
    }

    public static void main(String[] args) {
        Shape implementation = new Shape();
        implementation.doCircle();
        implementation.doQuad();
        implementation.doRhombus();
        implementation.doTrapezoid();
        implementation.doTriangle();
    }
}

