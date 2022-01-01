
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a number: ");
        long number = input.nextLong();
        System.out.println(convert(number).replaceAll("( +)", " ").trim());
    }

    static String convert(long number) {
        long mod1, mod2, mod3;
        long digits[] = new long[5];
        String convert = "";
        String digits11_19[] = { " ", " یازده ", " دوازده ", " سیزده ", " چهارده ", " پانزده ", " شانوزده ", " هفده ",
                "  هیجده ", " نوزده " };
        String digitsYekan[] = { " ", " یک ", " دو ", " سه ", " چهار ", " پنج ", " شیش ", " هفت ", " هشت ", " نه " };
        String digitsDahgan[] = { " ", " ده ", " بیست ", " سی ", " چهل ", " پنجاه ", " شصت ", " هفتاد ", " هشتاد ",
                " نود " };
        String digitsSadgan[] = { " ", " صد ", " دویست ", " سی صد ", " چهارصد ", " پانصد ", " شش صد ", " هفت صد ",
                " هشت صد ", " نه صد " };

        if (number == 0)
            convert = "صفر";
        else {
            for (int i = 0; i < 5; i++) {
                digits[i] = number % 1000;
                number = number / 1000;
            }

            if (digits[4] > 0) {
                mod1 = digits[4] % 10;
                digits[4] = digits[4] / 10;
                mod2 = digits[4] % 10;
                digits[4] = digits[4] / 10;
                mod3 = digits[4];
                if (mod1 == 0 && mod2 == 0)
                    convert = convert + digitsSadgan[(int) mod3] + "تریلیون";
                else
                    convert = convert + digitsSadgan[(int) mod3];
                if ((mod2 != 0 || mod1 != 0) && mod3 != 0)
                    convert = convert + "و";
                if (mod2 == 1 && mod1 > 0)
                    convert = convert + digits11_19[(int) mod1] + "تریلیون";
                else if (mod2 > 0 && mod1 != 0)
                    convert = convert + digitsDahgan[(int) mod2] + "و" + digitsYekan[(int) mod1] + "تریلیون";
                else if (mod2 != 0)
                    convert = convert + digitsDahgan[(int) mod2] + "تریلیون";
                else if (mod1 != 0)
                    convert = convert + digitsYekan[(int) mod1] + "تریلیون";
                if ((digits[0] != 0 || digits[1] != 0 || digits[2] != 0 || digits[3] != 0))
                    convert = convert + " و ";
            }

            if (digits[3] > 0) {
                mod1 = digits[3] % 10;
                digits[3] = digits[3] / 10;
                mod2 = digits[3] % 10;
                digits[3] = digits[3] / 10;
                mod3 = digits[3];

                if (mod1 == 0 && mod2 == 0)
                    convert = convert + digitsSadgan[(int) mod3] + "میلیارد";
                else
                    convert = convert + digitsSadgan[(int) mod3];
                if ((mod2 != 0 || mod1 != 0) && mod3 != 0)
                    convert = convert + "و";
                if (mod2 == 1 && mod1 > 0)
                    convert = convert + digits11_19[(int) mod1] + "میلیارد";
                else if (mod2 > 0 && mod1 != 0)
                    convert = convert + digitsDahgan[(int) mod2] + "و" + digitsYekan[(int) mod1] + "میلیارد";
                else if (mod2 != 0)
                    convert = convert + digitsDahgan[(int) mod2] + "میلیارد";
                else if (mod1 != 0)
                    convert = convert + digitsYekan[(int) mod1] + "میلیارد";
                if (digits[0] != 0 || digits[1] != 0 || digits[2] != 0)
                    convert = convert + " و ";
            }

            if (digits[2] > 0) {
                mod1 = digits[2] % 10;
                digits[2] = digits[2] / 10;
                mod2 = digits[2] % 10;
                digits[2] = digits[2] / 10;
                mod3 = digits[2];
                if (mod1 == 0 && mod2 == 0)
                    convert = convert + digitsSadgan[(int) mod3] + "میلیون";
                else
                    convert = convert + digitsSadgan[(int) mod3];
                if ((mod2 != 0 || mod1 != 0) && mod3 != 0)
                    convert = convert + "و";
                if (mod2 == 1 && mod1 > 0)
                    convert = convert + digits11_19[(int) mod1] + "میلیون";
                else if (mod2 > 0 && mod1 != 0)
                    convert = convert + digitsDahgan[(int) mod2] + "و" + digitsYekan[(int) mod1] + "میلیون";
                else if (mod2 != 0)
                    convert = convert + digitsDahgan[(int) mod2] + "میلیون";
                else if (mod1 != 0)
                    convert = convert + digitsYekan[(int) mod1] + "میلیون";
                if (digits[0] != 0 || digits[1] != 0)
                    convert = convert + " و ";
            }

            if (digits[1] > 0) {
                mod1 = digits[1] % 10;
                digits[1] = digits[1] / 10;
                mod2 = digits[1] % 10;
                digits[1] = digits[1] / 10;
                mod3 = digits[1];
                if (mod1 == 0 && mod2 == 0)
                    convert = convert + digitsSadgan[(int) mod3] + "هزار";
                else
                    convert = convert + digitsSadgan[(int) mod3];
                if ((mod2 != 0 || mod1 != 0) && mod3 != 0)
                    convert = convert + "و";
                if (mod2 == 1 && mod1 > 0)
                    convert = convert + digits11_19[(int) mod1] + "هزار";
                else if (mod2 > 0 && mod1 != 0)
                    convert = convert + digitsDahgan[(int) mod2] + "و" + digitsYekan[(int) mod1] + "هزار";
                else if (mod2 != 0)
                    convert = convert + digitsDahgan[(int) mod2] + "هزار";
                else if (mod1 != 0)
                    convert = convert + digitsYekan[(int) mod1] + "هزار";
                if (digits[0] != 0)
                    convert = convert + " و ";
            }

            if (digits[0] > 0) {
                mod1 = digits[0] % 10;
                digits[0] = digits[0] / 10;
                mod2 = digits[0] % 10;
                digits[0] = digits[0] / 10;
                mod3 = digits[0];
                convert = convert + digitsSadgan[(int) mod3];
                if ((mod2 != 0 || mod1 != 0) && mod3 != 0)
                    convert = convert + "و";
                if (mod2 == 1 && mod1 > 0)
                    convert = convert + digits11_19[(int) mod1];
                else if (mod2 > 0 && mod1 != 0)
                    convert = convert + digitsDahgan[(int) mod2] + "و" + digitsYekan[(int) mod1];
                else if (mod2 != 0)
                    convert = convert + digitsDahgan[(int) mod2];
                else if (mod1 != 0)
                    convert = convert + digitsYekan[(int) mod1];
            }
        }
        return convert;
    }

}
