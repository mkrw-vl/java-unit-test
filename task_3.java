// Тесты из предыдущего задания можно объединить в один параметризованный тест. Так код будет поддерживаемым и с ним будет удобнее работать.
//Допиши параметризованный тест checkIsAdultWhenAgeThenResult, который проверит возраст из каждого класса эквивалентности. Учти, что код приложения пишут люди из разных стран, и в некоторых совершеннолетие наступает в 21 год.
//В тест будет передаваться два аргумента: возраст и ожидаемый результат проверки. Реализуй это требование с помощью двумерного массива аргументов.
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getTestData() {
        return Arrays.asList(new Object[][]{
                {18, true},
                {19, true},
                {21, true},
                {20, true}
        });
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(age);
        String message = "Возраст " + age + ", ожидаемый результат: " + result;
        assertEquals(message, result, isAdult);
    }
}