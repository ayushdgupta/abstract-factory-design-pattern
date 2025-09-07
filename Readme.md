https://www.geeksforgeeks.org/system-design/abstract-factory-pattern/

Another good example
```
// 1. Abstract Product
interface Button {
    void paint();
}
```

```
// 2. Concrete Products
class WindowsButton implements Button {
    public void paint() {
        System.out.println("Windows Button");
    }
}
```

```
class MacButton implements Button {
    public void paint() {
        System.out.println("Mac Button");
    }
}
```

```
// 3. Abstract Factory
interface GUIFactory {
    Button createButton();
}
```

```
// 4. Concrete Factories
class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }
}
```

```
class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }
}
```

```
// 5. Client Code
class Application {
    private Button button;

    public Application(GUIFactory factory) {
        button = factory.createButton();
    }

    public void paint() {
        button.paint();
    }
}
```
}

