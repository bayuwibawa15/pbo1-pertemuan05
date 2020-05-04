import org.w3c.dom.css.Counter;

public class CounterStrike {
    String username;
    String maps;
    int kill;
    int death;
    int exp;

    void bunuhMusuh(CounterStrike GotKill){
        exp += 100;
        kill += 1;
        System.out.println("Nice SHOT!!!");

    }
    void bunuhTeman(CounterStrike OhNo){
        exp -= 75;
        System.out.println("Dont Kill Your Friends!!!");

    }
    void bunuhDiri(CounterStrike NOOB){
        exp -= 50;
        System.out.println("Huhu.. you NOOB");

    }
    void Death(CounterStrike Die){
        exp -= 25;
        System.out.println("you Die...");

    }
}
