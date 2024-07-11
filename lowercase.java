import java.util.*;

class SmartGym {
    Scanner sc = new Scanner(System.in);

    public void admin() {
        System.out.println("Hello!,Enter your details:");
        System.out.println("Admin ID:");
        int id = sc.nextInt();
        if (id == 1 || id == 2 || id == 3) {
            System.out.println("Welcome!🙏🙏🙏🙏🙏");

        } else {
            System.out.println("Invalid details");
        }
        System.out.printf("\n\n");
    }

    public void user() {
        System.out.println("Please Enter your Details:💖💖💖");
        System.out.println("User Name:");
        String name = sc.next();
        System.out.println("Hello!🖐" + name + " Welcome to our SmartGym💖💖💖");
        System.out.println("Enter your mobile number:");
        int mobile = sc.nextInt();
        System.out.println("Gender:");
        System.out.printf("\n female👸💕💕\n male 🤴💕💕\n");
        String gender = sc.next();
        if (gender.equals("female")) {
            System.out.println("Select your type of fitness,do you want?");
            SmartGym gy = new SmartGym();
            gy.ladies();
        } else if (gender.equals("male")) {
            System.out.println("Select your type of fitness,do you want?");
            SmartGym ga = new SmartGym();
            ga.gents();
        } else {

        }
    }

    public void ladies() {
        System.out.println("Enter your choice");
        // int ch=sc.nextInt();
        // do
        // {
        System.out.println("💕💕💖MENU💖💕💕");
        System.out.printf("\n1.Loose weight\n2.Gain weight\n");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("How much weight Do you want to Loose:");
                int los = sc.nextInt();
                SmartGym gy = new SmartGym();
                gy.loose();
                break;
            case 2:
                System.out.println("How much weight Do you want to gain:");
                int gain = sc.nextInt();
                SmartGym ga = new SmartGym();
                ga.gain();
                break;
        }
        // }while(ch!=2);
    }

    public void gents() {
        System.out.println("Enter your choice");
        // int ch=sc.nextInt();
        // do
        // {
        System.out.printf("\n1.Loose weight\n2.Gain weight\n");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("How much weight Do you want to Loose:");
                int los = sc.nextInt();
                SmartGym gy = new SmartGym();
                gy.loose();
                break;
            case 2:
                System.out.println("How much weight Do you want to gain:");
                int gain = sc.nextInt();
                SmartGym ga = new SmartGym();
                ga.gain();
                break;
        }
        // }while(ch!=2);
    }

    public void loose() {
        System.out.println("As per your choice,your package is as follows:");
        System.out.printf("\n1.Walking\n2.Jogging\n3.Weight training\n4.Pilates\n5.Yoga\n6.Diet Maintanace\n");
        System.out.println("Thank you!💕💕💕💕💕💕for visiting");
    }

    public void gain() {
        // System.out.println("select your package:");
        System.out.println("As per your choice,your package is as follows:");
        System.out.printf("\n1.Push-Ups\n2.Pull-Ups\n3.Bench Dips\n4.Deadlift\n5.Bench Press\n6.Burpees\n");
        System.out.println("🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉Thank you!💕💕💕💕💕💕for visiting🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");
    }
}

public class lowercase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("#############  💕💕💕Golden Gym 💕💕💕############");
        System.out.println("                      ****** ***");
        System.out.println("Fitness makes you Healthy💪💪💪");
        SmartGym gy = new SmartGym();
        gy.admin();
        gy.user();
    }
}
