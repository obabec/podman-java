package com.obabec.model.container.linux;

public class LinuxHugepageLimit {
   private int limit;
   private String pageSize;

   public LinuxHugepageLimit(int limit, String pageSize) {
      this.limit = limit;
      this.pageSize = pageSize;
   }

   public int getLimit() {
      return limit;
   }

   public void setLimit(int limit) {
      this.limit = limit;
   }

   public String getPageSize() {
      return pageSize;
   }

   public void setPageSize(String pageSize) {
      this.pageSize = pageSize;
   }
}
