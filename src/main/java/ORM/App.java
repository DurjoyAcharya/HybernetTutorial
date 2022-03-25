package ORM;

import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {
        var cfg=new Configuration();
        cfg.configure("hybernet.cfg.xml");
        var factory=cfg.buildSessionFactory();
        var str=new Student(1925102005,"Kona Paul","Tangail");
        System.out.println(str);

        var session=factory.openSession();
        var trx=session.beginTransaction();
        session.save(str);
        trx.commit();
        session.close();
    }
}
