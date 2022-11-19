package ProjetoJava.singleton;
    /**
     * Singleton "Apressado"
     * @author Luane
     *
     */
    public class SingletonEager {

        private static SingletonEager instancia = new SingletonEager();
        private SingletonEager() {
            super();
        }
        public static SingletonEager getInstance() {
            return instancia;
        }
}
