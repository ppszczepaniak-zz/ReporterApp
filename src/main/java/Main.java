import websites.CustomWebsite;
import websites.VowelWebsite;

public class Main {
    public static void main(String[] args) {
        VowelWebsite vowelWebsite = new VowelWebsite();


        String str1 = "abCd EfGh";
        String str2 = "Cows lose their jobs as milk prices drop";


        vowelWebsite.countAndMark(str1);
        System.out.println("Original message: " + str1);
        System.out.println("Message after: " + vowelWebsite.getConvertedMsg());
        System.out.println("Score after: " + vowelWebsite.getScore());

        System.out.println("==============");
        vowelWebsite.countAndMark(str2);
        System.out.println("Original message: " + str2);
        System.out.println("Message after: " + vowelWebsite.getConvertedMsg());
        System.out.println("Score after: " + vowelWebsite.getScore());

    }
}


