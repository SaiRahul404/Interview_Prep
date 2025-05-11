package org.example;

public class OverrideExample {
    public static void main(String[] args) {
        Bnew bnew = new Bnew(2,3,4);
        bnew.show();
    }
}

class Anew {
    int i, j;

    Anew(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j :" + i + " " + j);
    }
}

class Bnew extends Anew {
    int k;

    Bnew(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    @Override
    void show() {
        System.out.println("i and j :" + i + " " + j);
        System.out.println("k=:" + k);
    }

}
