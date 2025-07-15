package designpatterns.creational.abstractfactory.mediaplayer;

public class CrossDeviceMediaPlayer {

    public interface AudioPlayer {
        void playAudio(String audio);
    }

    public interface VideoPlayer {
        void playVideo(String video);
    }

    public interface MediaPlayerFactory {
        AudioPlayer createAudioPlayer();
        VideoPlayer createVideoPlayer();
    }


    public static class MobileAudioPlayer implements AudioPlayer {
        @Override
        public void playAudio(String audio) {
            System.out.println("Playing audio on Mobile : " + audio);
        }
    }
    public static class MobileVideoPlayer implements VideoPlayer {
        @Override
        public void playVideo(String video) {
            System.out.println("Playing video on Mobile : " + video);
        }
    }
    public static class DesktopAudioPlayer implements AudioPlayer {
        @Override
        public void playAudio(String audio) {
            System.out.println("Playing audio on Desktop : " + audio);
        }
    }
    public static class DesktopVideoPlayer implements VideoPlayer {
        @Override
        public void playVideo(String video) {
            System.out.println("Playing video on Desktop : " + video);
        }
    }

    public static class MobileMediaFactory implements MediaPlayerFactory {
        @Override
        public AudioPlayer createAudioPlayer() {
            return new MobileAudioPlayer();
        }

        @Override
        public VideoPlayer createVideoPlayer() {
            return new MobileVideoPlayer();
        }
    }

    public static class DesktopMediaFactory implements MediaPlayerFactory {
        @Override
        public AudioPlayer createAudioPlayer() {
            return new DesktopAudioPlayer();
        }

        @Override
        public VideoPlayer createVideoPlayer() {
            return new DesktopVideoPlayer();
        }
    }

    public static void main(String[] args) {
        MediaPlayerFactory mediaPlayerFactory = new MobileMediaFactory();
        AudioPlayer audioPlayer = mediaPlayerFactory.createAudioPlayer();
        VideoPlayer videoPlayer = mediaPlayerFactory.createVideoPlayer();

        audioPlayer.playAudio("song.mp3");
        videoPlayer.playVideo("movie.mp4");
    }

}
