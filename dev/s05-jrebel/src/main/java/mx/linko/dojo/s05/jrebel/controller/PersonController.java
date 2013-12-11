package mx.linko.dojo.s05.jrebel.controller;

import java.util.List;
import mx.linko.dojo.s05.jrebel.service.PersonService;
import mx.linko.dojo.s05.jrebel.vo.PersonVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author emartinez
 */
@Controller
@RequestMapping("/person")
public class PersonController {
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<PersonVO>readAll(){
        return this.personService.readAll();
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{personId}")
    @ResponseBody
    public PersonVO read(
            @PathVariable("personId")String id){
        return this.personService.read(id);//asdads
    }
    
    @Autowired
    private PersonService personService;
}
