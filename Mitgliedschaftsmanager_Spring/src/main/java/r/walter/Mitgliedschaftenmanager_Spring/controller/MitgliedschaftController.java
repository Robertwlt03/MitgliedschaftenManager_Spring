package r.walter.Mitgliedschaftenmanager_Spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import r.walter.Mitgliedschaftenmanager_Spring.model.Mitgliedschaft;
import r.walter.Mitgliedschaftenmanager_Spring.service.MitgliedschaftServive;

@Controller
public class MitgliedschaftController {

    @Autowired
    private MitgliedschaftServive service;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("mitgliedschaften", service.findAll());
        model.addAttribute("page", "homepage");
        return "index";
    }

    @RequestMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("mitgliedschaft",  service.setMitgliedschaft());
        model.addAttribute("page", "add");
        return "create";
    }

    @RequestMapping("/update/{id}")
    public String editForm(Model model, @PathVariable int id) {
        model.addAttribute("mitgliedschaft", service.findById(id));
        model.addAttribute("page", "edit");
        return "edit";
    }

    @PostMapping("/sql/save")
    public String saveOrUpdate(@ModelAttribute Mitgliedschaft mitgliedschaft) {
        service.saveOrUpdate(mitgliedschaft);
        return "redirect:/";
    }

    @RequestMapping("/sql/remove/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "redirect:/";
    }

    @RequestMapping("/search")
    public String search(@RequestParam String keyword, Model model) {
        model.addAttribute("mitgliedschaften", service.search(keyword));
        model.addAttribute("page", "homepage");
        return "index";
    }
}
