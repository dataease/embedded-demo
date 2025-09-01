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
    @GetMapping("/DashboardViewIframe")
    public String dashboardIframe(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "iframe/DashboardView";
    }

    @GetMapping("/VisualizationView")
    public String screen(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "VisualizationView";
    }
    @GetMapping("/VisualizationViewIframe")
    public String screenIframe(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "iframe/VisualizationView";
    }

    @GetMapping("/DashboardEditor")
    public String dashboardEdit(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "DashboardEditor";
    }
    @GetMapping("/DashboardEditorIframe")
    public String dashboardEditIframe(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "iframe/DashboardEditor";
    }

    @GetMapping("/VisualizationEditor")
    public String screenEdit(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "VisualizationEditor";
    }
    @GetMapping("/VisualizationEditorIframe")
    public String screenEditIframe(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "iframe/VisualizationEditor";
    }

    @GetMapping("/view")
    public String view(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "view";
    }
    @GetMapping("/ViewIframe")
    public String viewIframe(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "iframe/View";
    }

    @GetMapping("/DatasourceTree")
    public String datasourceTree(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "tree/datasource";
    }
    @GetMapping("/DatasourceTreeIframe")
    public String datasourceTreeIframe(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "iframe/tree/datasource";
    }
    @GetMapping("/DatasetTree")
    public String datasetTree(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "tree/dataset";
    }
    @GetMapping("/DatasetTreeIframe")
    public String datasetTreeIframe(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "iframe/tree/dataset";
    }
    @GetMapping("/PanelTree")
    public String panelTree(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "tree/panel";
    }
    @GetMapping("/PanelTreeIframe")
    public String panelTreeIframe(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "iframe/tree/panel";
    }
    @GetMapping("/ScreenTree")
    public String screenTree(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "tree/screen";
    }
    @GetMapping("/ScreenTreeIframe")
    public String screenTreeIframe(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "iframe/tree/screen";
    }

    @GetMapping("/DataFillingTree")
    public String dataFillingTree(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "tree/dataFilling";
    }
    @GetMapping("/DataFillingTreeIframe")
    public String dataFillingTreeIframe(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "iframe/tree/dataFilling";
    }

    @GetMapping("/DataFillingEditor")
    public String dataFillingEditor(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "DataFillingEditor";
    }

    @GetMapping("/DataFillingEditorIframe")
    public String dataFillingEditorIframe(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "iframe/DataFillingEditor";
    }


    @GetMapping("/CopilotEditor")
    public String CopilotEditor(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "CopilotEditor";
    }

    @GetMapping("/CopilotEditorIframe")
    public String CopilotEditorIframe(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "iframe/CopilotEditor";
    }

    @GetMapping("/TemplateManage")
    public String TemplateManage(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "TemplateManage";
    }

    @GetMapping("/TemplateManageIframe")
    public String TemplateManageIframe(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "iframe/TemplateManage";
    }

    @GetMapping("/DataFillingHandler")
    public String dataFillingHandler(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "DataFillingHandler";
    }
    @GetMapping("/DataFillingHandlerIframe")
    public String dataFillingHandlerIframe(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "iframe/DataFillingHandler";
    }
    @GetMapping("/sqlbot")
    public String sqlbot(Model model) {
        SettingVO vo = SettingUtils.read();
        model.addAttribute("vo", vo);
        return "sqlbot";
    }



}
