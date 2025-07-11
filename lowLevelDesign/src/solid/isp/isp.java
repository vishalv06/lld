package solid.isp;

public class isp {

    interface Workable {
        void work();
    }

    interface Eatable {
        void eat();
    }

    static class Robot implements Workable {
        @Override
        public void work() {
            System.out.println("Robot is working");
        }
    }
}
