/*
 Задание №2
1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java.
 */

/** Cat */
public class Cat {

  private String nickname; // Кличка
  private String color; // Окрас
  private String breed; // Порода
  private Integer age; // Возраст
  private Map<String, Date> vaccinat:
  w ions = new HashMap<>(); // Данные о прививках
  private Map<Integer, Date> shows = new HashMap<>(); // Данные о выставках
  private Map<String, String> plays = new HashMap<>(); // Данные о ролях в спектаклях

  public Cat(String nickname, String color, String breed, Integer age) {
    this.nickname = nickname;
    this.color = color;
    this.breed = breed;
    this.age = age;
  }

  public String getNickname() {
    return this.nickname;
  }

  public void setNickname(String name) {
    this.nickname = name;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String printCat() {
    return String.format("Кличка: %s%nОкрас: %s%nПорода: %s%nВозраст: %s лет%n",
        this.nickname, this.color, this.breed, this.age);

  }

  public void printInfoVaccinations() {
  }

  public void printInfoOfShows() {
  }

  public void printInfoOfPlays() {
  }
}
