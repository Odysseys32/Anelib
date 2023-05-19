package plasma.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import plasma.model.Settings;
import plasma.service.SettingService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class SettingController {
    private final SettingService service;
    @GetMapping("/settings/page")
    public String settingPage(Model model){
        List<Settings> settings = service.findAll();
        model.addAttribute("set", settings);
        return "/manga/settings";
    }
}
