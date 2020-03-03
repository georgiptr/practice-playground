package headfirstdesignpatterns.singleton;

class GoodSingleton {

    private static GoodSingleton instance;

    private GoodSingleton() {}

    public void getInstance() {
        if (instance == null) {
            synchronized (GoodSingleton.class) {
                if (instance == null) {
                    instance = new GoodSingleton();
                }
            }
        }
    }

}
