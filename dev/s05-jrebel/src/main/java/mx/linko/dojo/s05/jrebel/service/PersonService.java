package mx.linko.dojo.s05.jrebel.service;

import java.util.List;
import mx.linko.dojo.s05.jrebel.vo.PersonVO;

/**
 *
 * @author emartinez
 */
public interface PersonService {
    List<PersonVO>readAll();
    PersonVO read(String id);
    
}
