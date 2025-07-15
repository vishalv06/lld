package designpatterns.creational.abstractfactory.uitoolkit;

public class LightThemeFactory implements uiKit.UIFactory {
    @Override
    public Button createButton() {
        return new uiKit.LightButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new uiKit.LightCheckBox();
    }
}
