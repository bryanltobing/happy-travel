package del.ac.id.happytravellingapps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import del.ac.id.happytravellingapps.model.Penerbangan;
import del.ac.id.happytravellingapps.service.PenerbanganService;

@Controller
public class PenerbanganController {

    @Autowired
    private PenerbanganService service;

    @RequestMapping("/")
    public String viewIndexPage(Model model){
        List<Penerbangan> penerbanganList = service.listAll();
        model.addAttribute("getAllPenerbangan", penerbanganList);
        return "index";
    }

    @RequestMapping("/new_add")
    public String viewNewPenerbanganForm(Model model) {
        Penerbangan penerbangan = new Penerbangan();
        model.addAttribute("penerbangan", penerbangan);
        return "insert";
    }

    @RequestMapping(value = "/save_penerbangan", method = RequestMethod.POST)
    public String addNewPenerbangan(@ModelAttribute("penerbangan") Penerbangan penerbangan) {
        service.create(penerbangan);
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView viewEditPenerbanganForm(@PathVariable(name = "id") long id) {

        ModelAndView mav = new ModelAndView("update");
        Penerbangan penerbangan = service.updateid(id);
        mav.addObject("penerbangan", penerbangan);
        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deletePenerbangan(@PathVariable(name = "id") long id) {

        service.delete(id);
        return "redirect:/";
    }

}