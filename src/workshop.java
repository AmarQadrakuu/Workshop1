void main() {
    //Kjo variabel do te perdoret per te percaktuar hapesiren e ruajtjes se userit.
    int level = 0;

    // Ketu mirepresim userat, dhe perdorim variablen "choice1" qe do te ruaj te dhenat e futura nga useri.
    IO.println("Pershendetje! log in");
    IO.println ("1. Admin");
    IO.println ("2. User");
    IO.println ("3. Guest");
    int choice1 = Integer.parseInt(IO.readln("Role (1-3): "));

    switch (choice1) {

        case 1 -> {

            // User do te vendos emrin e përdoruesit dhe passwordin e tij.
            String user = IO.readln("Username: ");
            String password = IO.readln("Password: ");

            // Shkurtimi i emrit te userit, ne rast se useri ka shtuar hapesira te padeshiruara
            String fresh_user = user.trim();

            // Nese useri vendos emrin e userit dhe passwordin e sakte per administratorin, ai do te vazhdoje me instruksionin e pare.
            if (fresh_user.equals("Admin") && password.equals("Administrator01")) {

                // Pas vazhdimit, +3 do ti shtohet variables të nivelit.
                level = +3;

                //Do te shfaqet mesazhi se useri ka hyre me sukses si Administrator!
                // Variabla "level" do te perdoret per tu shumezuar me 2,5, siç është kerkuar ne detyre!
                System.out.printf("Hyrje e sukseshhme ne Admin!\n Hapesira juaj %s GB", (level * 2.5));

            } else {

                IO.println("Gabim username ose password");

            }
        }

        case 2 -> {

            // User do te vendos emrin e userit dhe passwordin e tij.
            String user = IO.readln("Username: ");
            String password = IO.readln("Password: ");

            // Shkurtimi i emrit te userit, ne rast se useri ka shtuar hapesira te padeshiruara
            String fresh_user = user.trim();

            // Nese useri vendos emrin e userit dhe passwordin e sakte per Userin, ai do te vazhdoje me instruksionin e dyte.
            if (fresh_user.equals("Adriatik") && password.equals("CyberSecurity")) {

                // Pas vazhdimit, +2 do ti shtohet variables të nivelit.
                level = +2;

                //Do te shfaqet mesazhi se useri ka hyre me sukses si User!
                // Variabla "level" do te perdoret per tu shumezuar me 2,5 siç eshte kerkuar ne detyre!
                System.out.printf("Hyrje e sukseshhme ne User!\n Hapesira juaj %s GB", (level * 2.5));

            } else {

                IO.println("Gabim username ose password");

            }
        }

        case 3 -> {

            // Nese perdoruesi zgjedh "Hyrje si Guest", ai do te drejtohet ketu.

            //Pas vazhdimit, +1 do ti shtohet variables të nivelit.
            level = +1;

            // Do te shfaqet mesazhi se useri hyri me sukses si Guest; dhe nuk kerkohet password.
            // Variabla "level" do te perdoret per tu shumezuar me 2,5 siç eshte kerkuar ne detyre!
            System.out.printf("Pamje ne Guest. No password needed!\n Hapesira juaj %s GB", (level * 2.5));

        }

        // Nese useri zgjedh nje opsion te gabuar nga ato qe ne kemi ofruar, ai do te drejtohet ketu. Psh. Role 3-4-5 etj.
        default -> IO.println("Zgjedhje e Gabuar");

    }
}