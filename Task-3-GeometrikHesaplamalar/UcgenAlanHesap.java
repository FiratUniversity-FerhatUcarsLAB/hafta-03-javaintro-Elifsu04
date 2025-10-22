class UcgenHesap {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 5;
        double s = (a+b+c)/2;
        double alan = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        System.out.println("...Heron Formülü ile Üçgen Alanı Hesaplama...");
        System.out.println("Kenar uzunlukları: a=" + a +",b=" + b +",c=" + c);
        System.out.println("Yarı Çevre (s): " + s);
        System.out.println("Alan(Hesaplanmamış Değer):" + alan);
    }
}
...Heron Form?l? ile ??gen Alan? Hesaplama...
Kenar uzunluklar?: a=3.0,b=4.0,c=5.0
Yar? ?evre (s): 6.0
Alan(Hesaplanmam?? De?er):6.0

=== Code Execution Successful ===
