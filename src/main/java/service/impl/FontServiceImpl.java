package service.impl;

import com.alibaba.fastjson.JSON;
import dao.FontMapper;
import enums.IsDeletedStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.FontService;

/**
 * Created by cao.zm on 2017/7/6.
 */
@Service
public class FontServiceImpl implements FontService {
  @Autowired
  private FontMapper fontMapper;

  @Override
  public String getFontNumber() {
    int result = fontMapper.getFontNumber(IsDeletedStatus.NO_DELETE.getKey());
    return JSON.toJSONString(result);
  }
}
