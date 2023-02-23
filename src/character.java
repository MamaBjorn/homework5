import java.util.Scanner;

public class character {
    String name;
    int hp=45;
    int age = 18;
    String phrase;
    public void yourName() {
        System.out.println("кто ты, воин?");
        Scanner s = new Scanner(System.in);
        name = s.next();
        System.out.println(name);
    }
    protected void growingUp() {
        age++;
        System.out.println(age);
    }

    protected void sayHi(){
        System.out.println("отстань от меня, я даже драться не могу(ಥ﹏ಥ)");
    }
    protected void attack(){
        hp--;
        if (hp<10){
            System.out.println("хватит,убьешьсяಠ益ಠ");
        }
        System.out.println(hp);
    }
}
