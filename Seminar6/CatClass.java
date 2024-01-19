/** CatClass */
import java.util.Objects;
public class CatClass {

  private String owner;
  private String nickName;
  private String color;
  private String breed;
  private int age;

  public CatClass(String owner, String nickName, String color, String breed, int age) {
    this.owner = owner;
    this.nickName = nickName;
    this.color = color;
    this.breed = breed;
    this.age = age;
  }

  public String getNickname() {
    return nickName;
  }

  public String getOwner() {
    return owner;
  }

  public String getColor() {
    return color;
  }

  public String getBreed() {
    return breed;
  }

  public int getAge() {
    return age;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public void setNickname(String nickname) {
    this.nickName = nickName;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setBreed(String bree) {
    this.breed = breed;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
      // TODO Auto-generated method stub
      return String.format("Кот(Владелец: %s Кличка: %s Окрас: %s Порода: %s Возраст: %d)",owner,nickName,color,breed,age);
  }

  
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CatClass cat = (CatClass) o;
    return age == cat.age && Objects.equals(owner, cat.owner) && 
    Objects.equals(nickName, cat.nickName) && 
    Objects.equals(color, cat.color) && 
    Objects.equals(breed, cat.breed);
}

@Override
public int hashCode() {
    return Objects.hash(owner, nickName, color, breed, age);
}
}
