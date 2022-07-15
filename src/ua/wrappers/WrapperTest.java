package ua.wrappers;

public class WrapperTest {
    public static void main(String[] args) {

        Character c1 = 'c';
        Character c2 = Character.valueOf('c');
        Character c3 = new Character('c');

        Byte b1 = 55;
        Byte b2 = Byte.valueOf((byte) 55);
        Byte b3 = new Byte((byte) 55);
        Byte b4 = Byte.parseByte("55");

        Short s1 = 555;
        Short s2 = Short.valueOf((short) 555);
        Short s3 = new Short((short) 555);
        Short s4 = Short.parseShort("555");

        Integer i1 = 4444;
        Integer i2 = Integer.valueOf(4444);
        Integer i3 = new Integer(4444);
        Integer i4 = Integer.parseInt("4444");

        Long l1 = 6666l;
        Long l2 = Long.valueOf(6666L);
        Long l3 = new Long(6666L);
        Long l4 = Long.parseLong("6666");

        Float f1 = 5555F;
        Float f2 = Float.valueOf((float) 5555F);
        Float f3 = new Float((float) 5555F);
        Float f4 = Float.parseFloat("5555F");

        Double d1 = 55555d;
        Double d2 = Double.valueOf((double) 55555d);
        Double d3 = new Double((double) 55555d);
        Double d4 = Double.parseDouble("55555d");

        Boolean bl1 = true;
        Boolean bl2 = Boolean.valueOf((boolean) false);
        Boolean bl3 = new Boolean((boolean) true);
        Boolean bl4 = Boolean.parseBoolean("true");

        Double d = 66.88;
        double dd = d;
        byte b = d.byteValue();
        short s = d.byteValue();
        int i = d.intValue();
        long l = d.longValue();
        float f = d.floatValue();

        double one = 0.0;
        double two = 88.66;

        double nanValue = two / one;
        double infValue = one / one;

        System.out.println(nanValue + ", " + infValue + "\n");

        Double nV = 88.66 / 0.0;
        boolean res = nV.isNaN();

        if (res)
            System.out.println(nV + " is NaN");
        else
            System.out.println(nV + " is not NaN");

        Double iV = 0.0 / 0.0;
        boolean result = iV.isNaN();

        if (result)
            System.out.println(iV + " is NaN");
        else
            System.out.println(iV + " is not NaN");

        long test1 = 120;
        long test2 = 120;

        System.out.println(test1 == test2);

        test1 = 1200;
        test2 = 1200;

        System.out.println(test1 == test2);

    }
}

