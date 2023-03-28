package ro.cts.prototype.model;

public interface AbstractPrototype extends Cloneable{
    public AbstractPrototype createCopy() throws CloneNotSupportedException;
}
