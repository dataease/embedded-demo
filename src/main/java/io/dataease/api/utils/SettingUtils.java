package io.dataease.api.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.dataease.api.dto.SettingVO;
import org.springframework.util.ObjectUtils;

import java.io.File;
import java.io.IOException;

public class SettingUtils {

    private static final ObjectMapper objectMapper;

    private static final String filePath = "./embedded-demo-setting.txt";
    static {
        objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static void write(SettingVO obj) {
        File file = new File(filePath);
        try {
            objectMapper.writeValue(file, obj);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static SettingVO read() {
        try {
            File file = new File(filePath);
            if (ObjectUtils.isEmpty(file) || !file.exists()) return new SettingVO();
            return objectMapper.readValue(new File(filePath), SettingVO.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
