public class MainClass
{
//    Задание 1. Сделать класс MainClass.
//    В классе MainClass сделать метод, который возвращает число 14 (назвать: getLocalNumber).
//    Сделать класс MainClassTest.
//    В классе MainClassTest написать тест, проверяющий, что метод getLocalNumber возвращает число 14 (назвать: testGetLocalNumber).
//    Не забываем в проверку добавлять понятный текст ошибки.
//    Результат выполнения закоммитить в репозиторий на гитхаб и прислать ссылку на коммит.

    public int getLocalNumber() {
        int a = 14;
        return a;
    }

//    Задание 2. Сделать класс MainClass (если еще нет).
//    Сделать в классе MainClass приватное поле класса, которое равно 20 (назвать: class_number), и публичный метод (getClassNumber), который эту переменную возвращает.
//    Сделать класс MainClassTest (если еще нет).
//    В классе MainClassTest написать тест (назвать testGetClassNumber), который проверяет, что метод getClassNumber возвращает число больше 45.
//    Не забываем в проверку добавлять понятный текст ошибки.
//    Результат выполнения закоммитить в репозиторий на гитхаб и прислать ссылку на коммит.


    private int class_number = 46;

    public int getClassNumber()
    {
        return this.class_number;
    }

//    Задание 3. Сделать класс MainClass (если еще нет).
//    Сделать в классе MainClass приватное поле класса, которое равно строке “Hello, world” (назвать: class_string), и публичный метод (назвать: getClassString), который возвращает строку.
//    Сделать класс MainClassTest (если еще нет).
//    В классе MainClassTest написать тест (назвать testGetClassString), который проверяет, что метод getClassString возвращает строку, в которой есть подстрока “hello” или “Hello”, если нет ни одной из подстрок - тест падает.
//    Не забываем в проверку добавлять понятный текст ошибки.
//    Результат выполнения закоммитить в репозиторий на гитхаб и прислать ссылку на коммит.

    private String class_string = "Hello, world";

    public String getClassString()
    {
        return this.class_string;
    }

}
