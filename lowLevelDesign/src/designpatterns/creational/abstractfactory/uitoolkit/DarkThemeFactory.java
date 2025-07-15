package designpatterns.creational.abstractfactory.uitoolkit;

public class DarkThemeFactory implements uiKit.UIFactory {
    @Override
    public Button createButton() {
        return new uiKit.DarkButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new uiKit.DarkCheckBox();
    }
}
