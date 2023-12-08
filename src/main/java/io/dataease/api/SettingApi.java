package io.dataease.api;

import io.dataease.api.dto.SettingVO;
import io.dataease.api.utils.SettingUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
public class SettingApi {


    private static final String filePath = "./embedded-demo-setting.txt";


    @PostMapping("/save")
    public void save(@RequestBody SettingVO creator) {
        File file = null;
        if ((file = new File(filePath)).exists()) {
            file.delete();
        }
        SettingUtils.write(creator);
    }


}
