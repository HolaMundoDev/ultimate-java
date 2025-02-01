public class Main {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean c = a || b; // true
        boolean d = a && b; // false

        System.out.println(c);
        System.out.println(d);

        boolean x = !a; // false
        System.out.println(x);

        boolean isAdult = true;
        boolean isActive = false;
        boolean isPremium = true;
        boolean isON = true;

        String coupon = "chanchito_feliz";

        boolean promo = coupon.equals("ultimate_java") ||  coupon.equals("chanchito_feliz");

        boolean hasFunds = true;

        boolean canPurchase = isAdult && isActive && isPremium && isON && promo;
    }
}