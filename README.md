.3. Введение в Maven и Spring Boot
На связи домашнее задание урока 2.3. Введение в Maven и Spring Boot.

### Ваша задача на сегодня: написать простую версию калькулятора.

В качестве сданного домашнего задания на платформу присылайте ссылку на проект в GitHub.
Следуйте инструкции ниже, чтобы справиться с заданием.

### Шаг 1

Создать Spring Boot проект calculator.

### Шаг 2

Подключить модуль Spring Web при создании.

### Шаг 3

Написать 5 методов, которые при вызове из браузера делают следующее:

1. Метод по адресу /calculator должен вернуть приветствие “Добро пожаловать в калькулятор".

2. Метод по адресу /calculator/plus?num1=5&num2=5 должен сложить num1 и num2 и вернуть результат
   в формате “5 + 5 = 10”.

3. Метод по адресу /calculator/minus?num1=5&num2=5 должен вычесть из num1 num2 и вернуть результат
   в формате “5 − 5 = 0”.

4. Метод по адресу /calculator/multiply?num1=5&num2=5 должен умножить num1 на num2 и вернуть результат
   в формате “5 * 5 = 25”.

5. Метод по адресу /calculator/divide?num1=5&num2=5 должен разделить num1 на num2 и вернуть результат
   в формате “5 / 5 = 1”.

### При выполнении задания важно учесть
/calculator повторяется. Рекомендуется использовать @RequestMapping на уровне контроллера.

Деление на 0 в Java выкидывает ошибку.

Если какой-то из двух параметров (или оба) не поданы, нужно вернуть ошибку.

Контроллер не должен вычислять результат, а только делегировать его вычисление сервису.
После получения от него результата контроллер должен сформировать строку и вернуть пользователю в браузер.

###  Критерии оценки задания

– Реализованы все методы.

– Корректная работа с параметрами (наличие и отсутствие).

– Корректная работа с аннотациями.

– Правильно применена архитектура MVC (нет вычислений в контроллере).

### вспомогательная информация - Использованные запросы в строке браузера
http://localhost:8080/calculator
http://localhost:8080/calculator/plus?num1=5&num2=5
http://localhost:8080/calculator/minus?num1=5&num2=5
http://localhost:8080/calculator/multiply?num1=5&num2=5
http://localhost:8080/calculator/divide?num1=5&num2=5
