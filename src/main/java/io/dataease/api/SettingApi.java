package io.dataease.api;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.dataease.api.dto.SettingVO;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;

@RestController
public class SettingApi {

    private static final ObjectMapper objectMapper;

    private static final String filePath = "./embedded-demo-setting.txt";
    static {
        objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    @PostMapping("/save")
    public void save(@RequestBody SettingVO creator) {
        File file = null;
        if ((file = new File(filePath)).exists()) {
            file.delete();
        }
        write(creator);
    }



    private void write(SettingVO obj) {
        File file = new File(filePath);
        try {
            objectMapper.writeValue(file, obj);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
