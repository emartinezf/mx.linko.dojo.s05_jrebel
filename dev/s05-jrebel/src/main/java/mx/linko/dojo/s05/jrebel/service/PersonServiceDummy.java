package mx.linko.dojo.s05.jrebel.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mx.linko.dojo.s05.jrebel.exception.NotFoundException;
import mx.linko.dojo.s05.jrebel.vo.PersonVO;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceDummy implements PersonService {

    public List<PersonVO> readAll() {
        List<PersonVO>pvos = new ArrayList<PersonVO>();
        pvos.addAll(this.personMap.values());
        return pvos;
    }

    public PersonVO read(String id) {
        PersonVO pvo = this.personMap.get(id);
        if(pvo == null)
            throw new NotFoundException();
        return pvo;
    }
    
    private Map<String,PersonVO>personMap = new HashMap<String, PersonVO>();

    public PersonServiceDummy() {
        PersonVO pvo = new PersonVO();
        pvo.setAddress("Gabriel Mancera 1142 Depto 201");
        pvo.setApm("Fernandez");
        pvo.setApp("Martinez");
        pvo.setName("Emmanuel");
        personMap.put("emartinez", pvo);
        
        pvo = new PersonVO();
        pvo.setAddress("Lopez Cotilla 1424");
        pvo.setApm("Araoz");
        pvo.setApp("Damina");
        pvo.setName("Mauricio");
        personMap.put("maraoz", pvo);
        
    }
    
    
}
