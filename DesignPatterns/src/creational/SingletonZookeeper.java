package creational;

/**
 * The SingletonZookeeper class is effectively final, as the private constructor ensures
 * no class can extend since the call to super could not be made.
 */
public class SingletonZookeeper {
	/**
	 * An encapsulated property holding the number of bales of hay the zookeeper
	 * holds.
	 */
	private int haystackSize = 0;

	/**
	 * A single final instance of the class.
	 */
	private static final SingletonZookeeper instance;
	static {
		instance = new SingletonZookeeper();
		//  allows us to do additional initialisation.
	}

	/**
	 * Private constructor, not accessible to anyone but the class itself.
	 */
	private SingletonZookeeper() {
	}

	/**
	 * This method will always return a reference to the single instance of the
	 * zookeeper.
	 * 
	 * @return
	 */
	public static SingletonZookeeper getInstance() {
		return instance;
	}

	/**
	 * 
	 * @param bales
	 */
	public synchronized void addHay(int bales) {
		this.haystackSize += bales;
	}

	/**
	 * 
	 * @param bales
	 */
	public synchronized boolean removeHay(int bales) {
		if (haystackSize >= bales) {
			haystackSize -= bales;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @return
	 */
	public synchronized int getHayStackSize() {
		return haystackSize;
	}
}
