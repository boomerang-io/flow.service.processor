package net.boomerangplatform.model;

public class ApprovalRequest {
  private String id;
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getComments() {
    return comments;
  }
  public void setComments(String comments) {
    this.comments = comments;
  }
  public boolean isApproved() {
    return approved;
  }
  public void setApproved(boolean approved) {
    this.approved = approved;
  }
  private String comments;
  private boolean approved;

}
