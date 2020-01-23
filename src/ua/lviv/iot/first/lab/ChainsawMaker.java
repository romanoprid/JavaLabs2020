package ua.lviv.iot.first.lab;

public class ChainsawMaker {
    static final int objectCount = 4;

    public static void main(String[] args) {
        Chainsaw powerfulChainsaw = new Chainsaw(2000, 150, 3, "Ukraine", "rough");
        Chainsaw badChainsaw = new Chainsaw(200, 50, 1, "Egypt", "thin");
        Chainsaw niceChainsaw = new Chainsaw(1000, 100, 2, "Japan", "long");

        System.out.println(powerfulChainsaw);
        System.out.println(badChainsaw);
        System.out.println(niceChainsaw);

        Chainsaw.setUseType("Domestic");


        System.out.println(powerfulChainsaw);
        System.out.println(badChainsaw);
        System.out.println(niceChainsaw);


        Chainsaw.setUseType("Industrial");


        System.out.println(powerfulChainsaw);
        System.out.println(badChainsaw);
        System.out.println(niceChainsaw);

        Chainsaw[] array = new Chainsaw[objectCount];
        int i = 0;
        while (i < objectCount) {
            array[i] = new Chainsaw();
            i++;
        }
        System.out.println("\n Elements of array");
        for (Chainsaw chainsaw : array) {
            System.out.println(chainsaw);
        }
    }
}

