package com.zk.controller;

import com.google.common.collect.Maps;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import javax.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
public class ParamValidatorController {

  @RequestMapping("/test")
  public Map test(@Size(min = 5, max = 8, message = "用户名长度超出限制") String username) {
    ConcurrentMap<Object, Object> map = Maps.newConcurrentMap();
    map.put("time", new Date().toLocaleString());
    map.put("username", username);
    return map;
  }

}
