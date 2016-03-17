package com.shohei_yokoyama.prototype_framework;
import java.util.HashMap;

public class Manager {
	private HashMap showcase = new HashMap();
	public void register(String name, PrototypeProduct prototype) {
		showcase.put(name, prototype);
	}

	public PrototypeProduct create(String protoname) {
		PrototypeProduct p = (PrototypeProduct)showcase.get(protoname);
		return p.createClone();
	}
}
