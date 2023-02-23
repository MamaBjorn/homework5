public class Wizard extends character{
    int mana=50;


    @Override
    protected void sayHi() {
        System.out.println("здравствуй путник, попробуй моё новое, совершено непонятное, ноявно безопасное зелье(￣ω￣)");
    }
    @Override
    protected void attack() {
        mana--;
        if (mana<10){
            System.out.println("нужно использовать невидимость и убежатьಠ⌣ಠ");
        }
        System.out.println(mana);
    }
}