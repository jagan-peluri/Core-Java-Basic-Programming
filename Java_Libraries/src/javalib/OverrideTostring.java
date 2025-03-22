package javalib;
class  os{
    String name;
    int age;

    public os(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
   public String toString() {
      return "OverrideTostring{name='" + name + "', age=" + age + "}";
   }
}

class OverrideTostring{
    public static void main(String[] args) {
        os o = new os("John", 25);
        System.out.println(o);
        
    }
}
