import java.util.*;
public class Oddeven {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        String b;
        switch (a){
            case 'a':
                b="vowel";
                break;
                case 'e':
                    b="vowel";
                    break;
                    case 'i':
                        b="vowel";
                        break;
                        case 'o':
                        b="vowel";
                        break;
                        case 'u':
                        b="vowel";
                        break;
                        default:
                        b="invalid";
                        break;
        }
        System.out.println(b);
        }
    }

