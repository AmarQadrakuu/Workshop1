void main() {
    // Kjo variabel do te perdoret per te percaktuar hapesiren e ruajtjes se userit.
    int level = 0;

    IO.println("Pershendetje! log in");
    IO.println("1. Admin");
    IO.println("2. User");
    IO.println("3. Guest");
    IO.println("4. Operator");

    int choice1 = Integer.parseInt(IO.readln("Roli (1-4): "));

    switch (choice1) {

        case 1 -> {

            String user = IO.readln("Username: ");
            String password = IO.readln("Password: ");

            String fresh_user = user.trim();

            if (fresh_user.equals("Admin") && password.equals("Administrator01")) {

                level = +3;

                System.out.printf("Hyrje e sukseshme ne Admin!\n Hapesira juaj %s GB", (level * 2.5));

            } else {

                IO.println("Gabim username ose password");

            }
        }

        case 2 -> {

            String user = IO.readln("Username: ");
            String password = IO.readln("Password: ");

            String fresh_user = user.trim();

            if (fresh_user.equals("Adriatik") && password.equals("CyberSecurity")) {

                level = +2;

                System.out.printf("Hyrje e sukseshme ne User!\n Hapesira juaj %s GB", (level * 2.5));

            } else {

                IO.println("Gabim username ose password");

            }
        }

        case 3 -> {

            level = +1;

            System.out.printf("Pamje ne Guest. No password needed!\n Hapesira juaj %s GB", (level * 2.5));

        }

        case 4 -> {

            String user = IO.readln("Username: ");
            String password = IO.readln("Fjalëkalimi bosh (vetëm Enter): ");

            if (password.isEmpty()) {

                IO.println("Fjalëkalimi s'mund të jetë bosh.");

            } else if (user.trim().equals("operator") && password.equals("Op3r!2026")) {

                level = +2;

                System.out.printf("Hyrje e suksesshme ne Operator!\n Hapesira juaj %s GB", (level * 2.5));

            } else {

                IO.println("Gabim username ose password");

            }
        }

        default -> IO.println("Zgjedhje e Gabuar");

    }
}
