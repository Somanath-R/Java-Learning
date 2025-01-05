interface InterfaceA {
    void methodA();
}

interface InterfaceB {
    void methodB();
}

class MultipleInheritanceClass implements InterfaceA, InterfaceB {
    @Override
    public void methodA() {
        System.out.println("Method A from InterfaceA");
    }

    @Override
    public void methodB() {
        System.out.println("Method B from InterfaceB");
    }

    public static void main(String[] args) {
        MultipleInheritanceClass obj = new MultipleInheritanceClass();
        obj.methodA();
        obj.methodB();
    }
}
