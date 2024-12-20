public class DataTypesnVariables {
    class InitVar{
        public void initvar(String[] args) {
            byte a = 2;
            short b = 9;
            int c = -3;
            long d = 40909;
            float e = 1;
            double f = 1.01;
            boolean g = true;
            char h = 't';

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);
            System.out.println(f);
            System.out.println(g);
            System.out.println(h);
        }
    }

    public static void main(String[] args) {
        DataTypesnVariables outerInstance = new DataTypesnVariables();
        InitVar innerInstance = outerInstance.new InitVar();
        innerInstance.initvar(args);
    }
}
