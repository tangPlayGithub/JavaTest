package com.my.java.thinking4.typeinfo.factory;

//创建工厂，泛型参数T使得create()可以在每种Factory实现中返回不同的类型
public interface Factory<T> {
    T create();
}
