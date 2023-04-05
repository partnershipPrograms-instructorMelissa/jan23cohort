package com.example.crudappsession.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.crudappsession.models.Category;
import com.example.crudappsession.models.Sticker;
import com.example.crudappsession.service.CatServ;
import com.example.crudappsession.service.StickerServ;

@Controller
public class HomeController {

	@Autowired
	private CatServ catServ;
	
	@Autowired
	private StickerServ stickerServ;
	
    // ==========================
    //        Main Routes
    // ==========================
	
	@GetMapping("/")
	public String index(HttpSession session, @ModelAttribute("sticker") Sticker sticker, Model model) {
		model.addAttribute("allStickers", stickerServ.getAll());
		return "index.jsp";
	}
	@GetMapping("/dashboard")
	public String dashboard(HttpSession session, Model model) {
		if(session.getAttribute("cat") == null) {
			return "redirect:/";
		}
		model.addAttribute("aCat", catServ.getOne((Long)session.getAttribute("cat")));
		return "dashboard.jsp";
	}

    // ==========================
    //        Category Routes
    // ==========================
	@GetMapping("/addCategory")
	public String addCat(@ModelAttribute("catForm") Category cat) {
		return "addCat.jsp";
	}
	@PostMapping("/createCat")
	public String createCat(@Valid @ModelAttribute("catForm") Category newCat, BindingResult result, Model model, HttpSession session) {
		if(result.hasErrors()) {
			return "addCat.jsp";
		} else {
			catServ.createOne(newCat);
			
			session.setAttribute("cat", newCat.getId());
			return "redirect:/dashboard";
		}
	}
	
    // ==========================
    //        Sticker Routes
    // ==========================
	@GetMapping("/addSticker")
	public String addSticker(@ModelAttribute("stickerForm") Sticker sticker, Model model) {
		model.addAttribute("allCats", catServ.getAll());
		return "addSticker.jsp";
	}
	@PostMapping("/createSticker")
	public String createSticker(@Valid @ModelAttribute("stickerForm") Sticker newSticker, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allCats", catServ.getAll());
			return "addSticker.jsp";
		} else {
			stickerServ.createOne(newSticker);
			return "redirect:/dashboard";
		}
	}
}
