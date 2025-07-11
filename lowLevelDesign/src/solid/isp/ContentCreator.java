package solid.isp;

public class ContentCreator {

    interface Video {
        void record();
    }

    interface Blog {
        void write();
    }

    interface Podcast {
        void host();
    }

    static class Youtuber implements Video {
        @Override
        public void record() {
            System.out.println("Youtuber is recording");
        }
    }

    static class Blogger implements Blog {
        @Override
        public void write() {
            System.out.println("Blogger is writing blog");
        }
    }

    static class Podcaster implements Podcast {
        @Override
        public void host() {
            System.out.println("Podcaster is hosting podcast");
        }
    }

    public static void main(String[] args) {
        Youtuber youtuber = new Youtuber();
        youtuber.record();

        Blogger blogger = new Blogger();
        blogger.write();

        Podcaster podcaster = new Podcaster();
        podcaster.host();
    }
}
