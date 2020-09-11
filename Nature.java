public class Nature {

    public static void main(String[] args) {

        Penguin pingou = new Penguin("Pingou");
        pingou.dive();
        pingou.swimDown(3);
        pingou.swimUp(1);
        pingou.swimDown(4);
        pingou.swimUp(5);
        pingou.swimUp(1);
        pingou.getOut();

        Eagle hawkeye = new Eagle("Hawkeye");
        hawkeye.takeOff();
        hawkeye.ascend(120);
        hawkeye.ascend(30);
        hawkeye.glide();
        hawkeye.descend(140);
        hawkeye.land();
        hawkeye.descend(9);
        hawkeye.land();

        Eagle EyeCherry = new Eagle("Eye Cherry");
        EyeCherry.takeOff();
        EyeCherry.ascend(120);
        EyeCherry.ascend(30);
        EyeCherry.glide();
        EyeCherry.descend(140);
        EyeCherry.land();
        EyeCherry.descend(9);
        EyeCherry.land();
    }
}
