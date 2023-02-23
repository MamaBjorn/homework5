public class shooter extends character {
    int arrows=20;
    @Override
    protected void sayHi() {
        System.out.println("привет, путник, я король снайперов из деревни снайперов." +
                " у меня 894572796687652278472456 последователей, по этому даже не смей нападать на меня.<(￣︶￣)>");
    }

    @Override
    protected void attack() {
        arrows--;
        if (arrows<5){
            System.out.println("похоже пора сматыватьಠﭛಠ");
        }
        System.out.println(arrows);
    }
}
