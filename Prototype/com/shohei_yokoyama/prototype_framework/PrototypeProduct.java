package com.shohei_yokoyama.prototype_framework;

public interface PrototypeProduct extends Cloneable {
	
	public abstract void use(String s);
	public abstract PrototypeProduct createClone();
}
