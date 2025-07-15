package designpatterns.creational.abstractfactory.uitoolkit;

public class TestUiFactory {

    public static void main(String[] args) {
        uiKit.UIFactory uiFactory = new LightThemeFactory();
        Button button = uiFactory.createButton();
        Checkbox checkbox = uiFactory.createCheckBox();

        button.render();
        checkbox.render();
    }
}
