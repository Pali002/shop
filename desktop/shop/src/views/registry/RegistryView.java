package views.registry;

import javafx.scene.layout.HBox;
import views.InputPanel;
import views.PassPanel;

public class RegistryView extends HBox {
    InputPanel nameInput;
    InputPanel emailInput;
    PassPanel passInput;
    PassPanel passAgainInput;

    public RegistryView() {
        this.initComponent();
        this.setComponent();
        this.addComponent();
    }
    private void initComponent() {
        this.nameInput = new InputPanel();
        this.emailInput = new InputPanel();
        this.passInput = new PassPanel();
        this.passAgainInput = new PassPanel();
    }

    private void setComponent() {
        this.nameInput.setText("Név: ");
        this.emailInput.setText("Email: ");
        this.passInput.setText("Jelszó: ");
        this.passAgainInput.setText("Jelszó újra: ");
    }

    private void addComponent() {
        this.getChildren().add(this.nameInput);
        this.getChildren().add(this.emailInput);
        this.getChildren().add(this.passInput);
        this.getChildren().add(this.passAgainInput);
    }
    public String getText() {
        return emailInput.getText();
    }
    public void setText(String text) {
        this.emailInput.setText(text);
    }
    public String getValue() {
        return nameInput.getText();
    }
    public void setValue(String value) {
        this.nameInput.setText(value);
    }
    
    
}
