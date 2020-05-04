public class Main {
    public static void main(String[] args) {
        CounterStrike player1 = new CounterStrike();
        CounterStrike player2 = new CounterStrike();
        CounterStrike player3 = new CounterStrike();
        CounterStrike player4 = new CounterStrike();
        CounterStrike player5 = new CounterStrike();

        player1.username = "Fauzan";
        player1.exp = 0;
        player1.kill = 0;
        player1.death = 0;
        player1.maps = "Luxville";

        player1.bunuhMusuh(player2);
        System.out.println("Pemain " + player1.username);
        System.out.println("Maps " + player1.maps);
        System.out.println("Kill Musuh " + player1.kill);
        System.out.println("Got Exp " + player1.exp);

        player1.bunuhTeman(player3);
        System.out.println("Pemain " + player1.username);
        System.out.println("Maps " + player1.maps);
        System.out.println("Kill Teman " + player1.kill);
        System.out.println("Got Exp " + player1.exp);


    }
}
