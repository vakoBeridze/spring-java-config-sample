package ge.vako.services;

import ge.vako.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Controller
@RequestMapping(value = "/book")
public class BookController {

    @PersistenceContext
    private EntityManager em;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Book> getBooks() {
        return em.createNativeQuery("select * from Book b").getResultList();
    }

}

