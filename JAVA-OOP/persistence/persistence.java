package persistent;

public abstract class persistence {
	public abstract void persist();
}

class filepersistence extends persistence {
	public void persist() {
		System.out.println("the data stored in files");

	}
}

class datapersistence extends filepersistence {
	public void persist() {
		System.out.println("the data stored in database");

	}
}
