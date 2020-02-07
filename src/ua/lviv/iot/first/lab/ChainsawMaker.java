package ua.lviv.iot.first.lab;


public class ChainsawMaker {
    static final int objectCount = 4;

    public static void main(String[] args) {
        Chainsaw powerfulChainsaw = new Chainsaw("Still", 150, 3, 2, "rough");
        Chainsaw badChainsaw = new Chainsaw("Baser", 50, 1, 8, "thin");
        Chainsaw niceChainsaw = new Chainsaw("Gang", 100, 2, 3, "long");

        System.out.println(powerfulChainsaw);
        System.out.println(badChainsaw);
        System.out.println(niceChainsaw);

        Chainsaw.setUseType("Domestic");

        System.out.println();

        System.out.println(powerfulChainsaw);
        System.out.println(badChainsaw);
        System.out.println(niceChainsaw);


        Chainsaw.setUseType("Industrial");

        System.out.println();

        System.out.println(powerfulChainsaw);
        System.out.println(badChainsaw);
        System.out.println(niceChainsaw);

        Chainsaw[] chainsaws = new Chainsaw[objectCount];
        int i = 0;
        while (i < objectCount) {
            chainsaws[i] = new Chainsaw();
            i++;
        }
        System.out.println("\n Elements of chainsaws");
        for (Chainsaw chainsaw : chainsaws) {
            System.out.println(chainsaw);
        }
    }
}

























































































