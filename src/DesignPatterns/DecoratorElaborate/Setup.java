package DesignPatterns.DecoratorElaborate;

interface Component {
    void operation();
}

class ConcreteComponent implements Component {
    public void operation() {
        System.out.println("ConcreteComponent operation");
    }
}

abstract class Decorator implements Component {
    protected final Component inner;
    public Decorator(Component inner) {
        this.inner = inner;
    }

    public Component getInner() {
        return inner;
    }

    // new unwrap method here
    public Component unwrap(Class<? extends Decorator> targetType) {
        // If outermost is the target → remove it
        if (targetType.isInstance(this)) {
            return inner;  // skip this decorator
        }
        // Otherwise, check inner chain
        if (inner instanceof Decorator) {
            Component newInner = ((Decorator) inner).unwrap(targetType);
            // rebuild this decorator with updated inner
            return recreate(this.getClass(), newInner);
        }
        return this; // no change
    }

    // helper to recreate the decorator with a new inner
    private Component recreate(Class<?> clazz, Component newInner) {
        try {
            return (Component) clazz.getConstructor(Component.class).newInstance(newInner);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
class DecoratorA extends Decorator {
    public DecoratorA(Component inner) { super(inner); }
    public void operation() {
        System.out.println("DecoratorA before");
        inner.operation();
        System.out.println("DecoratorA after");
    }
}

class DecoratorB extends Decorator {
    public DecoratorB(Component inner) { super(inner); }
    public void operation() {
        System.out.println("DecoratorB before");
        inner.operation();
        System.out.println("DecoratorB after");
    }
}

public class Setup {
    public void main(){
        Component c = new ConcreteComponent();
        Component decorated = new DecoratorA(new DecoratorB(new DecoratorA(c)));

        System.out.println("Before unwrap:");
        decorated.operation();

        // unwrap DecoratorB using method inside the class
        Component unwrapped = ((Decorator) decorated).unwrap(DecoratorB.class);

        System.out.println("\nAfter unwrap:");
        unwrapped.operation();

    }
}