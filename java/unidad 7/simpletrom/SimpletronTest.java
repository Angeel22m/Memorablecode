package simpletrom;


 class SimpletronTest {

    public static void main(String[] args) {
        if (args.length > 0) {
            for (String s : args) {
                if ("-h".equals(s) || "--help".equals(s)) {
                    helpMessage();
                    System.exit(0);
                }
            }
            System.out.println("Invalid options. Use \"-h\" or \"--help\" for help");
            System.exit(0);
        }
        else {
            run();
        }
    }

    public static void run() {
        simpletron s = new simpletron();

        s.run();
    }

    public static void helpMessage() {
        System.out.println("Test help message");
    }
}

