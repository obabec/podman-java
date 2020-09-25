package com.obabec.model.container.linux;

import java.util.List;

public class LinuxNetwork {
   private int classID;
   private List<LinuxInterfacePriority> priorities;

   public LinuxNetwork(int classID, List<LinuxInterfacePriority> priorities) {
      this.classID = classID;
      this.priorities = priorities;
   }

   public int getClassID() {
      return classID;
   }

   public void setClassID(int classID) {
      this.classID = classID;
   }

   public List<LinuxInterfacePriority> getPriorities() {
      return priorities;
   }

   public void setPriorities(List<LinuxInterfacePriority> priorities) {
      this.priorities = priorities;
   }
}
