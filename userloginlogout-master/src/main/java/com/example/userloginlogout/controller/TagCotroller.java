package com.example.userloginlogout.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.example.userloginlogout.service.EventService;
import com.example.userloginlogout.service.TagService;

@Controller
public class TagCotroller {
	
	@Autowired
	private TagService tagService;
	@Autowired
	private EventService serieEvent;
	@Autowired 
	private EventService eventService;
	
	
	
	
	
	/*@GetMapping("/series/{id}/event/{id}/tag/new")
    public String addNewTagtoaEvenet(@PathVariable("id") Integer id,Model model)
    {
        model.addAttribute("tag",new Tag());
        return "Add_Tag";
    }*/
	
}
