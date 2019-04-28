 class policemanAndThief {
    int x, y;
    Boolean isCatched = false;

    /**
     *   */
    public static void main(String[] args) {
        policemanAndThief pt = new policemanAndThief();
        Policeman p = pt.new Policeman("YiJichangkong");
        Thief t = pt.new Thief("Liu du du");
        p.start();
        t.start();

    }

    public class Policeman extends Thread {
        Policeman() {
            super();
        }

        Policeman(String s) {
            super(s);
        }

        public void run() {
            while (true) {
                for (x = -100; x <= 100; x += (int) (Math.random() * 6 + 1)) {
                    System.out.println("Police " + this.getName() + " are at: "
                            + x);
                    /*
                     * try { this.sleep((int)(Math.random()3000+1000)); } catch
                     * (InterruptedException e) { e.printStackTrace(); }
                     */
                    Catch();
                }

            }
        }
    }

    public class Thief extends Thread {
        public Thief(String s) {
            super(s);
        }

        public void run() {
            while (true) {
                for (y = -100; y <= 100; y += (int) (Math.random() * 6 + 1)) {
                    System.out.println("Thief " + this.getName() + " are At: "
                            + y);
                    /*
                     * try { this.sleep(1000); } catch (InterruptedException e)
                     * { e.printStackTrace(); }
                     */

                    Catch();
                }

            }
        }
    }

    public void Catch() {
        if (x >= -10 && x <= 10 && y >= -10 && y <= 10) {
            System.out.println("police  at: " + x + "  thief at: " + y);
            System.out.println("The thief is catched!");
            System.exit(0);
        }
    }

}
