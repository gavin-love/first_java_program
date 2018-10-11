class isTaxable {
  public Boolean result(String type) {
    return type.equalsIgnoreCase("other") ? false : true;
  };
};