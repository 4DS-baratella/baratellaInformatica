package InterfacciaConfrontabile;

public interface Confrontabile {
    abstract boolean confrontaMaggiore(Confrontabile oggetto) throws Exception;
    abstract boolean confrontaMinore(Confrontabile oggetto) throws Exception;
    abstract boolean confrontaUguale(Confrontabile oggetto) throws Exception;
}
