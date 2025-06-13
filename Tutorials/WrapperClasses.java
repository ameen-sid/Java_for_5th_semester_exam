package Tutorials;

public class WrapperClasses {

    public void mainFunction() {

        int a = 1;
        Integer b = 1;

        boolean hasGraphicCard = true;
        Boolean isAdult = true;

        Float f = 2.442f;
        Double d = 12.43;
        Character c = 'c';
        Byte bb = 1;
        Short s = 2;
        Long l = 124L;

        System.out.println(Integer.max(1, 2));
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.min(1, 2));
        String str = "123";
        Integer i = Integer.valueOf(str);
        System.out.println(i);
    }
}
