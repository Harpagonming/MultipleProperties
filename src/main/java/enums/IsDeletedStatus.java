package enums;

/**
 * Created by cao.zm on 2017/6/26.
 */
public enum IsDeletedStatus {
  DELETE("1", "删除"),
  NO_DELETE("0", "未删除");

  private String key;
  private String value;

  IsDeletedStatus(String key, String value) {
    this.key = key;
    this.value = value;
  }

  public String getKey() {
    return this.key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
