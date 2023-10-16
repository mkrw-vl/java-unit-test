// Метод checkIsAdult класса Program принимает в качестве аргумента возраст и возвращает true, если пользователю 18 лет или больше, и false, если пользователь младше 18 лет.
//Допиши проверку в тест, который проверяет, что если пользователю больше 18 лет, то вернётся true. Добавь понятный текст ошибки на случай, если тест упадёт.
@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);

        assertEquals("Ожидалось, что пользователь с возрастом 19 лет будет считаться взрослым", true, isAdult);
        }