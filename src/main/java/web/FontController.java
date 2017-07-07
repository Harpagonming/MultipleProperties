package web;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.FontService;

/**
 * Created by cao.zm on 2017/7/6.
 */
@Controller
@RequestMapping("/font")
public class FontController {
  @Autowired
  private FontService fontService;

  @RequestMapping(value = "/number", method = RequestMethod.POST)
  @ResponseBody
  public Object getFontNumber() {
    return JSON.parse(fontService.getFontNumber());
  }
}
