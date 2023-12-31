package io.dataease.api;

import io.dataease.api.dto.SettingVO;
import io.dataease.api.utils.SettingUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {


    @GetMapping("/")
    public String index(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "index";
    }

    @GetMapping("/Setting")
    public String setting(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "Setting";
    }

    @GetMapping("/DashboardView")
    public String dashboard(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "DashboardView";
    }

    @GetMapping("/VisualizationView")
    public String screen(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "VisualizationView";
    }

    @GetMapping("/DashboardEditor")
    public String dashboardEdit(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "DashboardEditor";
    }

    @GetMapping("/VisualizationEditor")
    public String screenEdit(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "VisualizationEditor";
    }

    @GetMapping("/view")
    public String view(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "view";
    }

    @GetMapping("/Resource")
    public String resource(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "Resource";
    }


}
