package genericinterfaces;

public abstract class ShippableAbstractCrate<U> implements Shippable<U> {
	public abstract void ship(U u);
}
