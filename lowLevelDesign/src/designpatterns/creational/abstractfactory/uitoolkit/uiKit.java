package designpatterns.creational.abstractfactory.uitoolkit;

public class uiKit {

    public static class LightButton implements Button {

        @Override
        public void render() {
            System.out.println("Rendering light button");
        }
    }

    public static class LightCheckBox implements Checkbox {

        @Override
        public void render() {
            System.out.println("Rendering light checkbox");
        }
    }

    public static class DarkButton implements Button {

        @Override
        public void render() {
            System.out.println("Rendering dark button");
        }
    }

    public static class DarkCheckBox implements Checkbox {

        @Override
        public void render() {
            System.out.println("Rendering dark checkbox");
        }
    }

    public interface UIFactory {
        Button createButton();
        Checkbox createCheckBox();
    }
}
