package io.dataease.api;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.dataease.api.dto.SettingVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.File;
import java.io.IOException;

@Controller
public class PageController {

    private static final ObjectMapper objectMapper;

    private static final String filePath = "./embedded-demo-setting.txt";
    static {
        objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    @GetMapping("/")
    public String index(Model model) {
        SettingVO vo = read();
        model.addAttribute("vo", vo);
        return "index";
    }
    @GetMapping("/Setting")
    public String setting(Model model) {
        SettingVO vo = read();
        model.addAttribute("vo", vo);
        return "Setting";
    }

    @GetMapping("/DashboardView")
    public String dashboard(Model model) {
        SettingVO vo = read();
        model.addAttribute("vo", vo);
        return "DashboardView";
    }
    @GetMapping("/VisualizationView")
    public String screen(Model model) {
        SettingVO vo = read();
        model.addAttribute("vo", vo);
        return "VisualizationView";
    }
    @GetMapping("/DashboardEditor")
    public String dashboardEdit(Model model) {
        SettingVO vo = read();
        model.addAttribute("vo", vo);
        return "DashboardEditor";
    }
    @GetMapping("/VisualizationEditor")
    public String screenEdit(Model model) {
        SettingVO vo = read();
        model.addAttribute("vo", vo);
        return "VisualizationEditor";
    }
    @GetMapping("/view")
    public String view(Model model) {
        SettingVO vo = read();
        model.addAttribute("vo", vo);
        return "view";
    }

    @GetMapping("/Resource")
    public String resource(Model model) {
        SettingVO vo = read();
        model.addAttribute("vo", vo);
        return "Resource";
    }

    private SettingVO read() {
        try {
            File file = new File(filePath);
            if (ObjectUtils.isEmpty(file) || !file.exists()) return new SettingVO();
            return objectMapper.readValue(new File(filePath), SettingVO.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
