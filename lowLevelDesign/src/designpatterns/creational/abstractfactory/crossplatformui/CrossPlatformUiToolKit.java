package designpatterns.creational.abstractfactory.crossplatformui;

import org.w3c.dom.Text;

public class CrossPlatformUiToolKit {

    public interface Button {
        void render();
    }

    public interface TextBox {
        void render();
    }

    public interface UiFactory {
        Button createButton();
        TextBox createTextBox();
    }

    public static class WindowsButton implements Button {

        @Override
        public void render() {
            System.out.println("Rendering windows button");
        }
    }


    public static class WindowsTextBox implements TextBox {

        @Override
        public void render() {
            System.out.println("Rendering windows textbox");
        }
    }

    public static class MacButton implements Button {

        @Override
        public void render() {
            System.out.println("Rendering mac button");
        }
    }

    public static class MacTextBox implements TextBox {

        @Override
        public void render() {
            System.out.println("Rendering mac textbox");
        }
    }

    public static class WindowsFactory implements UiFactory{
        @Override
        public Button createButton() {
            return new WindowsButton();
        }

        @Override
        public TextBox createTextBox() {
            return new WindowsTextBox();
        }
    }
    public static class MacFactory implements UiFactory{
        @Override
        public Button createButton() {
            return new MacButton();
        }

        @Override
        public TextBox createTextBox() {
            return new MacTextBox();
        }
    }

    public static void main(String[] args) {
        UiFactory uiFactory = new MacFactory();
        Button button = uiFactory.createButton();
        TextBox textBox = uiFactory.createTextBox();

        button.render();
        textBox.render();
    }
}
