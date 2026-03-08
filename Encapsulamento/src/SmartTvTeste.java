public class SmartTvTeste {
    public static void main(String[] args) {
        SmartTV tv1 = new SmartTV();
        tv1.setVolume(150);
        tv1.setVolume(50);
        System.out.println("Volume de tv1 " + tv1.getVolume());

        SmartTV tv2 = new SmartTV("Samsung", "Windescreen 65", 0, true);
    }
}