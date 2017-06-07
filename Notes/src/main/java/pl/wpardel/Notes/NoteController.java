package pl.wpardel.Notes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NoteController 
{
	@Autowired
	NotatkaDao notatkaDao;
	
	@Autowired
	TranslatorService translateService;
	
	@Autowired
	NotatkaDao dao;
	
	@GetMapping("/")
	public String getSt()
	{
		return "Hello";
	}
	
	@GetMapping(value = "/get/{id}",produces=MediaType.APPLICATION_XML_VALUE)
	public Notatka getById(@PathVariable int id)
	{		
		return notatkaDao.queryForNotatka(id);
	}
	
	@GetMapping(value = "/get/all",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Notatka> getALL()
	{		
		return notatkaDao.queryForNotatki();
	}
	
	@GetMapping(value="/translate/{text}")
	public String translate(@PathVariable String text)
	{
		return translateService.translate(text);
	}

}
