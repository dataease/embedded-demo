package io.dataease.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/table")
public class DynamicTableApi {

    @GetMapping("/grid")
    public List<Map<String, String>> grid() {
        List<Map<String, String>> resultList =  new ArrayList<>();
        Map<String, String> row = new HashMap<>();
        row.put("resourceId", "1");
        row.put("busiFlag", "dashboard");
        row.put("viewId", "11111");
        resultList.add(row);
        return resultList;
    }
}
