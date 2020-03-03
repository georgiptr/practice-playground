package headfirstdesignpatterns.singleton;

class BadSingleton {

    private static BadSingleton instance;

    private BadSingleton() {}

    public void getInstance() {
        if (instance == null) {
            instance = new BadSingleton();
        }
    }

}
