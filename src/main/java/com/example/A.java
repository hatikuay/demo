package com.example;

/*class A { }
class B extends A { }
class C extends B { }
class D extends C { }*/

/*interface A { }
interface B extends A {}
interface C extends B {}
interface D extends C {}*/

class A {
    private String prop = "init value";
    private int not = 0;

    public void setNot(int not) {
        if (not >= 0 && not <= 100)
            this.not = not;
    }

    public int getNot() {
        return this.not;
    }

    public void setProp(String value) {
        if (value != "20")
            this.prop = value;
    }

    public String getProp() {
        return this.prop;
    }
}