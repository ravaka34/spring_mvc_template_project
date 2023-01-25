package com.aina.spring_mvc;

import com.aina.spring_mvc.model.Commune;
import org.aina.HibernateDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        HibernateDao dao = context.getBean(HibernateDao.class);
        System.out.println(dao);

        //Find All
//        List<Commune> communes = dao.findAll(Commune.class);
//        for (Commune commune : communes
//             ) {
//            System.out.println(commune.getIddistrict());
//
//        }

//        CREATE
//        Commune commune = new Commune();
//        commune.setNom("Jejo");
//        commune.setIdDistrict(2);
//        commune = dao.create(commune);
//        System.out.println(commune.getId());



//        Commune commune = new Commune();
//        commune.setId(1);
//        commune.setNom("vatosola");
//        commune.setIdDistrict(1);
//        dao.update(commune);
//        List<Commune> communes = dao.paginate(Commune.class, 0, 5, "id", true);
//        for (Commune tmp : communes
//        ) {
//            System.out.println(tmp.getId());
//
//        }
    }
}
