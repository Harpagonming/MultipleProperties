package dao;

import org.apache.ibatis.annotations.Param;

/**
 * Created by cao.zm on 2017/6/26.
 */
public interface FontMapper {
  int getFontNumber(@Param("isDeleted") String isDeleted);
}