package com.example.controller;

import com.example.model.Music;
import com.example.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MusicController {

    @Autowired
    private IMusicService iMusicService;

    @GetMapping("/")
    public String showList(Model model) {
        model.addAttribute("listMusic", iMusicService.findAll());
        return "/list";
    }

    @GetMapping("/{id}/delete")
    public String showDelete(@PathVariable int id, Model model) {
        model.addAttribute("music",iMusicService.findById(id));
        return "/delete";
    }
    @PostMapping("/delete")
    public String deleteMusic(Music music){
        iMusicService.remove(music.getId());
        return "redirect:/";
    }
    @GetMapping("/{id}/edit")
    public String showEdit(@PathVariable int id,Model model){
        model.addAttribute("music",iMusicService.findById(id));
        return "/update";
    }
    @PostMapping("/edit")
    public String editMusic(@ModelAttribute Music music){
        iMusicService.update(music);
        return "redirect:/";
    }

}
